public class OperatoryArytmetyczne {
    public static void main(String[] args) {
        System.out.println(4 + 6);
        System.out.println(4 - 6);
        System.out.println(4 * 6);
        System.out.println(8 / 6); // tylko liczby do przecinka
        System.out.println(5 % 6); //reszta z dzielenia

        double a = 9;
        double b = 2;

        double sumResult = a + b;
        System.out.println("zmienna wynik dodawania " + sumResult);

        double subtractionResult = a - b;
        System.out.println("zmienna określająca wynik odejmowania " + subtractionResult);

        double multiplyResult = a * b;
        System.out.println(multiplyResult);

        double moduloResztaDzieleniaResult= a % b;
        System.out.println(moduloResztaDzieleniaResult);

        double devisionResult = a / b;
        System.out.println(devisionResult);

        a += b;
        System.out.println( "aktualne a to " + a);
        // a = a +b; można zapisać tak: a += b;

        a -= b; // inaczej a = a - b;
        System.out.println(a);

        a *= b; // inaczej a = a * b;
        System.out.println(a);

        a /= b;
        System.out.println(a); // komp leci linia po linii wiec wartosc a
        //  zmienia sie z kazda nowa linia i przypisana komendą

        a %= b;
        System.out.println(a); //kolejnosc komend ma znaczenie

        a = a + 1;
        System.out.println(a);
    }


}
