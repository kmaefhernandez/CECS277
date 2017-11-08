package Projects.FileIO;
import java.io.*;
import java.util.*;

public class AlienText implements AlienCellPhone {
    private String languageType;

    public AlienText(String languageType){
        this.languageType = languageType;
    }

    @Override
    public void sendText(String languageType, String fileName){
        //no need to send
    }

    @Override
    public void readText(String languageType, String fileName){
        //read alien text from file
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

    @Override
    public void translateText(String languageType, char[] message, String fileName){
        //translate english to alien text
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
