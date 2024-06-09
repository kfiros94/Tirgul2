import java.util.ArrayList;

public class SharedData 
{
	private Integer[] array;//כאן שיניתי
	private boolean [] winArray;

	private ArrayList<Integer> array;
	//private Integer[] array;//כאן שיניתי
	private boolean [] winArray;//שיניתי
	private boolean flag;
	private final int b;

	public SharedData(Integer[] array, int b) // כאן שיניתי
	{

	public SharedData(ArrayList<Integer> array, int b) {
	    this.b = 0;
		this.array = array;
		this.b = b;
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
@@ -22,10 +35,16 @@ public void setWinArray(boolean [] winArray)
		this.winArray = winArray;
	}

	public Integer[] getArray() // כאן שיניתי
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