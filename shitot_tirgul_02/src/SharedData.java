import java.util.ArrayList;

/**class SharedData
 * this class is used to share data between threads
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	
	/**the SharedData constructor
	 * @param array is the list of integers to be shared among threads
	 * @param b is the number to be checked during thread execution
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		this.array = array;
		this.b = b;
	}

	/**
	 * returns the boolean result array used by threads
	 * @return the array of boolean values
	 */
	public boolean[] getWinArray()
	{
		return winArray;
	}

	/**
	 * sets the boolean result array used by threads
	 * @param winArray is an array of boolean values
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * returns the list of integers
	 * @return array is the array of numbers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	
	/**
	 * returns the target number to be checked
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	
	/**
	 * returns the current value of flag used to synchronize the threads
	 * @return true if the flag is set; false otherwise
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	
	/**
	 * sets the synchronization flag
	 * @param flag the new value of the flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
