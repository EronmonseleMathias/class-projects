public class ComparingDigits {

    public boolean squareNumGreaterThanHundred(int num) {
        if (num > 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numlesserThanHundred(int num1) {
        if (num1 < 100) {
            return false;
        } else {
            return true;
        }
    }

    public boolean numEqualTo(int num3) {
        if (num3 == 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numNotEqualTo(int num4) {

        if (num4 != 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean squareNum1GreaterThanHundred(int num1) {
        if (num1 * num1 > 100) {
            return true;
        } else {
            return false;
        }
    }

    public boolean squareNum2LesserThanHundred(int num2) {
        if (num2 * num2 < 100){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean squareNum3EqualToHundred(int num3) {
        if (num3 * num3 == 100){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean squareNum4IsNotEqualToHundred(int num4) {
     if (num4 * num4 != 100){
         return true;
     }
     else {
         return false;
     }
    }
}