import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Map<String,Map<String,Long>> cities = new LinkedHashMap<>();
        Map<String,Long> countries = new LinkedHashMap<>();
       String data;
       while (!"report".equals(data = scanner.nextLine())){
           String[] dataArray = data.split("\\|");
           Long population = Long.parseLong(dataArray[2]);
           String country = dataArray[1];
           String city = dataArray[0];
           countries.merge(country,population,Long::sum);
           cities.computeIfAbsent(country,k -> new LinkedHashMap<>());
           cities.get(country).put(city,population);
       }

       Map<String,Long> countriesSorted = new LinkedHashMap<>();
       countries.entrySet().stream()
               .sorted((a,b) -> Long.compare(b.getValue(),a.getValue()))
               .forEachOrdered(x -> countriesSorted.put(x.getKey(),x.getValue()));
        for (Map.Entry<String,Long> countrySet : countriesSorted.entrySet()) {
            System.out.printf("%s (total population: %d)%n",countrySet.getKey(),countrySet.getValue());
            String keys = countrySet.getKey();
            cities.get(keys).entrySet().stream()
                    .sorted((a,b) -> Long.compare(b.getValue(),a.getValue()))
                    .forEach(a -> System.out.printf("=>%s: %d%n",a.getKey(),a.getValue()));
        }



    }
}
