import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Sum of integers in an array
 */
public class ReduceInJava {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> getSum = (acc, x) -> {
            return acc+x;
        };

        Integer sum = intList
                .stream()
                .reduce(0, getSum);

        System.out.println(sum);
    }
}
