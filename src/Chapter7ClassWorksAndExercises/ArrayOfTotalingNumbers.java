package Chapter7ClassWorksAndExercises;

public class ArrayOfTotalingNumbers {
    public static void main(String[] args) {
        int[] total = new int[7];
        total = new int[]{0, 1, 2, 3, 4, 5, 6};

        for (int index = 0; index < total.length; index++) {
            System.out.println(total[index]);
        }

    }
}
//In this code, we want to find out
//The number of times, we could access an array with same data type
//In an index of seven( 7)