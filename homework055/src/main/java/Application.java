import entity.Pizza;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
    /*
        Создать новый Entity: Pizza (id, name, price, weight)
        Для Pizza реализовать методы: сохранить, получить все пиццы.
        В main вывести в консоль все пиццы, цена которых ниже 350 (через Stream API)
    */
        Pizza pizza1 = new Pizza(1, "Pepperoni1", 399, 400.0);
        Pizza pizza2 = new Pizza(2, "Pepperoni2", 300, 250.0);
        Pizza pizza3 = new Pizza(3, "Pepperoni3", 500, 550.0);
        Pizza pizza4 = new Pizza(4, "Pepperoni4", 330, 300.0);
        Pizza pizza5 = new Pizza(5, "Pepperoni5", 450, 500.0);
        create(pizza1);
        create(pizza2);
        create(pizza3);
        create(pizza4);
        create(pizza5);
        List<Pizza> pizzaList = getAll();
        pizzaList.stream().filter(x -> x.getPrice() < 350).forEach(x -> System.out.format("%s, ", x));
    }

    public static Integer create(Pizza pizza) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizza);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Успешно создан " + pizza.toString());
        return pizza.getId();
    }

    public static List<Pizza> getAll() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Pizza> pizzaList = hibernateSession.createQuery("FROM Pizza").list();
        hibernateSession.close();
        System.out.println("Получено " + pizzaList.size() + " пиццы");
        return pizzaList;
    }
}
