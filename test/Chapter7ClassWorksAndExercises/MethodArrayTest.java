package Chapter7ClassWorksAndExercises;

import static org.junit.jupiter.api.Assertions.*;

class MethodArrayTest {
    public static void main(String[] args) {
        MethodArray methodArray = new MethodArray();
        int[] numbers = {1, 2, 3, 4, 5};
       methodArray.addNumbers(numbers);
        System.out.println(methodArray.addNumbers(numbers));
        System.out.println(" the length of the array is: " + numbers.length);
    }
}