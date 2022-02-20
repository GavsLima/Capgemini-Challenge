package capgemini.secondchallenge;

import java.util.regex.Pattern;
/**
 * Algorithm with Regex that verifies if the password is valid as the rules.
 * Rule 1: Has at least 6 characters.
 * Rule 2: Contains at least 1 digit (number).
 * Rule 3: Contains at least 1 lowercase letter.
 * Rule 4: Contains at least 1 capital letter.
 * Rule 5: Contains at least 1 special character.
 */
public class PasswordCheckerRegex {

    private int missingChar = 0;
    private  final Pattern digitalPattern = Pattern.compile("^(?=.*\\d).+$");
    private  final Pattern lowerCasePattern = Pattern.compile("^(?=.*[a-z]).+$");
    private  final Pattern upperCasePattern = Pattern.compile("^(?=.*[A-Z]).+$");
    private  final Pattern specialCharPattern = Pattern.compile("^(?=.*[!,@,#,$,%,^,&,*,(,),-,+]).+$");

    /**
     * Verifies if the password meet the rules.
     * @param password
     * @return missing char to the password be correct.
     */
    public int check(String password){
        if(!digitalPattern.matcher(password).matches()) missingChar++;
        if(!lowerCasePattern.matcher(password).matches()) missingChar++;
        if(!upperCasePattern.matcher(password).matches()) missingChar++;
        if(!specialCharPattern.matcher(password).matches()) missingChar++;

        return Math.max(missingChar, 6 - password.length());
    }
}
