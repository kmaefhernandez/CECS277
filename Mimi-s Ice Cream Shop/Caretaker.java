/* Jon Ham
 * Kristen Mae Hernandez
 * October 26, 2017
 * Purpose: The purpose of this program is to keep track of Memento
 * objects to a file.
 */
package IceCreamCone;
import java.io.*;

/**
 * The Caretaker class keeps track of Memento objects. It holds the data that
 * the Originator/AdvancedIceCreamCone wants to save of if need to restore.
 * @author Jon Ham
 * @author Kristen Mae Hernandez
 */
public class Caretaker{
    private ObjectOutputStream oos = null;

    /**
     * Default Constructor
     * @throws IOException input/output exception
     */
    public Caretaker() throws IOException {
        oos = new ObjectOutputStream(new FileOutputStream("IceCreamList.ser"));
    }

    /**
     * Adds a memento to the file
     * @param m memento
     * @throws IOException input/output exception
     */
    public void addMemento(Memento m) throws IOException{
        oos.writeObject(m);
    }

    /**
     * Gets a previously saved memento from the file
     * @param flavor ice cream cone flavor
     * @return a memento
     * @throws IOException input/output exception
     */
    public Memento getMemento(String flavor) throws IOException{
        Memento m = null;
        oos.close();

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IceCreamList.ser"));

            do{ // read in memento until correct flavor (chocolate)
                m = (Memento) ois.readObject();
            }while(!m.getFlavor().equals(flavor));


        }catch(EOFException eof){
            eof.printStackTrace();
            return m;
        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
            fnf.printStackTrace();
        }catch(ClassNotFoundException cnf){
            System.out.println("Class not found.");
            cnf.printStackTrace();
        }

        return m;
    }
}
