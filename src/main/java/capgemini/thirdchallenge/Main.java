package capgemini.thirdchallenge;

import java.util.Scanner;
/**
 * Main Class to run the pair anagram challenge at the console.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        var text = scanner.nextLine();

        var numOfAnagrams = AnagramFinder.findAnagrams(text);

        System.out.println(numOfAnagrams);
    }
}
