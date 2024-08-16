import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // take the inpour from user for numbers and for the operator

        Double num1, num2, result = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the operation which you want to perform  : + or - or * or / : ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the first number : \n");
        num1 = input.nextDouble();
        if(num1 < 0 || num1.isNaN(operator)){
            System.out.println("Invalid input. Numbers should be positive and not NaN.");
            System.exit(0);
        }

        System.out.print("Enter the second number : \n");
        num2 = input.nextDouble();
        if(num2 < 0 || num2.isNaN(operator)){
            System.out.println("Invalid input. Numbers should be positive and not NaN.");
            System.exit(0);
        }

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("You provided the wrond output");
                break;
        }

        System.out.println("The result is : " + num1 + "" + operator + "" + num2 + " => " + result);

    }
}
