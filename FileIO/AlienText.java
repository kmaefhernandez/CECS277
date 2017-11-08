/* Jon Ham
 * Kristen Mae Hernandez
 * November 9, 2017
 * Purpose: The purpose of this class is to create an AlienText.
 * An AlienText is not in standard English, it's in a foreign language.
 */
package Projects.FileIO;
import java.io.*;
import java.util.*;

/**
 * 
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public class AlienText implements AlienCellPhone {
    private String languageType;

    /** Default Constructor
     * @param languageType The type of language
     */
    public AlienText(String languageType){
        this.languageType = languageType;
    }

    /**
     * Sends a text
     */
    public void sendText(String languageType, String fileName){
        //no need to send
    }

    /**
     * Reads an alien text from file
     * @param languageType the type of the language
     * @param fileName The name of the file being used
     */
    public void readText(String languageType, String fileName){
        try{
            Scanner in = new Scanner(new File(fileName));
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }catch(FileNotFoundException fnf){
            System.out.println("File not found.");
        }
    }

    /**
     * Translates English to Alien text
     * @param languageType The type of language
     * @param message The text message
     * @param fileName The name of the file being used
     */
    public void translateText(String languageType, char[] message, String fileName){

    	try{
            if(languageType.equalsIgnoreCase("klingon")){
                System.out.println("Translating to Klingon...");
                //algorithm to translate english to klingon
                for(int i = 0; i < message.length-1; i++){
                    char temp = message[i];
                    char c1 = message[i++];
                    message[i] = c1;
                    message[i++] = temp;
                }
                //write to file
                PrintWriter write = new PrintWriter(new File(fileName));
                write.println(message);
                write.close();
            }else if(languageType.equalsIgnoreCase("vulcan")){
                System.out.println("Translating to Vulcan...");
                //algorithm to translate english to vulcan
                for(int i = 0; i < message.length-1; i++){
                    char temp = message[(i*message.length+1) % message.length];
                    char c1 = message[i++];
                    message[i] = c1;
                    message[i++] = temp;
                }
                //write to file
                PrintWriter write = new PrintWriter(new File(fileName));
                write.println(message);
                write.close();
            }else if(languageType.equalsIgnoreCase("ferengi")){
                System.out.println("Translating to Ferengi...");
                //algorithm to translate english to ferengi
                for(int i = 0; i < message.length-1; i++){
                    char temp = message[(((int)Math.pow((double)i, 2.0) + 22) % message.length)];
                    char c1 = message[i++];
                    message[i] = c1;
                    message[i++] = temp;
                }
                //write to file
                PrintWriter write = new PrintWriter(new File(fileName));
                write.println(message);
                write.close();
            }else{
                //if non-fed language, throw custom exception
                throw new InvalidLanguageException("Unknown language");
            }

        }catch(FileNotFoundException fnf){
            System.out.println("File not found.");
        }
    }
}
