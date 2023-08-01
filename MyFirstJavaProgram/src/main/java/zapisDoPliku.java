
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class zapisDoPliku {
    public static void main(String [] args ){
        try(FileWriter fileWriter = new FileWriter("zapisdopliku.txt", true)){
            fileWriter.append("szafas\n");
            fileWriter.append('e');
        }catch (IOException e){
            e.printStackTrace();
        }
        File dir = new File("newDir");
        dir.mkdir();
        File dirs = new File("newDirs/abc/def");
        dirs.mkdirs();
        File dirss = new File("newDirs");
        String [] dirNames = dirss.list();
        System.out.println(Arrays.toString(dirNames));
    }
}
