/**
 * This represents a ...
 */
public class Problem10 {
  public static void main(String[] args) {
    System.out.println(sumOfPrimesUnder(2000000));
  }

  private static long sumOfPrimesUnder(long limit) {
    long sum = 0;
    for (long i = 0; i < limit; i++) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }

  private static boolean isPrime(long n) {
    if (n < 2) {
      return false;
    } else if (n == 2) {
      return true;
    } else if (n % 2 == 0) {
      return false;
    }
    else {
      for (long i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
