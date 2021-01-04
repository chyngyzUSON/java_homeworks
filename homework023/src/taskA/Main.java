package taskA;

import taskA.city.City;
import taskA.village.Village;

public class Main {

    public static void main(String[] args) {
	AbstractLocality bishkek = new City();
	bishkek.searchByLeader();

	AbstractLocality osh = new City();
	osh.searchByLeader();

	AbstractLocality karakol = new City();
	karakol.searchByLeader();

	AbstractLocality kashkaSuu = new Village();
	kashkaSuu.searchByLeader();

	AbstractLocality koyTash = new Village();
	koyTash.searchByLeader();
    }
}
