package Projects.FileIO;
import java.util.*;

public class Demo {

    public static void mainMenu() {
        System.out.println("Menu:\n" +
                "1. Send a message\n" +
                "2. Read a message\n" +
                "3. Exit");
    }

    public static void languageMenu(){
        System.out.println("Select a language:\n" +
                "1. English\n" +
                "2. Klingon\n" +
                "3. Vulcan\n" +
                "4. Ferengi\n" +
                "5. Non-fed");
    }

    public static int checkIntRange( int low, int high ) {
        Scanner in = new Scanner( System.in );
        int input = 0;
        boolean valid = false;
        //input validation
        while( !valid ) {
            if( in.hasNextInt() ) {
                input = in.nextInt();
                if( input <= high && input >=low ) {
                    valid = true;
                } else {
                    System.out.println( "Invalid Range." );
                }
            } else {
                in.next(); //clear invalid string
                System.out.println( "Invalid Input." );
            }
        }
        return input;
    }

    public static void main(String[] args) {
        EarthText et = new EarthText();
        boolean mainInvalid = true;
        Scanner in = new Scanner(System.in);

        //main menu selection
        while(mainInvalid){
            mainMenu();
            int menuInput = checkIntRange(1, 3);
            switch(menuInput){
                case 1:
                    boolean sendInvalid = true;
                    languageMenu();
                    //language selection menu
                    while(sendInvalid){
                        int langInput = checkIntRange(1, 5);
                        char[] message;
                        switch (langInput){
                            //write to earth
                            case 1:
                                System.out.println("Write message to send:");
                                message = (in.nextLine()).toCharArray();
                                et.sendMessage("Earth", message, "Earth.txt");
                                System.out.println("Sent!");
                                break;
                            //write to klingon
                            case 2:
                                System.out.println("Write message to send:");
                                message = (in.nextLine()).toCharArray();
                                et.sendMessage("Klingon", message, "Klingon.txt");
                                System.out.println("Sent!");
                                break;
                            //write to vulcan
                            case 3:
                                System.out.println("Write message to send:");
                                message = (in.nextLine()).toCharArray();
                                et.sendMessage("Vulcan", message,"Vulcan.txt");
                                System.out.println("Sent!");
                                break;
                            //write to ferengi
                            case 4:
                                System.out.println("Write message to send:");
                                message = (in.nextLine()).toCharArray();
                                et.sendMessage("Ferengi", message,"Ferengi.txt");
                                System.out.println("Sent!");
                                break;
                            //write to non-fed
                            case 5:
                                try{
                                    System.out.println("Write message to send:");
                                    message = (in.nextLine()).toCharArray();
                                    et.sendMessage("Non-fed", message,"Non-fed.txt");
                                }catch(InvalidLanguageException ile){
                                    System.out.println(ile.getMessage());
                                }
                                break;
                            default:
                                break;
                        }
                        sendInvalid = false;
                    }
                    break;
                case 2:
                    boolean readInvalid = true;
                    languageMenu();
                    while(readInvalid){
                        int langInput = in.nextInt();
                        switch (langInput){
                            //read from earth
                            case 1:
                                System.out.println("Reading message....");
                                et.readMessage("Earth", "Earth.txt");
                                break;
                            //read from klingon
                            case 2:
                                System.out.println("Reading message....");
                                et.readMessage("Klingon", "Klingon.txt");
                                break;
                            //read from vulcan
                            case 3:
                                System.out.println("Reading message....");
                                et.readMessage("Vulcan", "Vulcan.txt");
                                break;
                            //read from ferengi
                            case 4:
                                System.out.println("Reading message....");
                                et.readMessage("Ferengi", "Ferengi.txt");
                                break;
                            case 5:
                                System.out.println("Exit");
                                readInvalid = false;
                                break;
                            default:
                                break;
                        }
                        readInvalid = false;
                    }
                    break;
                case 3:
                    System.out.println("Goodbye.");
                    mainInvalid = false;
                    break;
                default:
                    break;
            }
        }
    }
}