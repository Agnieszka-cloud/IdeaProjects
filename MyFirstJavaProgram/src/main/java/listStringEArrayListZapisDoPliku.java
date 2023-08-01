import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listStringEArrayListZapisDoPliku {
    public static void main(String[] args) {
        writeToFile("zapisdopliku.txt");
    }
    public static void writeToFile(String fileName) {
        Path path = Paths.get(fileName);
        List<String> list = new ArrayList<>();

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj tekst do zapisu w pliku:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
                Files.write(path, list);
                if (line.equals("quit")) {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}