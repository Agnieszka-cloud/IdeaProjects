import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tryWithResources {
    public static void main(String [] args) {
        PrintWriter printWriter = null;
        try{
            Scanner scanner = new Scanner(new File("Ola6.txt"));
            printWriter = new PrintWriter("Ola3.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                printWriter.println(line);
                System.out.println(line);
                printWriter.write(line + "\n");
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        /*try {
            printWriter = new PrintWriter("Ola3.txt");
            printWriter.println(8);
            printWriter.println(9);
        } catch (FileNotFoundException e) {
            e.printStackTrace();*/
        finally {
            if(printWriter != null)
                printWriter.close();
        }
    }
}
