import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception4 {
    public static void main (String[] args){
        //try{
            /*String firstLine = readFirstLine("text.txt");
            System.out.println(firstLine);*/
        //}catch (FileNotFoundException e){
            //System.out.println("Nie odnaleziono pliku");
        //}
    }
    public static String readFirstLine (String str)
            throws FileNotFoundException {
        File file = new File(str);
        Scanner scanner  = new Scanner(file);
        return scanner.nextLine();
    }
}
