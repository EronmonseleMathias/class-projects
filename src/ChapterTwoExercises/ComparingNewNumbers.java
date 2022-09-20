package ChapterTwoExercises;
import java.util.Scanner;
public class ComparingNewNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer");
        int number1 = input.nextInt();
        int total1 = number1 * number1;
        System.out.println(total1);
        System.out.println(total1 > 100);
        System.out.println(total1 >= 100);
        System.out.println(total1 != 100);
        System.out.println(total1 < 100);

    }

}
