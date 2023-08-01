import java.util.*;

public class petlawhile {

    public static void main(String[] args) {
        int i = 0;

        while (i<10){
            System.out.println("i mniejsze od 10");
            i++;
        }

        boolean isSkyBlue = false;

        while (isSkyBlue) {
            System.out.println("niebo jest niebieskie");
        }
        do {
            System.out.println("niebo jest niebieskie");
        }
        while (isSkyBlue);
        for (int j = 0; j < 10; j++){
            if (j==4) {
                continue;
            }
            System.out.println(j);
        }
        int a = 3;
        int b = 3;
        System.out.println( a < b);
        System.out.println(a%b);
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a!=b);

        boolean isSkyBluee = false;
        if (true) {
            System.out.println("Niebo jest niebieskie");
        } else {
            System.out.println("Niebo nie jest niebieskie");
        }

        int aa = 4;
        System.out.println(aa);

        aa++;
        aa--;
        System.out.println(aa);

        for (int i1 = 0; i1 <=10; i1 +=2){
            System.out.println(i1);
        }
        int ii = 0;
        for (; ii < 10; ii++){
            System.out.println(ii);
        }
        int j = 0;

        while (j<10){
            System.out.println("j jest mniejsze od 10");
            j++;
        }
        System.out.println("blbllb");
        do {
            System.out.println("j jest mniejsze od 10");
        }
        while (j<10);
        System.out.println("ggiigiuoho");
        for (int k = 0; k<10; k++) {
            if (k==4){
                continue;
            }
            System.out.println(k); //wartosc licznika
        }
        System.out.println("-------------------");
        for (int f = 1; f<101; f++){
            if ( f % 15 == 0){
                System.out.println("fizzbuss");
            } else if(f % 3 == 0){
                System.out.println("fizz");
            } else if ( f% 5 == 0){
                System.out.println("buss");
            } else {
                System.out.println(f);
            }
        }

        Random random = new Random(); // clasa random, ktora losuje losowo cyfre trzeba potem z biblioteki wybrac metode skorzystać
        // tworzymy metode na wylosowanie liczby z podanego przez nas przedziału za pomoca komendu nextInt
        int numberToGuessChosenByComputer = random.nextInt(101) ;
        Scanner scanner = new Scanner(System.in);
        boolean wasNumerGuesssed = false;

        while (!wasNumerGuesssed){
            System.out.println("Podaj liczbę");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuessChosenByComputer) {
                System.out.println("Liczba jest za mała");
            } else if (userNumber>numberToGuessChosenByComputer) {
                System.out.println("Liczba jest za duża");
            }else{
                System.out.println("odgadłeś właściwą liczbę");
                wasNumerGuesssed = true;
            }
        }
        String[] names = new String[4];

        names[0] = "Agnieszka";
        names[1] = "Ania";
        names[2] = "Mariusz";
        names[3] = "Przemek";

        String [] namess = {"Agnieszka", "Mariusz", "Rafał"};

        for (int n = 0; n<names.length; n++){
            System.out.println(names[n]);
        }
        for (int s = 0; s< namess.length; s++){
            System.out.println(namess[s]);
        }
        for (String name:names
             ) {
            System.out.println(name);
            for (String namee:namess
                 ) {
                System.out.println(namee);
            }
        }
        //System.out.println(args[0]);
        // minuta 1:29:56 java podstawy
        System.out.println(" ");
        System.out.println("Lista Array szyk");
        List<String> namesss = new ArrayList<>();
        namesss.add("Mariusz");
        namesss.add("Agnieszka");
        namesss.add("Wiktoria");
        namesss.add("Alexandra");
        namesss.add("Larysa");

        System.out.println(namesss.remove("Mariusz"));
        System.out.println(namesss.contains("Dominik"));
        System.out.println(namesss.contains("Agnieszka"));
        System.out.println(namesss.get(3));
        // w list moga istnieć duplikaty
        // w list usuwasz piersze wystapienie gdy tworzysz nastepne w tym samym miejscu
        namesss.add("Agnieszka");
        // czy jest pusty isEmpty
        // sortowanie według alfabetu jest pod collections i sort

        Collections.sort(namesss);

        Set<String> meals = new HashSet<>(); //

        meals.add("strips");
        meals.add("frytki");
        meals.add("katchup");
        meals.add("strips"); // nie ma duplikacji ani kolejnosci

        Map<String, String> nameToMeal = new HashMap<>(); // zastepowanie wartościami

        nameToMeal.put("Agnieszka", "strips");
        nameToMeal.put("Wiktoria","frytki");
        nameToMeal.put("Alexandra", "ketchup");

        System.out.println(nameToMeal.get("Agnieszka"));
        System.out.println(nameToMeal.get("strips"));
        System.out.println("");
        System.out.println("metoda keySet, wyciąga wszystkie klucze");
        Set<String> keys = nameToMeal.keySet();
        System.out.println();
        System.out.println(nameToMeal.containsKey("Alexandra"));
        System.out.println(nameToMeal.containsValue("frytki"));

        for (String key:keys

             ) {
            System.out.println(key);

        }
        System.out.println("wyciąganie wszystkich wartości za pomoca metody value");
        System.out.println();
        Collection<String> values = nameToMeal.values();


        for (String value:values
             ) {
            System.out.println(value);
        }
        System.out.println("");
        System.out.println("blablablabalba");
        for (String meal:meals
             ) {
            System.out.println(meal);
        }
        System.out.println("");
        System.out.println("blblbalablablbalbalb");


        for (String nam:namesss) {
            System.out.println(nam);
        }
    }
}
