/**
 * This represents a ...
 */
public class Problem7 {
  public static void main(String[] args) {
    System.out.println(findPrime(10001));
  }

  private static long findPrime(int n) {
    int[] primes = new int[n];
    int primeCount = 0;
    int number = 0;
    while (primes[n-1] == 0) {
      if (isPrime(number)) {
        primes[primeCount] = number;
        primeCount++;
      }
      number++;
    }
    return primes[n-1];
  }

  private static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    } else if (n == 2) {
      return true;
    } else if (n % 2 == 0) {
      return false;
    }
    else {
      for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

}
