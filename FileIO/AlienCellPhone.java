/* Jon Ham
 * Kristen Mae Hernandez
 * November 9, 2017
 * Purpose: The purpose of this program is to create and hold the
 * methods that will be used in for the AlienCellPhone class.
 */
package Projects.FileIO;

/**
 * AlienCellPhone utilizes a different language that is not English.
 * It is able to send and receive texts while also translating it into
 * another language. 
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public interface AlienCellPhone {
    /**
     * Sends a text
     * @param languageType The type of language being used
     * @param fileName Name of the file being used
     */
	public void sendText(String languageType, String fileName); //don't implement
    
	/**
	 * Reads a text
	 * @param languageType The type of language being used
	 * @param fileName 
	 */
	public void readText(String languageType, String fileName);
    
	/**
	 * Translates the language of the text
	 * @param languageType The type of language being used
	 * @param message The text message
	 * @param fileName Name of the file being used
	 */
	public void translateText(String languageType, char[] message, String fileName);
}
