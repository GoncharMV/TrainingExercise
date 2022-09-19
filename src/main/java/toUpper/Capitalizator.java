package toUpper;

import java.util.Locale;

public class Capitalizator {

    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

}
