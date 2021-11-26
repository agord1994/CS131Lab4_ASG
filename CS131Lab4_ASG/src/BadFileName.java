

/**
 *This class creates a FileProcessor that will create a FileNotFoundException
 * @author Andrew Gordon
 * @version 1.0
 * Lab 4
 * CS131ON
 *
 */




//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args){
    
    FileProcessor fp = new FileProcessor("String1.txt",10);// String1.txt is not a valid .txt file
		fp.processFile();
		
  }//end main
  
}//end class