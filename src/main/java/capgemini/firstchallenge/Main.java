package capgemini.firstchallenge;

import java.util.Scanner;

/**
 * Main Class to run the stair challenge at the console.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a entrada: ");
        Scanner input = new Scanner(System.in);
        int numberOfStairs = input.nextInt();

        var stairs = StairsBuilder.build(numberOfStairs);
        System.out.println(stairs);
    }
}
