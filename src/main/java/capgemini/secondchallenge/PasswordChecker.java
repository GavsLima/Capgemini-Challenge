package capgemini.secondchallenge;

/**
 * Algorithm that verifies if the password is valid as the rules.
 * Rule 1: Has at least 6 characters.
 * Rule 2: Contains at least 1 digit (number).
 * Rule 3: Contains at least 1 lowercase letter.
 * Rule 4: Contains at least 1 capital letter.
 * Rule 5: Contains at least 1 special character.
 */
public class PasswordChecker {

    private final String specialChars = "!@#$%^&*()-+";
    private boolean hasUpperCase = false;
    private boolean hasLowerCase = false;
    private boolean hasOneDigit = false;
    private boolean hasSpecialChar = false;
    private int missingChar = 0;

    /**
     * Verifies if the password meet the rules.
     * @param password
     * @return missing char to the password be correct.
     */
    public int check(String password) {
        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)) hasOneDigit = true;

            if(Character.isUpperCase(c)) hasUpperCase = true;

            if(Character.isLowerCase(c)) hasLowerCase = true;

            if(specialChars.contains(String.valueOf(c))) hasSpecialChar = true;
        }

        if(!hasOneDigit) missingChar++;
        if(!hasUpperCase) missingChar++;
        if(!hasLowerCase) missingChar++;
        if(!hasSpecialChar) missingChar++;

        return Math.max(missingChar, 6 - password.length());
    }
}
