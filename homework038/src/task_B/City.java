package task_B;

public class City {
    private int id;
    private String cityName;
    private Country country;
    private int cityPopulation;

    public City(int id, String cityName, Country country, int cityPopulation) {
        this.id = id;
        this.cityName = cityName;
        this.country = country;
        this.cityPopulation = cityPopulation;
    }

    @Override
    public String toString() {
        return "task_B.City ID: " + getId() +
                "\ntask_B.City name: " + getCityName() +
                "\n" + getCountry() +
                "\ntask_B.City population: " + getCityPopulation();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
