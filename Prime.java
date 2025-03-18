public class Prime {

  public static void main(String[] args) {
    
    int n = 11;  // You can change this value to check other numbers
    int count = 0;

    if (n <= 1) {
      System.out.println("The number is not prime");
      return;
    }
    
    // Start from 2 as any number is divisible by 1
    for (int j = 2; j <= n / 2; j++) {
      if (n % j == 0) {
        count++;
        break;  // If found a divisor, no need to continue checking
      }
    }
    
    if (count > 0) {
        System.out.println("The number is not prime");
    } else {
      System.out.println("The number is prime");
    }
  }
}

