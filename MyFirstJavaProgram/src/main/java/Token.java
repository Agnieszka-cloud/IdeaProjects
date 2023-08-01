import java.util.Arrays;

public class Token {
    public static void main(String[]agrs){
        String str = "   To jest  tekst do   ";
        System.out.println(countTokens(str));
        String str2 = " To jest. \ttekst do ";
        System.out.println(countTokens(str2));
    }

    public static int countTokens(String str) {
        // \W jakikolwiek znak, który nie jest używany w słowach [^a-zA-Z)-9]
        String[] split = str.trim().split("\\W");
        int count = 0;
        for (String word : split) {
            System.out.print(word + ",");
            if (word.length() > 0) {
                count++;
            }
        }
        return count;
    }
}



