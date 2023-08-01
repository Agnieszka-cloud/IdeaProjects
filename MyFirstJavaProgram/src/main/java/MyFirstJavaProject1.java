import javax.management.StringValueExp;

public class MyFirstJavaProject1 {
    //private static Object StringValueExp;

    public static void main(String[] args) {
        int multiplied = multiply(3, 8);
        System.out.println(multiplied);
        System.out.println(mnożenie(7,9));
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int mnożenie (int a, int b){

        return a * b;
    }

}
