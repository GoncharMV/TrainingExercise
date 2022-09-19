package search;

public class FindRepeats {

    int numberOfRepeats(String text, String string) {

        int i = 0;

        while (text.contains(string)) {
            int m = text.indexOf(string) + string.length();
            text = text.substring(m);
            i++;
        }
        return i;
    }

}
