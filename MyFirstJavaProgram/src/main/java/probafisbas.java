import java.util.Scanner;

public class probafisbas {
    public static void main(String [] args) {


        Party party = new Party(); // konstruktor obiektu Party


        Scanner scanner = new Scanner(System.in); // do zaciagania tresci z konsoli, pobierze pierwsza tresc z konsoli
    boolean shouldContinuee = true; // zmienna do petli while jeśli prawdziwa to wyświetl 1 2 3 4 5
        // jesli juz fałszywa to zakończ
        // boolean shouldContinuee jest do wyjścia z aplikacji czyli do zakończenia programu

    // wyznaczam zmienną int (bo od 1 do 5) usserChoice do liczb ktore bedzie wybieral i wprowadzał uzytkownik
        int userChoice = scanner.nextInt(); // nextInt żeby pobierał kazda nastepną cyfre

    // tworzymy konstruktor
    // Party party = new Party();
        // while do wyświetlania menu od 1 do 5
         while (shouldContinuee) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Wybierz gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjście");



         // switch or if else do wprowadzenia tutaj metod co ma aplikacja zrobić w zależności od tego jaką opcje wybierze użytkownik

        switch (userChoice) {
            case 1 -> //System.out.println("wybrano 1") ;           // i tutaj metody jak to zrobić by działało
                    //   System.out.println(party.getGuests());
                    party.displayGuests();
            case 2 -> party.addGuest();
            // party.addGuest(name: "Mariusz");
            case 3 -> System.out.println("wybrano 3");
            case 4 -> System.out.println("wybrano 4");
            case 5 -> shouldContinuee = false; // System.out.println("wybrano 5") ;
            }
        }
    }
}

