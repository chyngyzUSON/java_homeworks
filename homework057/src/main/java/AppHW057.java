import entity.Championship;
import entity.Country;
import entity.Sport;
import entity.Team;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Collection;
import java.util.List;

public class AppHW057 {
    public static void main(String[] args) {
        //Страны
        Country country1 = Country.builder().id(1L).name("Кыргызстан").build();
        Country country2 = Country.builder().id(2L).name("Казакстан").build();
        Country country3 = Country.builder().id(3L).name("Узбекистан").build();
        create(country1);
        create(country2);
        create(country3);
        List<Country> countries = getAllCountries();

        //Виды спортов
        Sport sport1 = Sport.builder().id(1L).name("Футбол").build();
        Sport sport2 = Sport.builder().id(2L).name("Баскетбол").build();
        Sport sport3 = Sport.builder().id(3L).name("Волейбол").build();
        create(sport1);
        create(sport2);
        create(sport3);
        List<Sport> sports = getAllSports();

        //Команды
        Team team1 = Team.builder()
                .id(1L)
                .name("Команда1")
                .sports(sports)
                .build();
        Team team2 = Team.builder()
                .id(2L)
                .name("Команда2")
                .sports(sports)
                .build();
        Team team3 = Team.builder()
                .id(3L)
                .name("Команда3")
                .sports(sports)
                .build();
        Team team4 = Team.builder()
                .id(4L)
                .name("Команда4")
                .sports(sports)
                .build();
        Team team5 = Team.builder()
                .id(5L)
                .name("Команда5")
                .sports(sports)
                .build();
        create(team1);
        create(team2);
        create(team3);
        create(team4);
        create(team5);
        List<Team> teams = getAllTeams();

        //Чемпионат
        Championship championship = Championship.builder()
                .id(1L)
                .name("Азиатские игры")
                .countries(countries)
                .sports(sports)
                .build();
        create(championship);
        System.out.println(getChampionship(1L));
    }

//    public static Long create(Sport sport) {
//        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
//        hibernateSession.beginTransaction();
//        hibernateSession.save(sport);
//        hibernateSession.getTransaction().commit();
//        hibernateSession.close();
//        System.out.println("успешно создан" + sport.toString());
//        return sport.getId();
//    }

    public static <T> T create(T entity) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("успешно создан" + entity.toString());
        return entity;
    }

    public static List<Team> getAllTeams() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Team> teams = hibernateSession.createQuery("FROM Team").list();
        hibernateSession.close();
        System.out.println("Получено " + teams.size() + " команд");
        return teams;
    }

    public static List<Country> getAllCountries() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Country> countries = hibernateSession.createQuery("FROM Country").list();
        hibernateSession.close();
        System.out.println("Получено " + countries.size() + " вид спорта");
        return countries;
    }

    public static List<Sport> getAllSports() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Sport> sports = hibernateSession.createQuery("FROM Sport").list();
        hibernateSession.close();
        System.out.println("Получено " + sports.size() + " вид спорта");
        return sports;
    }

    public static Championship getChampionship(Long id) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        Championship championship = hibernateSession.get(Championship.class, id);
        hibernateSession.close();
        System.out.println("Чемпионат Азиатские игры");
        return championship;
    }
}
