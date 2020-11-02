
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String expected = input;

        return expected;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String expected = baseValue + valueToBeAdded;

        return expected;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {

        StringBuilder reversal = new StringBuilder(valueToBeReversed);
        StringBuilder revString = reversal.reverse();
        String expected = revString.toString();

        return expected;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {

        Integer wordMiddle = word.length() / 2;

        Character expected = word.charAt(wordMiddle);

        return expected;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {

        String remove = charToRemove.toString();
        String expected = value.replaceAll(remove, "");

        return expected;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {

        String[] sentArr = sentence.split(" ");
        String expected = sentArr[sentArr.length - 1];



        return expected;
    }
}
