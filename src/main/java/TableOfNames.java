import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class TableOfNames {

    public static void main(String[] args) throws IOException {
        String fileName = "DataOfUsers.txt";
        Scanner scan = new Scanner(System.in);
        String name;
        List<String> names = new ArrayList<String>();

        PrintWriter printWriter = new PrintWriter(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);


        for (; ; ) {
            System.out.println("Proszę podaj imię i nazwisko (Jeśli chcesz zakończyć program wciśnij enter)");
            name = scan.nextLine();
            names.add(name);
            printWriter.write(name + "\n");


            if (name.isEmpty()) {
                printWriter.close();
                String read = reader.readLine();
                while (read != null) {
                    read = reader.readLine();
                    reader.close();
                    for(String namee : names) {
                        System.out.println(namee);
                        }
                                    }
                    break;
            }
                    }

        }
    }









