/**
 * This represents a ...
 */
public class Problem6 {
  public static void main(String[] args) {
    System.out.println(squareOfSum(101) - sumOfSquares(101));
    System.out.println(squareOfSum(11) - sumOfSquares(11));
  }

  public static long sumOfSquares(int upperBoundExclusive) {
    long sum = 0;
    for (int i = 1; i < upperBoundExclusive; i++) {
      sum += (i * i);
    }
    return sum;
  }

  public static long squareOfSum(int upperBoundExclusive) {
    return sumConsecIntUntil(upperBoundExclusive) * sumConsecIntUntil(upperBoundExclusive);
  }

  public static long sumConsecIntUntil(int upperBoundExclusive) {
    int n = (upperBoundExclusive - 1);
    return ((n)*(n+1))/2;
  }
}
