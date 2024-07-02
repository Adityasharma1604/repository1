import java.util.Scanner;
public class code1 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int a = aa.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = aa.nextInt();
        
        // Calculate the product
        int c = a * b;
        
        // Display the result
        System.out.println("The product is: " + c);
        
        // Close the scanner
        aa.close();
    }
}
