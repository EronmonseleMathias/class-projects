package Chapter4Exercises;
import java.util.Scanner;
public class ConditionS {
    public static void main(String[] args){


        int score ;
        String studentScoreGrade ;

        System.out.println("Enter a score here");
        Scanner input = new Scanner(System.in);
        score = input.nextInt();

        if(score >= 60){
            studentScoreGrade = "A";
            System.out.println(studentScoreGrade);
        } else if (score >= 50) {
            studentScoreGrade = "B";
            System.out.println(studentScoreGrade);
        } else if (score >= 40){
            studentScoreGrade = "C";
            System.out.println(studentScoreGrade);
        }

    }
}
