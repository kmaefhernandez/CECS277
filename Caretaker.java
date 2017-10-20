package IceCreamCone;
import java.io.*;

public class Caretaker {

    //File is overwritten each time method is called??
    public void addMemento(Memento m){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("IceCreamList.dat"));
            out.writeObject(m);
            out.close();


        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
        }catch(IOException e){
            System.out.println("Error1");
        }
    }

    public Memento getMemento(String flavor){
        Memento m = null;
        try{
//            System.out.println("inside try\n");
            boolean invalidFlavor = true;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("IceCreamList.dat"));
            m = (Memento)in.readObject();
            while(invalidFlavor){
//                System.out.println("inside while\n");
                if(m.getFlavor() != flavor){
//                    System.out.println("flavor does not match\n");
                    System.out.println(m.getFlavor());
                    m = (Memento) in.readObject();
                }else{
//                    System.out.println("flavor matches\n");
                    invalidFlavor = true;
                }
            }

        }catch(FileNotFoundException fnf){
            System.out.println("File was not found.");
        }catch(IOException e){
            System.out.println("Error2");
        }catch(ClassNotFoundException cnf){
            System.out.println("Class not found.");
        }
        return m;
    }
}
