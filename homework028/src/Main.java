import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myFile = new File("text.txt");
            long len = myFile.length();

        } catch (IllegalStateException exception) {
            System.out.println("Код слишком большой");
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("withoutChar.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileReader);
        String text = new String(scanner);
        fileWriter.write(text.replace(' ', '')); // пытался пробелы " " заменить пробелы на непробелы "", но получился
    }
}
