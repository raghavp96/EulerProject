import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrajagopalan on 6/30/2017.
 */
public class Problem3 {
    public static void main(String[] args) {
        long n=600851475143L;
        System.out.println(findGreatestPrimeFactor(n));
    }

    private static long findGreatestPrimeFactor(long n) {
        int prime = 2;
        while (prime <= n) {
            if (n % prime == 0) {
                n = n / prime;
            } else {
                prime++;
            }
        }

        if (n > prime) {
            return n;
        } else {
            return prime;
        }
    }


}
