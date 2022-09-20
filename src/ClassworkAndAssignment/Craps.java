package ClassworkAndAssignment;

public class Craps {

    public int sumOfDice;
    public Status gameStatus;
    public enum Status {WON, Lost, Continue}


    public Status getGameStatus() {


        switch (sumOfDice){
            case 7, 11 -> gameStatus = Status.WON;
            case 2, 3, 12 -> gameStatus = Status.Lost;
            default -> gameStatus = Status.Continue;

        }
        return gameStatus;

    }

}