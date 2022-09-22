public class CheckPrinter {
    public void printCheck(String[] items) {
        for (String item: items) {
            String[] i = item.split(",");
            String name = i[0];
            String quantity = i[1];
            String price = i[2];

            System.out.printf("%-10s %-7s %-8s", name + ",", quantity + ",", price);
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        String[] items = {
                "Пицца, 1 шт., 310.50",
                "Чай, 2 шт., 113.30",
                "Печенье, 1 уп., 75.75"
        };
        CheckPrinter checkPrinter = new CheckPrinter();
        checkPrinter.printCheck(items);
    }
}