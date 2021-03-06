package task_B;

public class Country {
    private int id;
    private String countryName;
    private String countryCode;
    private int countryPopulation;

    public Country(int id, String countryName, String countryCode, int countryPopulation) {
        this.id = id;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
    }

    @Override
    public String toString() {
        return "task_B.Country ID: " + getId() +
                "\ntask_B.Country name: " + getCountryName() +
                "\ntask_B.Country code: " + getCountryCode() +
                "\ntask_B.Country population: " + getCountryPopulation();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }
}
