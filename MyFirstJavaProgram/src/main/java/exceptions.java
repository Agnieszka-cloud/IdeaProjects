public class exceptions {
    // nazwy pakietów np.:  pl.coderslab;
    //                      java.lang
    public static void main (String [] args ){
        try {
            printMessage(null);
            System.out.println("Message successfully printed");
        } catch (IllegalArgumentException e){
            System.out.println("Message is null");
        }
    }
    public static void printMessage(String message) {
        if (message == null ) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(message);
        }
    }
}
