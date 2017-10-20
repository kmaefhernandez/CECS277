package IceCreamCone;
import java.io.*;
import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> mArr = new ArrayList<Memento>();
    public void addMemento(Memento m){

        try{
            FileOutputStream fout = new FileOutputStream("IceCreamList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            mArr.add(m); //add memento to array
            oos.writeObject(mArr); //write entire array to file
            oos.close();
            fout.close();

        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
            fnf.printStackTrace();
        }catch(IOException e){
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    public Memento getMemento(String flavor){
        ArrayList<Memento> m = new ArrayList<Memento>();
        int i = 0;
        try{
            FileInputStream fin = new FileInputStream("IceCreamList.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            m = (ArrayList<Memento>)ois.readObject(); //read in and convert object to memento array
            for(int j = 0; j < m.size(); j++){ //iterate through array
                if(m.get(j).getFlavor().equals(flavor)){ //check flavor
                    i = j; //get index of chosen flavor memento
                }
            }
            ois.close();
            fin.close();
        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
            fnf.printStackTrace();
        }catch(IOException e){
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }catch(ClassNotFoundException cnf){
            System.out.println("Class not found.");
            cnf.printStackTrace();
        }
        return m.get(i);
    }
}
