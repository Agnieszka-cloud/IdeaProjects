public class metodaStringJoin {
    public static void main(String[]args){
        String[] tablica = {"kormorany", " żurawie"," czaple"};
        String.join(",",tablica);
        System.out.println(String.join(",",tablica));
        String joined =String.join(",",tablica);
        System.out.println(joined);
    }
}
