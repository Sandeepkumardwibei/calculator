import java.util.Scanner;
public class CALCULATOR {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
double num1, num2, answer;
System.out.println("Enter the first number: ");
num1 = sc.nextDouble();

System.out.println("Enter the second number: ");
num2 = sc.nextDouble();

System.out.println("Enter the operation you want to perform (example: +,-,*,/) ");
char operation = sc.next().charAt(0);
sc.close();
switch (operation) {
    case '+':
        answer = num1 + num2;
        System.out.println(num1 + "+" + num2 + " = " + answer);
        break;
    case '-':
        answer = num1 - num2;
        System.out.println(num1 + "-" + num2 + " = " + answer);
        break;
    case '/':
        answer = num1 / num2;
        System.out.println(num1 + "/" + num2 + " = " + answer);
        break;
    case '*':
         answer = num1 * num2;
        System.out.println(num1 + "x" + num2 + " = " + answer);
         break;
        
    case '%':
            answer = num1 % num2;
            System.out.println(num1 + "%" + num2 + " = " + answer);
            break;
    default:
        System.out.println("Error: Operation invalid");
        break;
}
		

	}

}
