/* Jon Ham
 * Kristen Mae Hernandez
 * November 8, 2017
 * Purpose: The purpose of this program is to handle invalid 
 * language exceptions.
 */
package Projects.FileIO;

/**
 * This program extends the IllegalArgumentException and is used to
 * handle invalid language exceptions.
 * @author Kristen Mae Hernandez
 * @author Jon Ham
 */
public class InvalidLanguageException extends IllegalArgumentException {
    
	/** Default Constructor */
	public InvalidLanguageException(){

    }
	
	/**
	 * Overloaded Constructor
	 * @param message the message to inform the user of the exception error
	 */
    public InvalidLanguageException(String message){
        super(message);
    }
}
