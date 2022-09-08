import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
        List<Potato> listOfPotatoes = new ArrayList<>(potatoes);

        for (Potato potato : listOfPotatoes) {
            System.out.println(potato.calculateAlpha(potato));
        }


        Potato minPotato = Collections.min(listOfPotatoes);
        List<Potato> newList = new ArrayList<>();
        newList.add(minPotato);
        listOfPotatoes.remove(minPotato);
        Potato minPotato2 = Collections.min(listOfPotatoes);
        newList.add(minPotato2);
        listOfPotatoes.remove(minPotato2);


        Potato maxPotato = Collections.max(listOfPotatoes);

        listOfPotatoes.remove(maxPotato);

        Potato maxPotato2 = Collections.max(listOfPotatoes);
        newList.add(maxPotato2);
        newList.add(maxPotato);
        listOfPotatoes.remove(maxPotato2);



				/* Вычислите две самые большие и две самые маленькие картофелины, 
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        return newList;
    }
}