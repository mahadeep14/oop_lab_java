import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class Simplefile {
    public static void main(String[] args) {
        try {
            File u = new File("s.txt");  // creates file object
            FileWriter o = new FileWriter(u); // link writer to file

            o.write("Pain_01");
            o.close();

            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}