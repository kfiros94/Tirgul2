import java.util.ArrayList; // Added import for ArrayList
import java.util.Scanner;

public class TestThreadCheckArray {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			Thread thread1, thread2;
			System.out.println("Enter array size");
			int num  = input.nextInt();
			ArrayList<Integer> array = new ArrayList<>(num); // Changed int[] to ArrayList<Integer>
			System.out.println("Enter numbers for array");
			
			for (int index = 0; index < num; index++) 
				array.add(input.nextInt()); // Changed array[index] = input.nextInt() to array.add(input.nextInt())
			
			System.out.println("Enter number");
			num = input.nextInt();
			
			SharedData sd = new SharedData(array, num); // Changed parameter type from int[] to ArrayList<Integer>
			
			thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
			thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
			thread1.start();
			thread2.start();
			try 
			{
				thread1.join();
				thread2.join();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if (!sd.getFlag())
			{
				System.out.println("Sorry");
				return;
			}
			System.out.println("Solution for b : " + sd.getB() + ",n = " + sd.getArray().size()); // Changed length to size()
			System.out.print("I:    ");
			for(int index = 0; index < sd.getArray().size(); index++) // Changed length to size()
				System.out.print(index + "    ");
			System.out.println();
			System.out.print("A:    ");
			for(int val : sd.getArray()) // Changed array iteration
				System.out.print(val + "    ");
			System.out.println();
//			//System.out.print("B:    ");
//			int counter = 0;
//			for (int index = sd.getB(); index != 0; index /= 10)
//				counter++;
//			for (int index = 0; index < sd.getArray().size(); index++) // Changed length to size()
//			{
//				System.out.print(sd.getArray().get(index)); // Changed array access from array[index] to array.get(index)
//				for (int i = sd.getArray().get(index); i != 0; i /= 10) // Changed array access from array[index] to array.get(index)
//					counter--;
//				if (counter == 0)
//					break;
//				System.out.print(" ");
//			}
//			System.out.println();
			System.out.print("C:    ");
			for (boolean index : sd.getWinArray())
			{
				if (index)
					System.out.print("1    ");
				else
					System.out.print("0    ");	
			}
		}
	}
}

