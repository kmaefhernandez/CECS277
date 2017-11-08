package Projects.FileIO;

public class LanguageAdapter implements EarthCellPhone{
    AlienCellPhone alienCellPhone;

    public LanguageAdapter(String languageType){
        alienCellPhone = new AlienText(languageType);
    }

    @Override
    public void sendMessage(String languageType, char[] message, String fileName) throws InvalidLanguageException {
        //calling implemented sendMessage on adapter will call translateText for alien language
        alienCellPhone.translateText(languageType, message, fileName);
    }

    @Override
    public void readMessage(String languageType, String fileName){
        //calling implemented readMessage on adapter will call readText for alien language
        alienCellPhone.readText(languageType, fileName);
    }
}
