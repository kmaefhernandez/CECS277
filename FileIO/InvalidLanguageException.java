package Projects.FileIO;

public class InvalidLanguageException extends IllegalArgumentException {
    public InvalidLanguageException(){

    }
    public InvalidLanguageException(String message){
        super(message);
    }
}
