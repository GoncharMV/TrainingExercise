package pair;

public class Praktikum {
    public static void main(String[] args) {
        Pair pair = new Pair(Integer.parseInt("4"), 1);
        System.out.println("Координаты игрока на карте:");
        pair.print();
        Integer x = (Integer) pair.getKey();
        Integer y = (Integer) pair.getValue();

        System.out.println();

        Pair stringPair = new Pair("username", Integer.toString(1));
        System.out.println("Чит-код пользователя:");
        stringPair.print();
        String user = (String) stringPair.getKey();
        String cheatCode = (String) stringPair.getValue();
    }
}
