public class pętlaWhile {
    public static void main(String[]args){
        System.out.println("=========================");
        int i = 0;
        while (i <= 5){
            System.out.print(i);
            i++;
        }
        System.out.println();
        System.out.println("=========================");
        int wynik = 0;
        for (int j = 0; j <= 100 ; j++) {
            wynik = j;
            System.out.print(wynik);

        }
        System.out.println();
        System.out.println("=========================");
        int result = 0;
        int k = 0;
        while (k <= 10){
            System.out.print(result);
            k ++;
            result = result + k;
        }
        System.out.println();
        System.out.println("=========================");
    }
}
