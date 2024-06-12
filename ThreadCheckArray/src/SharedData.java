import java.util.ArrayList; // Added import for ArrayList

public class SharedData 
{
	private ArrayList<Integer> array; // Changed int[] to ArrayList<Integer>
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) { // Changed int[] to ArrayList<Integer>
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray()  // Changed return type from int[] to ArrayList<Integer>
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}

