package ChapterTwoExercises;
import java.util.Scanner;
public class ObtainingTwoNumbers {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer");
    int number1 = input.nextInt();
    System.out.print("Enter second integer");
    int number2 = input.nextInt();
    //System.out.print("Enter square of each integers");
    //int
    int total1 = number1 * number1;
    System.out.println(total1);
    int total2 = number2 * number2;
    System.out.println(total2);
    int sum = total1 + total2;
    System.out.printf("Sum is %d%n", sum);
    int subtraction = total1 - total2;
    System.out.printf("subtraction, %d%n", subtraction);
}

}

