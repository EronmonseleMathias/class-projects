package Chapter3Exercises;
import java.util.Scanner;
public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthProfile healthProfile = new HealthProfile("John", "Doe", 56.8);

        healthProfile.setFirstName("Mathias");
        System.out.println(healthProfile.getFirstName());

        healthProfile.setGender("");
        System.out.println(healthProfile.getGender());
    }
}
