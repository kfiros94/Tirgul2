import java.util.ArrayList;

<<<<<<< HEAD


/**Class SharedData encapsulate and manage a collection of shared data between two threads
 *@author Israel Ohayon
 *@author Kfir Amoyal
 *@version 9/06/2024
 */
public class SharedData 
{
	

	/**store a collection of Integer objects.**/
	private ArrayList<Integer> array;
	/**array of the winning thread numbers.**/
	private boolean [] winArray;
	/**flag that indicates that the other thread is the winner.**/
=======
public class SharedData 
{
	
	private ArrayList<Integer> array;
	//private Integer[] array;//כאן שיניתי
	private boolean [] winArray;//שיניתי
>>>>>>> 25e969df2feec5e2cd76398da2dce8112bdefb65
	private boolean flag;
	/**The number that we search a sub series equals to it **/
	private final int b;
	
<<<<<<< HEAD
=======
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
>>>>>>> 25e969df2feec5e2cd76398da2dce8112bdefb65

	/**
	 * Constructor for the SharedData class.
	 * This initializes the shared data structure with the provided ArrayList of integers and an integer b.
	 * The integer b is currently set to 0 within the constructor.
	 * The winArray is initialized with the size of the provided ArrayList, and the flag is set to false.
	 *
	 * @param array an ArrayList of Integer objects to be managed by this SharedData object.
	 * @param b an integer value.
	 */
	public SharedData(ArrayList<Integer> array, int b) 
	{
	    this.b = 0;
		this.array = array;
	    this.flag = false;
	    this.winArray = new boolean[array.size()];
	}
	
	
	/**
	 * Gets the boolean array winArray.
	 * The winArray is used to keep track of specific conditions for the Integer objects
	 * managed by this SharedData object.
	 *
	 * @return the boolean array winArray, which indicates certain conditions for the integers in the array.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the boolean array winArray.
	 * The winArray is used to keep track of specific conditions for the Integer objects
	 * managed by this SharedData object.
	 *
	 * @param winArray the new boolean array to set. This array should indicate certain conditions
	 *                 for the integers in the array managed by this SharedData object.
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

<<<<<<< HEAD
	
	/**
	 * Gets the ArrayList of Integer objects.
	 * This method returns the collection of integers managed by this SharedData object.
	 *
	 * @return the ArrayList of Integer objects.
	 */
	public ArrayList<Integer> getArray() 
=======
	public ArrayList<Integer> getArray() // כאן שיניתי
>>>>>>> 25e969df2feec5e2cd76398da2dce8112bdefb65
	{
		return array;
	}
	
	
<<<<<<< HEAD
	
	 /**
     * Gets the final integer b.
     *
     * @return the integer b.
     */
=======
	//public Integer[] getArray() // המקור
	//{
		//return array;
	//}

>>>>>>> 25e969df2feec5e2cd76398da2dce8112bdefb65
	public int getB() 
	{
		return b;
	}

	
	/**
     * Gets the flag indicating a specific condition between threads.
     *
     * @return the flag.
     */
	public boolean getFlag() 
	{
		return flag;
	}

	
	 /**
     * Sets the flag to the specified value.
     *
     * @param flag the new value of the flag.
     */
	public void setFlag(boolean flag) 
	{
		this.flag = flag;
	}

}