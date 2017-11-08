/* Jon Ham
 * Kristen Mae Hernandez
 * November 8, 2017
 * Purpose: The purpose of this program is to adapt one language to
 * another language.
 */
package Projects.FileIO;

/**
 * This program implements the EarthCellphone interface. It adapts a
 * foreign language to English.
 * @author Kristen Mae Hernandez
 * @author Jon Ham
 */
public class LanguageAdapter implements EarthCellPhone{
    AlienCellPhone alienCellPhone;

    public LanguageAdapter(String languageType){
        alienCellPhone = new AlienText(languageType);
    }

    /**
     * Translates the alien language to English
     * @param languageType The type of language
     * @param message The text message
     * @param fileName The name of the file
     * @throws InvalidLanguageException An invalid language exception
     */
    @Override
    public void sendMessage(String languageType, char[] message, String fileName) throws InvalidLanguageException {
        //calling implemented sendMessage on adapter will call translateText for alien language
        alienCellPhone.translateText(languageType, message, fileName);
    }

    /**
     * Reads the text message of an alien language
     * @param languageType The type of language
     * @param fileName The name of the file
     */
    @Override
    public void readMessage(String languageType, String fileName){
        //calling implemented readMessage on adapter will call readText for alien language
        alienCellPhone.readText(languageType, fileName);
    }
}
