package Chapter6Exercise;

public class ArithmeticNumber {

    public int largestNumber(int num1, int num2, int num3, int num4, int num5) {
        int largest = num1;
        if (num2 > num1) {
            largest = num2;
        }
        if (num3 > num2) {
            largest = num3;
        }
        if (num4 > num3) {
            largest = num4;
        }
        if (num5 > num4) {
            largest = num5;
        }
        return largest;
    }
    public int smallestNumber(int num1, int num2, int num3, int num4, int num5) {
        int smallest = num1;
        if (num2 < num1) {
            smallest = num2;
        }
        if (num3 < num2){
            smallest = num3;
        }
        if (num4 < num3){
            smallest = num4;
        }
        if (num5 < num4){
            smallest = num5;
        }
        return smallest;
    }


}
