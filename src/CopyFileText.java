import java.io.*;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/26/2020
 * Time: 10:31 AM
 */
public class CopyFileText {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập đường dẫn đến tập tin nguồn: ");
            File sourceFile = new File(input.nextLine());
            if (sourceFile.exists()) {
                System.out.println("Nhập đường dẫn đến tập tin đích: ");
                File targetFile = new File(input.nextLine());
                if (targetFile.exists()) {
                    System.out.println("Tập tin đích đã tồn tại!");
                } else {
                    inputStream = new FileInputStream(sourceFile);
                    outputStream = new FileOutputStream(targetFile);
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = inputStream.read(buffer)) > 0) {
                        outputStream.write(buffer, 0, length);
                    }
                    inputStream.close();
                    outputStream.close();
                }
            } else {
                System.err.println("Đường dẫn đến tập tin nguồn không tồn tại!");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
