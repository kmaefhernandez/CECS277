/* Kristen Mae Hernandez
 * Jon Ham
 * November 9, 2017
 * Purpose: The purpose of this program is to create an EarthText which
 * translates a text from another language into English if it is not already
 * English.
 */
package Projects.FileIO;
import java.io.*;
import java.util.*;

/**
 * This program implements the EarthCellphone interface which can read, send, and translate text
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */

public class EarthText implements EarthCellPhone {
    LanguageAdapter languageAdapter;

    /**
     * Sends a text message to the file if it is in English
     * @param languageType The type of language
     * @param message The text message
     * @param fileName The name of the file
     * @throws InvalidLanguageException An Invalid Language Exception
     */
    @Override
    public void sendMessage(String languageType, char[] message, String fileName) throws InvalidLanguageException{
        //send message to file if english
        if(languageType.equalsIgnoreCase("earth")){
            try{
                PrintWriter write = new PrintWriter(new File(fileName));
                write.print(message);
                write.close();
            }catch(FileNotFoundException fnf){
                System.out.println("File not found.");
            }
            //need adapter to use sendMessage function for alien language
        }else if(languageType.equalsIgnoreCase("vulcan") || languageType.equalsIgnoreCase("ferengi") || languageType.equalsIgnoreCase("klingon")){
            languageAdapter = new LanguageAdapter(languageType);
            languageAdapter.sendMessage(languageType, message, fileName);
        }else{
            throw new InvalidLanguageException("Error: unknown language");
        }
    }

    /**
     * Reads a message from the file if it is in English
     * @param languageType The type of language
     * @param fileName The name of the file
     */
    @Override
    public void readMessage(String languageType, String fileName){
        //read message from file if english
        if(languageType.equalsIgnoreCase("earth")){
            try{
                Scanner in = new Scanner(new File(fileName));
                while(in.hasNextLine()){
                    System.out.println(in.nextLine());
                }
                in.close();
            }catch(FileNotFoundException fnf){
                System.out.println("File not found.");
            }
            //need adapter to use readMessage function for alien language
        }else if(languageType.equalsIgnoreCase("vulcan") || languageType.equalsIgnoreCase("ferengi") || languageType.equalsIgnoreCase("klingon")){
            languageAdapter = new LanguageAdapter(languageType);
            languageAdapter.readMessage(languageType, fileName);
        }else{
            throw new InvalidLanguageException("Unknown language");
        }
    }
}
