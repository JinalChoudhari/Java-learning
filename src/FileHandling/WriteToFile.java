package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Learning Java File Handling");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
