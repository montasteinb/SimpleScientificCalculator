import javax.swing.*;
import java.util.Date;
import java.util.Scanner;



public class Calculator {

    public static void main(String[] args) {
        int  programCounter = 0;
        do {
            char operator;
            double num1 = 0, num2 = 0;
            double result = 0, ab = 0, pow1 = 0, pow2 = 0, Exp;
            double cos = 0, tan = 0, sin = 0, log = 0, log10 = 0;


            Scanner input = new Scanner(System.in);

            //print the current date
            Date now = new Date();
            System.out.println("Date: " + now);

            System.out.println("Simple Scientific Calculator");
            System.out.println("----------------------------------------------------");
            System.out.println("\tModulus        (%)  | \tSine          (s)");
            System.out.println("\tTangent        (t)  | \tCosine        (c)");
            System.out.println("\tDivision       (/)  | \tExponent      (^)");
            System.out.println("\tSubtraction    (-)  | \tAddition      (+)");
            System.out.println("\tNatural Log    (t)  | \tLog Base10    (L)");
            System.out.println("\tAbsolute Value (|)  | \tMultiplication(*)");
            System.out.println("---------------------------------------------------");
            System.out.print("Choose an Operator: ");
            operator = input.next().charAt(0);

            //if statements
            if (operator == '|') {
                System.out.print("Enter Digit To Find Absolute Value: ");
                ab = input.nextDouble();
                result = Math.abs(ab);
                System.out.println("> " + result);
            } else if (operator == '^') {
                System.out.println("Enter First Digit And Second As The Exponent");
                System.out.print("Enter First Digit: ");
                pow1 = input.nextDouble();
                System.out.print("Enter Second Digit: ");
                pow2 = input.nextDouble();
                Exp = Math.pow(pow1, pow2);
                System.out.println("> " + Exp);


            } else if (operator == 'c') {
                System.out.print("Enter Digit To Find The Cosine Value: ");
                cos = input.nextDouble();
                result = Math.acos(cos);
                System.out.println("> " + result);
            } else if (operator == 's') {
                System.out.print("Enter Digit To Find The Sine Value: ");
                sin = input.nextDouble();
                result = Math.asin(sin);
                System.out.println("> " + result);
            } else if (operator == 't') {
                System.out.print("Enter Digit To Find The Tan Value: ");
                tan = input.nextDouble();
                result = Math.atan(tan);
                System.out.println("> " + result);
            } else if (operator == 'l') {
                System.out.print("Enter Digit To Find The Log Value: ");
                log = input.nextDouble();
                result = Math.log(log);
                System.out.println("> " + result);
            } else if (operator == 'L') {
                System.out.print("Enter Digit To Find The Log Base10 Value: ");
                log10 = input.nextDouble();
                result = Math.log10(log10);
                System.out.println("> " + result);

            } else {
                System.out.print("Enter First Digit: ");
                num1 = input.nextDouble();
                System.out.print("Enter Second Digit: ");
                num2 = input.nextDouble();
            }


            // case switching
            switch (operator) {
                case '%':
                    result = num1 % num2;
                    System.out.println("> " + num1 + " % " + num2 + " = " + result);
                    break;
                case '+':
                    result = num1 + num2;
                    System.out.println("> " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("> " + num1 + " - " + num2 + " = " + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.println("> " + num1 + " / " + num2 + " = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("> " + num1 + " * " + num2 + " = " + result);
                    break;
                default:
                    System.out.println("Invalid Operator");
            }

            System.out.println("\n\nEnter 1 to continue or any other key to exit");
            programCounter = input.nextInt();
        } while (programCounter==1);

        
    }
}
