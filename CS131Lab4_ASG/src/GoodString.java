
/**
 *This class creates a FileProcessor that will throw no exceptions. GoodString. txt strings are all below 5 characters in length so they are added to ArrayList
 * @author Andrew Gordon
 * @version 1.0
 * Lab 4
 * CS131ON
 *
 */

public class GoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileProcessor fp=new FileProcessor("GoodString.txt",5);
		fp.processFile();
		System.out.println(fp.getfileName());
		System.out.println(fp.getArrayListSize());
		
		
	}

}
