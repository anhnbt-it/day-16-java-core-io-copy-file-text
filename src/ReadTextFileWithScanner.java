import java.io.*;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/26/2020
 * Time: 9:26 AM
 */
public class ReadTextFileWithScanner {
    public static void main(String[] args) {
        try {
            File myObj = new File("data/source-file.txt");
            if (myObj.exists()) {
                System.out.println("File name: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
                System.out.println("Wrtieable: " + myObj.canWrite());
                System.out.println("Readable: " + myObj.canRead());
                System.out.println("File size in bytes: " + myObj.length());
            } else {
                System.out.println("The file does not exits.");
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
