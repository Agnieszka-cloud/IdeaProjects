public class ZmienneRelacyjne {
    public static void main(String[] args) {

        // == czy jest równe
        boolean result;
        result = 8 == 8;

        System.out.println(" 8 == 8 " + result);
        result = 3 == 8;
        System.out.println(" 3 == 8 " + result);

        // != czy jest różne
        result = 3 != 8;
        System.out.println(" 3 != 8 " + result);

        result = 3 < 8;
        System.out.println(" 3 < 8 " + result);

        // <=, >=
        result = 3 <= 8;
        System.out.println(" 3 <= 8 " + result);

        int age;
        age = 70;

        // koniunkcja (AND) dwa warunki do spełnienia, odpowiada w jakim zakresie coś się mieści
        System.out.println(age >= 18 && age < 30);
        System.out.println(age >= 70 && age < 75);

        // alternatywa (OR) albo jeden z dwoch warunków ma być spełniony
        System.out.println(age < 18 || age > 75);
        System.out.println(age < 18 || age >= 70);

        // negacja
        boolean yes = true;
        System.out.println("!yes gdzie !oznacza zaprzeczenie prawdy czyli " +
                "jesli yes jest prawdą to !yes jest już fałszem " + !yes);
        System.out.println(!yes);


    }
}
