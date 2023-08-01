import java.util.NoSuchElementException;

public class exception5 {
    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 4, 5};
        int value = 0;
        try {
            System.out.println(indexOf(elements, value));
        } catch (NoSuchElementException e) {
            System.out.println("Brak wskazanego elementu w tablicy");
            e.printStackTrace();
        }
    }

    public static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }
}

