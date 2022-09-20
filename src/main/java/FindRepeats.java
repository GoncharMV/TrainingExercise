public class FindRepeats {

    int numberOfRepeats(String text, String substring) {
        int count = 0;
        StringBuilder newText = new StringBuilder(text);
        int i = newText.indexOf(substring);


            while (i != -1) {
                count++;
                newText.delete(i, i + substring.length());
                i = newText.indexOf(substring);
            }


        return count;
    }

    public static void main(String[] args) {
        FindRepeats findRepeats = new FindRepeats();
        System.out.println(findRepeats.numberOfRepeats("раз два три раз два три", "раз"));
    }
}