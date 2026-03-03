import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExternalFile {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            FileInputStream fis = new FileInputStream(file);
            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}