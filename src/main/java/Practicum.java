import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();
        int m = 1;

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);


        while (br.ready()) {
            String line = br.readLine();
            if (!frequencyMap.containsKey(line)) {
                frequencyMap.put(line, m);
            } else {
                frequencyMap.put(line, frequencyMap.get(line) + 1);
            }


        }

        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        br.close();
    }
}