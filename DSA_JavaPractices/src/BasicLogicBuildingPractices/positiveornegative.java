package BasicLogicBuildingPractices;

import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) throws Exception {
        System.out.println(" positive, negative, or zero.");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Given Input  " + num);

        if(num > 0) {
            System.out.println("The Given input is positive");
        }
        else if(num<0) {
            System.out.println("The Given Input is Negative"); 
        }
        else {
            System.out.println("Zero Input");

        }

    }
}
