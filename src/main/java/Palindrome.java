import java.util.Locale;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rb = sb.toString();


        return rb.equals(str);

    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeWord("Молебен о коне белом"));
    }
}