package taskA;

import taskA.city.bishkek.CityBishkek;
import taskA.city.karakol.CityKarakol;
import taskA.city.osh.CityOsh;
import taskA.village.VillageKashkaSuu;
import taskA.village.VillageKoyTash;

public class Main {

    public static void main(String[] args) {
	AbstractLocality bishkek = new CityBishkek();
	bishkek.manager();

	AbstractLocality osh = new CityOsh();
	osh.manager();

	AbstractLocality karakol = new CityKarakol();
	karakol.manager();

	AbstractLocality kashkaSuu = new VillageKashkaSuu();
	kashkaSuu.manager();

	AbstractLocality koyTash = new VillageKoyTash();
	koyTash.manager();
    }
}
