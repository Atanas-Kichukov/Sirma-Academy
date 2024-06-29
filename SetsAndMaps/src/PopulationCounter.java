import java.util.*;


public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Long> countryWithPopulation = new HashMap<>();
        Map<String, Map<String, Long>> countryCityPopulation = new HashMap<>();

        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);

            countryWithPopulation.put(country, countryWithPopulation.getOrDefault(country,0L) + population);
            countryCityPopulation.putIfAbsent(country, new HashMap<>());
            countryCityPopulation.get(country).put(city, countryCityPopulation.get(country).getOrDefault(city, 0L) + population);

            input = scanner.nextLine();
        }

        List<Map.Entry<String, Long>> sortedCountries = new ArrayList<>(countryWithPopulation.entrySet());
        sortedCountries.sort((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()));

        for (Map.Entry<String,Long> entry : sortedCountries) {
            String country = entry.getKey();
            long totalPopulation = entry.getValue();

            System.out.printf("%s (total population: %d)%n",country,totalPopulation);


            Map<String,Long> cities = countryCityPopulation.get(country);
            List<Map.Entry<String,Long>> sortedCities = new ArrayList<>(cities.entrySet());
            sortedCities.sort((c1,c2) -> Long.compare(c2.getValue(),c1.getValue()));

            for (Map.Entry<String, Long> sortedCity : sortedCities) {
                System.out.printf("=> %s: %d%n",sortedCity.getKey(),sortedCity.getValue());
            }
        }

    }


}
