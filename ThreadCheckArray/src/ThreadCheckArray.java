import java.util.ArrayList; // Added import for ArrayList

public class ThreadCheckArray implements Runnable 
{
	private boolean flag;
	private boolean [] winArray;
	SharedData sd;
	ArrayList<Integer> array; // Changed int[] to ArrayList<Integer>
	int b;
	
	public ThreadCheckArray(SharedData sd) 
	{
		this.sd = sd;	
		synchronized (sd) 
		{
			array = sd.getArray(); // Changed array initialization
			b = sd.getB();
		}		
		winArray = new boolean[array.size()]; // Changed length to size()
	}
	
	void rec(int n, int b)
	{
		synchronized (sd) 
		{
			if (sd.getFlag())
				return;
		}	
		if (n == 1)
		{
			if(b == 0 || b == array.get(n-1)) // Changed array access from array[n-1] to array.get(n-1)
			{
				flag = true;
				synchronized (sd) 
				{
					sd.setFlag(true);
				}			
			}
			if (b == array.get(n-1)) // Changed array access from array[n-1] to array.get(n-1)
				winArray[n-1] = true;
			return;
		}
		
		rec(n-1, b - array.get(n-1)); // Changed array access from array[n-1] to array.get(n-1)
		if (flag)
			winArray[n-1] = true;
		synchronized (sd) 
		{
			if (sd.getFlag())
				return;
		}	
		rec(n-1, b);
	}

	public void run() {
		if (array.size() != 1) // Changed length to size()
			if (Thread.currentThread().getName().equals("thread1"))
				rec(array.size()-1, b - array.get(array.size() - 1)); // Changed length to size() and array access
			else 
				rec(array.size()-1, b); // Changed length to size()
		if (array.size() == 1) // Changed length to size()
			if (b == array.get(0) && !flag) // Changed array access from array[0] to array.get(0)
			{
				winArray[0] = true;
				flag = true;
				synchronized (sd) 
				{
					sd.setFlag(true);
				}
			}
		if (flag)
		{
			if (Thread.currentThread().getName().equals("thread1"))
				winArray[array.size() - 1] = true; // Changed length to size()
			synchronized (sd) 
			{
				sd.setWinArray(winArray);
			}	
		}
	}
}
