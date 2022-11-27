import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    Integer getSum(List<Integer> numbers) {
        Integer result = 0;
        for (Integer i : numbers) {
            result += i;
        }
        return result;
    }

    List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : numbers) {
            if (i % 2 > 0) {
                result.add(i * 2);
            }
        }
        return result;
    }
}