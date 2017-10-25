package IceCreamCone;
import java.io.*;

public class Caretaker{
    private ObjectOutputStream oos = null;

    Caretaker() throws IOException {
        oos = new ObjectOutputStream(new FileOutputStream("IceCreamList.ser"));
    }

    public void addMemento(Memento m) throws IOException{
        oos.writeObject(m);
    }

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
