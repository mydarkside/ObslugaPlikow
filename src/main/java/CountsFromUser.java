import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class CountsFromUser {

        String fileName = "Liczby.txt";
        boolean moreCount = true;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        User user = new User();


        public void doYouWantAddWelcome() {
            System.out.println("Witaj, proszę podaj liczby, program wpisze liczby do pliku.");


        }

        public void doYouWantAdd() {

            try {
                FileWriter addToFileEveryLine = new FileWriter(fileName);


                while (moreCount = true) {
                    System.out.print("Podaj liczbę ");
                    int count = scan.nextInt();
                    addToFileEveryLine.write(count + "\n");

                    System.out.println("Czy chciałbyś dodać więcej liczb? (Wpisz >>Tak<< jeśli chcesz kontyunować)");
                    String continueApp = scan1.nextLine().toUpperCase();

                    if (continueApp.equals("TAK")) {
                        moreCount = true;
                    } else {
                        moreCount = false;
                        System.out.println("Zakończenie programu");
                        break;
                    }

                }
                addToFileEveryLine.close();
            }
                 catch(IOException e){
                        System.out.println("Error!");
                    }

            }
        }







