package capgemini.firstchallenge;
/**
 * Algorithm that build on the screen a stair of size n (numberOfStairs) using the character '*' and blank spaces.
 * The base and height of the stair must be equal to the value of n. The last line must not contain any spaces.
 */
public class StairsBuilder {
    private static final String BLANK_SPACE = " ";
    private static final String FILLED_SPACE = "*";
    /**
     * Build at the console the stairs made by '*' as the informed number.
     * @param numberOfStairs
     * @return a String with the blank spaces and the '*' that make the stair.
     */
    public static String build(int numberOfStairs) {
        var stairs = new StringBuilder();
        for (int i = 1; i <= numberOfStairs; i++) {
            stairs.append(BLANK_SPACE.repeat(Math.max(0, numberOfStairs - i)));
            stairs.append(FILLED_SPACE.repeat(Math.max(0, i)));
            if (isNotTheLastIteration(numberOfStairs, i))
                stairs.append("\n");
    }
        return stairs.toString();
    }

    /**
     * Tell the number of '*' contained in the stair String.
     * Auxiliar method for tests case.
     * @param stairs
     * @return the number of '*' in the stair String.
     */
    public static int sumAsterisk(String stairs) {
        var counter = 0;
        for (char c : stairs.toCharArray()) {
            if (String.valueOf(c).equals("*"))
                counter++;
        }
        return counter;
    }

    private static boolean isNotTheLastIteration(int numberOfStairs, int currentIteration) {
        return numberOfStairs != currentIteration;
    }
}
