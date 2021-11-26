
/**
 *This class creates a FileProcessor that will create a StringTooLongException
 * @author Andrew Gordon
 * @version 1.0
 * Lab 4
 * CS131ON
 *
 */


public class BadString{
  
  public static void main(String[] args){
    	//initializes and instantiates FileProcessor
    	FileProcessor fp = new FileProcessor("BadString.txt",10);
		fp.setstringLength(3);//returns 5 
		  fp.processFile();
		 //prints arrayList size should be 1
		  System.out.println(fp.getArrayListSize()); 
		  
		  
  }//end main
  
}//end class