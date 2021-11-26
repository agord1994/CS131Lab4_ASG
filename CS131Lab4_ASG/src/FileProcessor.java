

/**
 *This class creates a FileProcessor. This class adds strings to an ArrayList that are shorter than stringLength to an ArrayList
 * @author Andrew Gordon
 * @version 1.0
 * Lab 4
 * CS131ON
 *
 */




import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String>stringList=new ArrayList<String>();
	private Scanner input;
	/**
	*
	* @param fileName the value of setfileName based on the calling method
	* @param stringLength the value of setstringLength based on the calling method
	*/

	public FileProcessor(String fileName, int stringLength) {
		setstringLength(stringLength);
		setfileName(fileName);	
	}//end constructor
	
	
	 /**
	   * returns array size of the Array List
	   * @return
	   */
	public int getArrayListSize() {
		return stringList.size();
	}//end getArrayListSize
	
	
	/**
	* This method reads a file of strings and adds only strings of stringLength or shorter to ArrayList called stringList
	*/
	
	public void processFile() {
		
		
		StringTooLongException eX=new StringTooLongException();
		
		try {
			input=new Scanner(new File(fileName));
			while(input.hasNext())
			{
				String sL=input.nextLine();
				if(sL.length()> stringLength) //if read file string length is greater than stringLength throw exception
				throw eX;	
				else {
				stringList.add(sL);
				}//end else
			}//end while loop
			
		} //end try
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		catch(StringTooLongException e) {
			System.out.println(e);
		}
		
		
	}//end processFile
	
	 /**
	   * Getter for filename
	   * @return
	   */

	public String getfileName() {
		return fileName;
	}//end getfileName
	
	
	
	
	/**
	 * Setter for fileName
	 * @param fileName
	 */
	public void setfileName(String s) {
		this.fileName=s;
		
	}//end setfileName
	
	/**
	 * Getter for sringLength
	 * @return
	*/
	public int getstringLength() {
		return stringLength;
	}//end getstringLength
	
	/**
	* Setter for stringLength
	* @param stringLength
	*/

	
	public void setstringLength(int sL) {
		if(sL>= 5) {
			this.stringLength=sL;//if int pass through setstringLEngth is greater than or equal to 5 then stringLength takes that value
		}
		else {
		this.stringLength=5;	
		}
	}//setstringLEngth
	
	   @Override
	   public String toString() {
	   return "ReadFile [fileName=" + fileName + ", stringLength=" + stringLength + "]";
	   }//end toString
	
}//end class
