package capgemini.secondchallenge;

import java.util.Scanner;

/**
 * Main Class to run the password challenge at the console.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PasswordChecker checker = new PasswordChecker();
        //Optional
        //PasswordCheckerRegex checkerRegex = new PasswordCheckerRegex();
        System.out.print("Digite a senha: ");
        var password = scanner.nextLine();

        System.out.println(checker.check(password));
        //Optional
        //System.out.println(checkerRegex.check(passowrd));
    }
}
