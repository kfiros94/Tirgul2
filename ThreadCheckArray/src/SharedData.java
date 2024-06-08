public class SharedData 
{
	private Integer[] array;//כאן שיניתי
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	public SharedData(Integer[] array, int b) // כאן שיניתי
	{
		
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

	public Integer[] getArray() // כאן שיניתי
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
