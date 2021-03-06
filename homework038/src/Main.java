import task_A.CityA;
import task_A.DBTaskA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //homework38 task A

//        List<CityA> city = new ArrayList<>();
//        city.add(new CityA(1, "Pishpek"));
//        city.add(new CityA(2, "Osh"));
//        city.add(new CityA(3, "Karakol"));
//        city.add(new CityA(4, "Batken"));
//        city.add(new CityA(5, "Kant"));

//        DBTaskA.insertCities(city);

        List<CityA> city = new ArrayList<>();
        city.add(new CityA(1, "Bishkek"));
        city.add(new CityA(6, "Talas"));
        city.add(new CityA(7, "Naryn"));
        city.add(new CityA(3, "Cholpon-Ata"));
        city.add(new CityA(5, "Tokmok"));

        //  Task B

//        if (task_B.DataBase.insertCountry(3, "Kyrgyz Republic", "KGZ", 7000000)){
//            System.out.println("Inserted Successfully");
//        }else{
//            System.out.println("Insert failed");
//        }
//
//        task_B.DataBase.insertCountry(4, "People's Republic of China", "PRC", 1400000000);
//        task_B.DataBase.insertCountry(5, "Great Britain", "GB", 60800000);
//
//        task_B.DataBase.insertCity(4, "Bishkek", 3, 6, 1500000);
//        task_B.DataBase.insertCity(5, "Beijing", 4, 8, 230000000);
//        task_B.DataBase.insertCity(6, "London", 5, 9, 90000000);
//
//        System.out.println(DataBase.getCitiesWithCountries());
//        System.out.println(DataBase.getCitiesByLength(7));


    }
}
