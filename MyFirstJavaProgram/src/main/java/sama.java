import java.util.Scanner;

public class sama {

    public static void main(String[] args){

        Impreza impreza = new Impreza();

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        while (shouldContinue){

            System.out.println("Choose option:");
            System.out.println("1. Display guests list");
            System.out.println("2. Add guest");
            System.out.println("3. Display meal");
            System.out.println("4. Find guest by phone number");
            System.out.println("5. Exit");

        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1 -> impreza.displayGuest();
            case 2 -> impreza.addGuest();
            case 3 -> impreza.displayMeals();
            case 4 -> impreza.displayGuestByPhoneNumber();
            case 5 -> shouldContinue = false;
            }
        }
    }
}
