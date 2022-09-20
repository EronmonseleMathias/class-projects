package ClassworkAndAssignment;

public class Overloading2 {
    public int addTwoNumber(int num1, int num2){
        return num1 + num2;
    }
    public double addTwoNumbers(int num1, double num2){
        return num1 + num2;
    }
    public  double addTwoNumbers( double num1, double num2){
        return num1 + num2;
    }
    public int addTwoNumbers(double num1, int num2 ){
        return (int) (num1 + num2);
    }

    public static void main(String[] args) {
        Overloading2 overloading2 = new Overloading2();
        System.out.println(" "+overloading2.addTwoNumbers(12.5 , 34));
        System.out.println(" ");
        System.out.println(" "+overloading2.addTwoNumbers(1.5, 2.5));
        System.out.println( );
        System.out.println(" "+overloading2.addTwoNumbers(2, 2.5));
        System.out.println( );
        System.out.println("the sum of two numbers are: "+overloading2.addTwoNumber(32,66));
    }

}
