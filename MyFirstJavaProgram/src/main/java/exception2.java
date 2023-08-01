public class exception2 {
    public static void main (String[]args ){
        int tab[] = {1,2,3,4,5};
        try{
            System.out.println(tab[1]);
            System.out.println(tab[5]);
            System.out.println(tab[0]);
            System.out.println(tab[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks wykracza poza długość tablicy.");
        }
    }
}
