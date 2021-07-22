import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
    }

    public static List<NodeNum> array(int[] array) {
        Arrays.sort(array);
        List<NodeNum> list = new ArrayList<>();
        int iterator = 1;
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (array[i] == array[i - 1]) {
                    iterator++;
                } else {
                    list.add(new NodeNum(array[i - 1], iterator));
                    iterator = 1;
                }
                if (i == array.length - 1) {
                    list.add(new NodeNum(array[i], iterator));
                }
            }
        }
        return list;
    }


}
