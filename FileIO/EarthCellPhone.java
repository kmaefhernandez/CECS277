/* Jon Hame
 * Kristen Mae Hernandez
 * November 9, 2017
 * Purpose: The purpose of this program is to declare the methods that
 * will be used in the EarthText class 
 */
package Projects.FileIO;

/**
 * Uses the English Language. It is able to send and read messages.
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public interface EarthCellPhone {
    /**
     * Sends a text messages
     * @param languageType The type of language
     * @param message The text message
     * @param fileName The name of the file
     * @throws InvalidLanguageException An Invalid Language Exception
     */
	public void sendMessage(String languageType, char[] message, String fileName) throws InvalidLanguageException;
    
	/**
	 * Reads text messages
	 * @param languageType The type of language
	 * @param fileName The name of the file
	 */
	public void readMessage(String languageType, String fileName);
}
