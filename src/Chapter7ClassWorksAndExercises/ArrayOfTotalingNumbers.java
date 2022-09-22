package Chapter7ClassWorksAndExercises;
public class ArrayOfTotalingNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;
        numbers[5] = 30;
        numbers[6] = 35;
//        total = new int[]{0, 1, 2, 3, 4, 5, 6};

        int total = 0;
        for (int index = 0; index < numbers.length; index++) {
            total = total + numbers[index];
        }
        System.out.println(total);
    }
}
//In this code, we want to find out
//The number of times, we could access an array with same data type
//In an index of seven( 7)