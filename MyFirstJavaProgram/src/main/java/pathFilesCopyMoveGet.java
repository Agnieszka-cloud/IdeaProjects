import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class pathFilesCopyMoveGet {
    public static void main(String[]args ) {

        Path path = Paths.get("Ola6.txt");
        Path path1 = Paths.get("Ola7.txt");

        System.out.println(path.compareTo(path1));
        System.out.println(path.getFileName());
        System.out.println(path.getName(0));
        System.out.println(path.getNameCount());
        try {
            System.out.println(Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING));
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            Files.delete(path1);
        }catch (IOException e){
            e.printStackTrace();
        }*/
        try {
            Files.writeString(path,"abcdefghijkl",StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}