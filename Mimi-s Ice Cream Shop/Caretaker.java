package IceCreamCone;
import java.io.*;
import java.util.ArrayList;

public class Caretaker {
    public void addMemento(ArrayList<Memento> list){
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new FileOutputStream("IceCreamList.ser"));
            for (Memento m : list){
                oos.writeObject(m); //writing individual objects to file. NOT the entire arrayList itself
            }

        }catch (IOException ioException) {
            System.err.println("Error opening file.");
            ioException.printStackTrace();
        }finally{
            try{
                if(oos != null){
                    oos.close();
                }
            }catch(IOException e){
                System.out.println("Error closing file.");
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Memento> getMemento(String flavor){
        ArrayList<Memento> mArr = new ArrayList<Memento>();
        ObjectInputStream ois = null;
        Memento m = null;
        try{
            ois = new ObjectInputStream(new FileInputStream("IceCreamList.ser"));
            while(true){
                m = (Memento) ois.readObject();
                mArr.add(m); //adding all memento objects back to arrayList.
            }
        }catch (EOFException eofException) {
            return mArr;
        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
            fnf.printStackTrace();
        }catch(IOException e){
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }catch(ClassNotFoundException cnf){
            System.out.println("Class not found.");
            cnf.printStackTrace();
        }finally{
            try{
                if (ois != null) {
                    ois.close();
                }
            }catch(IOException e){
                System.out.println("Error reading from file.");
                e.printStackTrace();
            }
        }
        return mArr;
    }
}
