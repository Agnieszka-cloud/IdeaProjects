import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class MyFirstJavaProgram {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Dzisiaj zaczynam kurs");
        System.out.println("Java");
        System.out.println("w CodersLab");
        String a = " ala ma kota";
        System.out.println(a);


        // aplikacja
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // +1 bo ma być 100 a nie 99 max

        boolean isItTheRightNumber = false;
        Scanner scanner = new Scanner(System.in);

        while (!isItTheRightNumber) {
            System.out.println("Podaj liczbę");
            int userNumberProposition = scanner.nextInt();

            if (userNumberProposition < numberToGuess) {
                System.out.println("Liczna jest za mała");
            } else if (userNumberProposition > numberToGuess) {
                System.out.println("Liczna jest za duża");
            } else {
                System.out.println("To jest właściwa liczna");
                isItTheRightNumber = true;
            }
        }
    }
}


