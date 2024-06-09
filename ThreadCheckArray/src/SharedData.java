import java.util.ArrayList;

public class SharedData 
{
	
	private ArrayList<Integer> array;
	//private Integer[] array;//כאן שיניתי
	private boolean [] winArray;//שיניתי
	private boolean flag;
	private final int b;
	
	public SharedData(ArrayList<Integer> array, int b) {
	    this.b = 0;
		this.array = array;
	    //this.num = num;
	    this.flag = false;
	    this.winArray = new boolean[array.size()];
	}
	
	
	//public SharedData(Integer[] array, int b) // כאן שיניתי
	//{
		
		//this.array = array;
		//this.b = b;
	//}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() // כאן שיניתי
	{
		return array;
	}
	
	
	//public Integer[] getArray() // המקור
	//{
		//return array;
	//}

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
