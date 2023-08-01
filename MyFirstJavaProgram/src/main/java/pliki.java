import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pliki {
    public static void main(String [] args ){
        File file = new File("/home/user/IdeaProjects/MyFirstJavaProgram/src/main/java/readOla.txt");
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine() + "\n");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }
}
