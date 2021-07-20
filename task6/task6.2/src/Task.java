import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] array = {4, 5, -6, -6, 4, 5, 3, 4, 2, 4, 5, 7, 7};
        array(array);
    }

    private static void array(int[] array) {
        Arrays.sort(array);
        int iterator = 1;
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (array[i] == array[i - 1]) {
                    iterator++;
                } else {
                    System.out.println(array[i - 1] + ": " + iterator);
                    iterator = 1;
                }
                if (i == array.length - 1) {
                    System.out.println(array[i] + ": " + iterator);
                }
            }
        }
    }


}
