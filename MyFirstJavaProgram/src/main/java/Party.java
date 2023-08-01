import java.util.*;

public class Party {

    //miejsce na stworzenie listy gości
    //private List<String> guests =new ArrayList<>();
    private List<Guest> guests =new ArrayList<>(); // pola w javie maja byc prywatne

    // set do tworzenia zbioru tu nie ma miejsca na duplikaty w hashset
    private Set<String> meals = new HashSet<>();
    // map czyli coś jak słownik do pobierania klucza w postaci numeru telefonu ( bo po numerze telefonu chcemy znaleźć użytkownika
    // czyli potrzebujemy Intigera ale w postaci obiektu do przechowywania typów prostych
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();



    Scanner scanner = new Scanner(System.in);
    //private Object Guest;

    // metoda dodawania gości do listy

    public void addGuest() { // metoda
        // public void addGuest(String name){
        // guests.add(name); }
        System.out.println("Podaj imię gościa");
        String name = scanner.nextLine(); // wyzaczam zmienną do imion dodawanych przez użyt.

        System.out.println("Podaj preferowany posiłek");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu");
        // int phoneNumber = scanner.nextInt(); czyta enter więc sie wywala bo enter to nie liczba
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Czy weganin Y/N");
        String isVeganString = scanner.nextLine();



        boolean isVegan;
        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        // wywołujemy KONSTRUKTOR OBIEKTU GUEST Z KLASY GUEST
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);
        // guests.add(name);
        guests.add(guest); // przekazujemy do listy guest dodanych gości
    }


    public void displayMeals(){
        for (String meal:meals
             ) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu");

        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayGuestInformation();

    }
    // public List<String> getGuests() {
    // return guests;
    // }
    public void displayGuests() {

        // for {String guest : guests
        // potem jak mamy utworzony obiekt to nie potrzebujemy już Stringa tylko Obiekt
        for (Guest guest:guests
             ) {
            // System.out.println(guest);
            guest.displayGuestInformation();
            System.out.println(); // pusta linia między gośćmi

        }
    }
}
