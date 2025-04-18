package by.HomeWorks.task19.Streams;

public class City {
    private int id;
    private String name;
    private long population;
    private Continent continent;

    public City(int id, String name, long population, Continent continent) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
