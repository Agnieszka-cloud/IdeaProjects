public class main3homoworkexceptions {

    public static void main(String[] args) {
        try {
            System.out.println(getLength(null));
        } catch (NullPointerException e) {
            System.out.println("Argument nie istnieje");
            e.printStackTrace();
        }
    }
    public static int getLength(String str) {
        return str.length();
    }
}
