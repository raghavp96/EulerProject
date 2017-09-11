/**
 * This represents a ...
 */
public class Problem9 {
  public static void main(String[] args) {
    System.out.println(pythagoreanTripletProduct(1000));
  }

  private static long pythagoreanTripletProduct(int sum) {
    for (int i = 0; i < sum; i++) {
      for (int j = i + 1; j < sum; j++) {
        for (int k = j + 1; k < sum; k++) {
          if (i + j + k == sum) {
            if ((i*i + j*j) == k*k) {
              return i * j * k;
            }
          }
        }
      }
    }
    return -1;
  }
}
