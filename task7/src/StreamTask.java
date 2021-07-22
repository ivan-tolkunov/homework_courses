import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamTask {

    public static void main(String[] args) {
    }

    public static double averageValue(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }

    public static IndexElement min(int[] array) {
        return new IndexElement(IntStream.range(0, array.length).filter(i -> array[i] == IntStream.of(array).min().getAsInt()).toArray(), IntStream.of(array).min().getAsInt());
    }

    public static int equalsZero(int[] array) {
        return IntStream.of(array).filter(i -> i == 0).toArray().length;
    }

    public static int positiveNumber(int[] array) {
        return IntStream.of(array).filter(i -> i >= 0).toArray().length;
    }

    public static int[] multiply(int[] array, int number) {
        return IntStream.of(array).map(i -> i * number).toArray();
    }
}
