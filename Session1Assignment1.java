import java.util.Scanner;
public class Session1Assignment1
{
    public static void main(String [] args) 
    {

       Scanner sc = new Scanner(System.in);      
       int num1, num2;
     
       System.out.print("Enter the first number: ");
       num1 = sc.nextInt();
       System.out.print("Enter the second number: ");
       num2 = sc.nextInt();     
       
       int sum = num2-(-num1);
       System.out.println("The sum of "+ num1+ " and "+ num2 +" is : "+ sum);        

    }
}
        