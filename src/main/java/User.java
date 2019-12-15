import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class User{
    String fileName = "Names.txt";
    String name;
    Scanner scan = new Scanner(System.in);
    Scanner scan1 = new Scanner(System.in);
    boolean moreNames = true;


    public void addNameToFile() {

        try {
            PrintWriter addNameToFile = new PrintWriter("Names.txt");
            while (moreNames = true) {
                System.out.println("Podaj imię ");
                String name = scan.nextLine();
                addNameToFile.write(name + "\n");
                System.out.println("Czy chciałbyś dodać więcej imion? (Wpisz >>Tak<< jeśli chcesz kontyunować)");
                String continueApp = scan1.nextLine().toUpperCase();

                if (continueApp.equals("TAK")) {
                    moreNames = true;
                } else {
                    moreNames = false;
                    System.out.println("Zakończenie programu");
                    break;
                }
            }


            addNameToFile.close();
        }
        catch (IOException e) {
            System.out.println("Error!");
        }
    }


}
