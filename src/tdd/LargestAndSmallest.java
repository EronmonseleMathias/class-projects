package tdd;
import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first number");
        int number1 = input.nextInt();
        System.out.println("Enter next number");
        int number2 = input.nextInt();
        System.out.println("Enter next number");
        int number3 = input.nextInt();
        System.out.println("Enter next number");
        int number4 = input.nextInt();
        System.out.println("Enter the last number");
        int number5 = input.nextInt();

        if (number1 > number2) {
            if (number1 > number3) {
                if (number1 > number4) {
                    if (number1 > number5) {
                        System.out.println(number1 + " is the largest");
                    }
                }
            }
        }


        if (number2 > number1) {
            if (number2 > number3) {
                if (number2 > number4) {
                    if (number2 > number5) {
                        System.out.println(number2 + " is the largest");

                        if (number3 > number2) {
                            if (number3 > number1) {
                                if (number3 > number4) {
                                    if (number3 > number5) {
                                        System.out.println(number3 + " is the largest");

                                        if (number4 > number2) {
                                            if (number4 > number3) {
                                                if (number4 > number1) {
                                                    if (number4 > number5) {
                                                        System.out.println(number4 + " is the largest");

                                                        if (number5 > number2) {
                                                            if (number5 > number3) {
                                                                if (number5 > number4) {
                                                                    if (number5 > number4) {
                                                                        System.out.println(number5 + " is the largest");

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }


                                                }
                                            }
                                        }
                                    }


                                }
                            }
                        }
                    }


                }
            }
        }
    }

}

