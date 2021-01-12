package task_A;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainA {

    public static void main(String[] args){

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("kyz.txt");
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        try {
            fileReader.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
