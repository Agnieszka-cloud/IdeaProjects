public class pętlaFor {
    public static void main(String[]args){
        for (int i = 0; i < 5; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        for (int i = 1; i <= 5 ; i++) {
            System.out.print(i + " ");
        }
        int[] ar = {4,5,6,7,};
        for (int i = 0; i < ar.length ; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i < ar.length ; i++) {
            System.out.print(ar[i]);
        }
    }
}
