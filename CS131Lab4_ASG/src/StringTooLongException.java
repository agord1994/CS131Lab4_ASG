

/**
 *This class creates a StringTooLongException that will read "Srting is too Long!" if thrown in other classes
 * @author Andrew Gordon
 * @version 1.0
 * Lab 4
 * CS131ON
 *
 */


public class StringTooLongException extends Exception{
	
	public StringTooLongException() {
		super("String is too Long!");
		
	}
	

}//end class
