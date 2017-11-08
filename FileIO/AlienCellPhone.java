package Projects.FileIO;

public interface AlienCellPhone {
    public void sendText(String languageType, String fileName); //don't implement
    public void readText(String languageType, String fileName);
    public void translateText(String languageType, char[] message, String fileName);
}