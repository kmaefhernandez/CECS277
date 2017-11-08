package Projects.FileIO;
import java.io.*;
import java.util.*;

public class EarthText implements EarthCellPhone {
    LanguageAdapter languageAdapter;

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

    @Override
    public void readMessage(String languageType, String fileName){
        //read message to file if english
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
