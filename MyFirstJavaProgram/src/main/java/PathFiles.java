import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PathFiles {
    public static void main(String[]args ) {

        Path path = Paths.get("Ola6.txt");
        Path path1 = Paths.get("Ola7.txt");

        try {
            System.out.println(Files.move(path, path1));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        System.out.println(Files.isSymbolicLink(path));

        try {
            for (String line : Files.readAllLines(path1)) {
                System.out.println(line);
                List<String> outList = new ArrayList<>();
                outList.add(line);
                Files.write(path, outList);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
