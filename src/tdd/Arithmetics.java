package tdd;

public class Arithmetics {

    public int addTwoNumber(int num1, int num2) {
        return num1 + num2;
    }


    public int squares(double squ1, double squ2){
        int squ =(int) Math.pow(squ1,2) +(int) Math.pow(squ2,2);
        return squ;
    }

    public int difference(double squ1, double squ2) {
        int squ = (int) Math.pow(squ1,2) - (int) Math.pow(squ2,2);
        return squ;
    }
}
