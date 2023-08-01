import java.util.Arrays;

public class returnUnique {
    public static void main (String[]args) {
        // ta metoda nie działa
        int[] arr = {7,8,9,0};
        System.out.println(Arrays.toString(returnUnique5(arr)));
        System.out.println(Arrays.toString(returnUnique5(new int[]{7,7,9,8,9})));
    }
        public static int[] returnUnique5(int[] arr) {
            int[] arrTemp = new int[arr.length];
            int newLenght = 0;
            for (int i = 0; i < arr.length; i++) {
                boolean result = false;
                for (int j = 0; j < newLenght; j++) {
                    if (arrTemp[j] == arr[j]) {
                        result = true;
                        break;
                    }
                    if(!result){
                        arrTemp[newLenght] = arr[i];
                        newLenght++;
                    }
                }
            }
            System.out.println("chyba sie udało");
            return Arrays.copyOf(arrTemp, newLenght);
        }
}
