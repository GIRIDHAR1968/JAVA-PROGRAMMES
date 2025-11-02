import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";
        while(again.equals("y")){
            System.out.println("Enter first number:");
            double a = input.nextDouble();
            System.out.println("Enter second number:");
            double b = input.nextDouble();
            System.out.println("Choose operation (+,-,*,/):");
            char c=input.next().charAt(0);
            double Result;
            switch(c){
                case '+': Result= a+b;
                          System.out.println("Result: " + Result);
                          break;
                case '-': Result= a-b;
                          System.out.println("Result: " + Result);
                          break;
                case '*': Result= a*b;
                          System.out.println("Result: " + Result);
                          break;
                case '/': if(b==0){
                          System.out.println("Cannot divide by zero");
                          break;
                          }
                          Result= a/b;
                          System.out.println("Result: " + Result);
                          break;
                    
            }
            System.out.println("Do you  want to calculate again? (y/n):");
            again=input.next();
            if(again.equals("n"))
            System.out.println("Thank you for using the calculator.");
        }
        
        
        
        // TODO: Use a while loop to keep calculating while 'again' is 'y'
        
        // TODO: Ask user for two numbers
        
        // TODO: Ask user for the operation (+, -, *, /)
        
        // TODO: Use if-else to perform the operation
        
        // TODO: Handle division by zero case
        
        // TODO: Ask if user wants to continue
        
        // TODO: Exit the loop and print a thank you message
        
    }
}