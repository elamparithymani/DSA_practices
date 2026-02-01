package Arrays;

public class basicArrays {
    public static void main(String args[]) {

        int[] arr = {1, 2, 3};
        System.out.println("0 element: " + arr[0]);
        //System.out.print(arr);

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }

        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
    }
}
