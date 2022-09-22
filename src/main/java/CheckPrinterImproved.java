import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckPrinterImproved {

    private int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public void printCheck(String[] items) {
//        String[] names = new String[items.length];
//        String[] quantities = new String[items.length];
//        String[] prices = new String[items.length];
//
        List<String> names = new ArrayList<>();
        List<String> quantities = new ArrayList<>();
        List<String> prices = new ArrayList<>();


        for (String item : items) {
            String[] i = item.split(",");
            String name = i[0];
            String quantity = i[1];
            String price = i[2];
            names.add(name);
            quantities.add(quantity);
            prices.add(price);
        }

        String[] n = names.toArray(new String[items.length]);
        String[] q = quantities.toArray(new String[items.length]);
        String[] p = prices.toArray(new String[items.length]);

        int maxName = findMaxLength(n) + 2;
        int maxQuantity = findMaxLength(q) + 2;
        int maxPrice = findMaxLength(p) + 2;



        System.out.printf("%" + -maxName + "s, %" + -maxQuantity + "s, %" + -maxPrice + "s \n", n[0], q[0], p[0]);
        System.out.printf("%" + -maxName + "s, %" + -maxQuantity + "s, %" + -maxPrice + "s \n", n[1], q[1], p[1]);
        System.out.printf("%" + -maxName + "s, %" + -maxQuantity + "s, %" + -maxPrice + "s \n", n[2], q[2], p[2]);


    }

    public static void main(String[] args) {
        String[] item = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};

        CheckPrinterImproved checkPrinterImproved = new CheckPrinterImproved();
        checkPrinterImproved.printCheck(item);
    }
}