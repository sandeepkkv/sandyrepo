public class Factorial {

   public static void main(String[] args) {
       int n = 10;
       int result = factorial(n);
       System.out.println("The factorial of 10 is " + result);
   }

   public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
}
