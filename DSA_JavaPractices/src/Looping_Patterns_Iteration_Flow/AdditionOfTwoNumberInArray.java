package Looping_Patterns_Iteration_Flow;

public class AdditionOfTwoNumberInArray {
    public static void main(String[] args) {
        int output = 8;
        int[] input = { 2, 5, 3, 8 };

        // for (int i = 0; i <= input.length; i++) {
        // for (int j = i + 1; j < input.length; j++) {
        // if (input[i] + input[j] == output) {
        // System.out.println("The two numbers are " + input[i] + " and " + input[j]);
        // } else {
        // System.out.println("No two numbers are found");
        // }
        // }
        // }
        int length = input.length;
        int i = 0;
        int j = length - 1;
        while (length > 0) {
            // System.out.println(length);

            if (input[i] + input[j] == output) {
                System.out.println("The two numbers are " + input[i] + " and " + input[j]);
            } else {
                System.out.println("No two numbers are found" + input[i] + " and " + input[j]);
            }
            length--;
            i = i + 1;
            System.out.println("i" + i);
            j--;
            System.out.println("j" + j);
        }
    }

}
