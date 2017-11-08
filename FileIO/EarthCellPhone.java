package Projects.FileIO;

public interface EarthCellPhone {
    public void sendMessage(String languageType, char[] message, String fileName) throws InvalidLanguageException;
    public void readMessage(String languageType, String fileName);
}