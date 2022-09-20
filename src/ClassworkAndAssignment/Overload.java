package ClassworkAndAssignment;

public class Overload {
    public String  buyPizza(String where){
        return  "I bought pizza at " + where;

    }

    public String buyPizza(){
        return "I bought Pizza at just a random place!";
    }

    public void buyPizza(String where, int price){
        System.out.printf("I bought pizza at %s for %d", where,price);
    }
    public static void main(String[] args)  {
        Overload overload = new Overload();
        overload.buyPizza("Domino", 3700);
        System.out.println();
    }
}
