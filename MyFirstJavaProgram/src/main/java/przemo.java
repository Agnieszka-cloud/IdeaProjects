import java.util.ArrayList;
import java.util.Scanner;

public class przemo {

    public static void main (String [] args) {
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            displayMenu();
            int userChoice = getChoice();

            switch (userChoice) {
                case 1 -> displayUsers(list);
                case 2 -> addUser(list);
            }
        }
    }

    private static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        return userChoice;
    }

    private static void displayMenu() {
        System.out.println("Wybierz opcję:");
        System.out.println("1. Wyświetl użytkownika");
        System.out.println("2. Dodaj użytkowników");
    }

    private static void displayUsers(ArrayList<String> list) {

        System.out.println(list);
    }

    private static void addUser(ArrayList<String> list) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner1.nextLine();
        list.add(name);
    }
}
