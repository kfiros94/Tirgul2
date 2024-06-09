import java.util.ArrayList;

public class ThreadCheckArray implements Runnable 
{
	private boolean flag;
	private boolean [] winArray;
	SharedData sd;
	Integer[] array;//כאן שיניתי

	ArrayList<Integer> array;// השינוי החדש
	//Integer[] array;//כאן שיניתי
	int b;

	public ThreadCheckArray(SharedData sd) 
@@ -14,7 +18,8 @@ public ThreadCheckArray(SharedData sd)
			array = sd.getArray();
			b = sd.getB();
		}		
		winArray = new boolean[array.length];
		  winArray = new boolean[array.size()];
		//winArray = new boolean[array.length];
	}

	void rec(int n, int b)
@@ -26,20 +31,23 @@ void rec(int n, int b)
		}	
		if (n == 1)
		{
			if(b == 0 || b == array[n-1])
			//if(b == 0 || b == array[n-1])
			if(b == 0 || b == array.get(n-1))
			{
				flag = true;
				synchronized (sd) 
				{
					sd.setFlag(true);
				}			
			}
			if (b == array[n-1])
			if (b == array.get(n-1))
			//if (b == array[n-1])
				winArray[n-1] = true;
			return;
		}

		rec(n-1, b - array[n-1]);
		//rec(n-1, b - array[n-1]);
		rec(n-1, b - array.get(n-1));
		if (flag)
			winArray[n-1] = true;
		synchronized (sd) 
@@ -51,13 +59,21 @@ void rec(int n, int b)
	}

	public void run() {
		if (array.length != 1)
		//if (array.length != 1)
		  if (array.size() != 1)
			if (Thread.currentThread().getName().equals("thread1"))
				rec(array.length-1, b - array[array.length - 1]);
			{
				  rec(array.size()-1, b - array.get([array.size() - 1]));//יש טעות סינטקס
				//rec(array.length-1, b - array[array.length - 1]);
			}

			else 
				rec(array.length-1, b);
		if (array.length == 1)
			if (b == array[0] && !flag)
				 rec(array.size()-1, b);
				//rec(array.length-1, b);

		if (array.size() == 1)//שיניתי לסייז
			//if (b == array[0] && !flag)
			if (b == array.get(0) && !flag)
			{
				winArray[0] = true;
				flag = true;
@@ -69,7 +85,7 @@ public void run() {
		if (flag)
		{
			if (Thread.currentThread().getName().equals("thread1"))
				winArray[array.length - 1] = true;
				winArray[array.size() - 1] = true;//שיניתי לסייז
			synchronized (sd) 
			{
				sd.setWinArray(winArray);
