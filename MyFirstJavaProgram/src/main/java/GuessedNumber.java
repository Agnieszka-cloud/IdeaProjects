import java.util.Random;
import java.util.Scanner;

public class GuessedNumber {
    public static void main (String[] args) {
        Random random = new Random();
        int numberChosenByTheComputerBetweenOneAndHundret = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        boolean isItTheRightNumber = false;
        while (!isItTheRightNumber) { //while czyli "dopóki"
            System.out.println("Podaj liczbę");
            int numberProposedByUser = scanner.nextInt();
            if (numberProposedByUser < numberChosenByTheComputerBetweenOneAndHundret) {
                System.out.println("Liczba jest mniejsza");
            }
            if (numberProposedByUser > numberChosenByTheComputerBetweenOneAndHundret ) {
                System.out.println("Liczba jest większa");
            }
        }

    }

}
