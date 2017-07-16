/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by rrajagopalan on 6/30/2017.
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(getSumOfAllMultiplesOfXAndY(3, 5, 1000));
    }

    private static long getSumOfMultiples(int x, int upperLimitNotInclusive) {
        long sum = 0;
        int multipleX = x;

        while (multipleX < upperLimitNotInclusive) {
            sum += multipleX;
            multipleX += x;
        }

        return sum;
    }

    private static long getSumOfAllMultiplesOfXAndY(int x, int y, int upperLimitNotInclusive) {
        long sumX = getSumOfMultiples(x, upperLimitNotInclusive);
        long sumY = getSumOfMultiples(y, upperLimitNotInclusive);
        long sumXY = getSumOfMultiples(x * y, upperLimitNotInclusive);

        return sumX + sumY - sumXY;
    }
}
