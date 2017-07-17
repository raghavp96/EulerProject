/**
 * Created by rrajagopalan on 6/30/2017.
 */
public class Problem4 {
    public static void main(String[] args) {
        System.out.println(getLargestPalindromeProduct(100, 1000));
    }

    private static long getLargestPalindromeProduct(int minInclusive, int maxExclusive) {
        long largestPalindrome = 0;
        for (int i = minInclusive; i < maxExclusive; i++) {
            for (int j = i; j < maxExclusive; j++) {
                long product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }
        return largestPalindrome;
    }

    private static boolean isPalindrome(long product) {
        String prod = product + "";
        for (int i = 0; i < prod.length()/2 + 1; i++) {
            if (!(prod.charAt(i) == prod.charAt(prod.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
