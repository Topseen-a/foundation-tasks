import java.util.Scanner;
    public class SumDigit{
        public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int a = (number / 100);
        int b = (number/10 % 10);
        int c = (number % 10);

        int sumNumber = a + b + c;

        System.out.println("The sum of the digit is: " +  sumNumber);
        }
    }
