import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mileage;
        int gallon;
        int totalMileageUsed = 0;
        int totalGallonUsed = 0;
        double Average = 0;
        double milesPerGallonConsumed = 0;
        int counter = 1;
        System.out.println("Enter mileage value or -1 to quit: ");
        mileage = input.nextInt();
        System.out.println("Enter number of gallons used: ");
        gallon = input.nextInt();

        Average = mileage / gallon;
        System.out.printf("Mile per Gallon is: %.2f", Average);
        System.out.println();

        while (mileage != -1 && gallon != -1) {
            totalMileageUsed = totalMileageUsed + mileage;
            totalGallonUsed = totalGallonUsed + gallon;
            counter = counter + 1;

            System.out.println("Enter mileage value or -1 to quit: ");
            mileage = input.nextInt();
            System.out.println("Enter number of gallons used: ");
            gallon = input.nextInt();

    Average = (double) mileage / gallon;
            System.out.printf("The mileage per gallon is: %.2f", Average);
            System.out.println();
        }
        if (counter != 0) {
            milesPerGallonConsumed = (double) totalMileageUsed / totalGallonUsed;
            System.out.printf("The combined mileage/gallon used for all the trip is: %.2f", milesPerGallonConsumed);
        }
    }
}


