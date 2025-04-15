package by.HomeWorks.task19.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainForStreams {
    public static void main(String[] args) {
        List<City> cities = Arrays.asList(
                new City(1, "Tokyo", 37400068, Continent.ASIA),
                new City(2, "Delhi", 28514000, Continent.ASIA),
                new City(3, "Shanghai", 24870000, Continent.ASIA),
                new City(4, "New York", 8419600, Continent.NORTH_AMERICA),
                new City(5, "Los Angeles", 3980400, Continent.NORTH_AMERICA),
                new City(6, "London", 8908081, Continent.EUROPE),
                new City(7, "Paris", 2148327, Continent.EUROPE),
                new City(8, "Berlin", 3644826, Continent.EUROPE),
                new City(9, "Sydney", 5312163, Continent.AUSTRALIA),
                new City(10, "Cairo", 20000000, Continent.AFRICA)
        );

        Continent selectedContinent = Continent.ASIA;
        Optional<City> maxPopulatedCityOnContinent = cities.stream()
                .filter(city -> city.getContinent() == selectedContinent)
                .max(Comparator.comparingLong(City::getPopulation));
        maxPopulatedCityOnContinent.ifPresent(city ->
                System.out.println("Самый густонаселённый город на континенте " + selectedContinent + ": " + city.getName())
        );

        Optional<City> minPopulatedCityOnContinent = cities.stream()
                .filter(city -> city.getContinent() == selectedContinent)
                .min(Comparator.comparingLong(City::getPopulation));
        minPopulatedCityOnContinent.ifPresent(city ->
                System.out.println("Город с минимальным населением на континенте " + selectedContinent + ": " + city.getName())
        );

        Optional<City> maxPopulatedCity = cities.stream()
                .max(Comparator.comparingLong(City::getPopulation));
        maxPopulatedCity.ifPresent(city ->
                System.out.println("Самый густонаселённый город: " + city.getName())
        );

        Optional<City> minPopulatedCity = cities.stream()
                .min(Comparator.comparingLong(City::getPopulation));
        minPopulatedCity.ifPresent(city ->
                System.out.println("Город с самым маленьким населением: " + city.getName())
        );
        Optional<City> firstCityOver1M = cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .findFirst();
        firstCityOver1M.ifPresent(city ->
                System.out.println("Первый город с населением больше 1 млн: " + city.getName())
        );

        List<City> citiesOver1M = cities.stream()
                .filter(city -> city.getPopulation() > 1000000)
                .toList();
        System.out.println("Города с населением больше 1 млн: " + citiesOver1M.stream().map(City::getName).toList());

        List<String> cityNames = cities.stream()
                .map(City::getName)
                .toList();
        System.out.println("Названия городов: " + cityNames);
    }
}
