public class ArithmeticFor3Integers {

    protected int sumOf3Integers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int averageOf3Integers(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public int productOf3Integers(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }


    public int smallestOf3Integers(int num1, int num2, int num3) {
        int smallest;
        smallest = num1;
        if (num2 > smallest) {
            smallest = num2;
        }
        if (num3 > smallest){
            smallest = num3;
        }
        return smallest;
    }

    public int largestOf3Integers(int num1, int num2, int num3) {
        int largest;
        largest = num2;
        if (num1 < largest){
            largest = num1;
        }
        if (num3 < largest){
            largest = num3;
        }
        return largest;

    }
}


