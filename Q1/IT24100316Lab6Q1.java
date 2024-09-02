
import java.util.Scanner;
public class IT24100316Lab6Q1 {
    public static void main(String[] args) {
        //create scanner
        Scanner num = new Scanner(System.in);

        //declare variables
        int number ;


        //take input
        System.out.println("Enter a number:");
        number = num.nextInt();

        //calculation
        double square = Math.pow(number,2);
        double square_root = Math.sqrt(number);

        //take output
        System.out.println("The square of "+number+" is : "+ square);
        System.out.println("The square root of "+number+" is : "+square_root);

    }
}