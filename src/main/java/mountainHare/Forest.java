package mountainHare;

import java.util.List;

public class Forest {
    private List<MountainHare> hares;
    private static String season;

    // объявите недостающие переменные и добавьте конструктор

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }



    public static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "светло-рыжий";
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}
