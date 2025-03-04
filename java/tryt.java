public class tryt{
    public static void main(String[] args) {
    try {
   int a = 10;
   int b = 0;
   int c = a / b;
   System.out.println("Result: " + c);
   } catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
    
} catch (Exception e) {
    System.out.println("An error occurred: " + e.getMessage());
}
    }
    
}
