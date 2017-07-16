import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrajagopalan on 6/30/2017.
 */
public class Problem2 {

    public static void main(String[] args) {
        List<Integer> fibs = getFibonacciNumbersUpTo(4000000);
        System.out.println(getSumEvenNumbers(fibs));
    }

    private static long getSumEvenNumbers(List<Integer> ints) {
        long sum = 0;
        for (Integer num : ints) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    private static List<Integer> getFibonacciNumbersUpTo(int upperLimitNumber) {
        List<Integer> fibs = new ArrayList<>();
        fibs.add(1);
        fibs.add(2);
        while (fibs.get(fibs.size() - 1) < upperLimitNumber) {
            fibs.add(fibs.get(fibs.size() - 1) + fibs.get(fibs.size() - 2));
        }
        return fibs;
    }
}
