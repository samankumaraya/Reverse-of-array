package codin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count, i;
        int input[] = new int[100];
        int output[] = new int[100];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of elements of in array");
        count = scan.nextInt();

        System.out.println("Enter" + count + "numbers");
        for (i = 0; i < count; i++) {
            input[i] = scan.nextInt();
        }
        for (i = 0; i < count; i++) {
            output[i] = input[count - i - 1];
        }

        System.out.println("Reverse Array");

        for (i = 0; i < count; i++) {
            System.out.println(output[i] + " ");
        }
    }
}
