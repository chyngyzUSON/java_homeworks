package task_A;

public class CityA {
    private int id;
    private String cityName;


    public CityA(int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

//    @Override
//    public String toString() {
//        return "City ID: " + getId() +
//                "\nCity name: " + getCityName();
//    }

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
}
