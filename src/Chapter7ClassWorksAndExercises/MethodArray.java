package Chapter7ClassWorksAndExercises;

public class MethodArray {
        public int addNumbers ( int[] numbers) {
            int total = 0;
            for (int i = 0; i < numbers.length; i++) {
                // total += numbers[i];
                total = total + numbers[i];
            }
            return total;
        }
}
