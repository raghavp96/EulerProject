/**
 * This represents a ...
 */
public class Problem5 {
  public static void main(String[] args) {
    System.out.println(findLCMOfRange(1, 21));
  }

  private static long findLCMOfRange(long start, long end) {
    if (start < end) {
      return lcm (start, findLCMOfRange(start + 1, end));
    } return 1;
  }

  private static long lcm(long a, long b) {
    return (a * b)/gcd(a, b);
  }

  private static long gcd(long a, long b) {
    if (a == 0) {
      return b;
    }
    return gcd(b%a, a);
  }
}
