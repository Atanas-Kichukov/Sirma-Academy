import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCountries = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> continentCountryCities = new LinkedHashMap<>();


        while (countOfCountries > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (continentCountryCities.containsKey(continent)) {

                if(continentCountryCities.get(continent).containsKey(country)){
                    continentCountryCities.get(continent).get(country).add(city);
                }else{
                    continentCountryCities.get(continent).put(country,new ArrayList<>());
                    continentCountryCities.get(continent).get(country).add(city);
                }


            }
            else {
                continentCountryCities.put(continent, new LinkedHashMap<>());
                continentCountryCities.get(continent).put(country, new ArrayList<>());
                continentCountryCities.get(continent).get(country).add(city);
            }

            countOfCountries--;
        }

        for (Map.Entry<String, LinkedHashMap<String, List<String>>> entry : continentCountryCities.entrySet()) {
            LinkedHashMap<String, List<String>> values = entry.getValue();

            System.out.println(entry.getKey() + ":");
            String cities = "";
            String country = "";
            for (Map.Entry<String, List<String>> countryAndCities : values.entrySet()) {
                country = countryAndCities.getKey();
                cities = String.join(",",countryAndCities.getValue());
                System.out.printf(" %s -> %s%n",country,cities);
            }





        }
    }
}
