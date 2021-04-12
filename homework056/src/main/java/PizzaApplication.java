import entity.Pizza;
import entity.PizzaBox;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class PizzaApplication {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(1, "Pepperoni1", 399, 400.0);
        Pizza pizza2 = new Pizza(2, "Pepperoni2", 300, 250.0);
        Pizza pizza3 = new Pizza(3, "Pepperoni3", 500, 550.0);
        Pizza pizza4 = new Pizza(4, "Pepperoni4", 330, 300.0);
        Pizza pizza5 = new Pizza(5, "Pepperoni5", 450, 500.0);
        createPizza(pizza1);
        createPizza(pizza2);
        createPizza(pizza3);
        createPizza(pizza4);
        createPizza(pizza5);
        List<Pizza> pizzaList = getAllPizza();
        pizzaList.stream().filter(x -> x.getPrice() < 350).forEach(x -> System.out.format("%s, ", x));

        PizzaBox pizzaBox1 = new PizzaBox(1, "красный", "Проспект Мира 30", pizza1);
        PizzaBox pizzaBox2 = new PizzaBox(2, "синий", "улица Ахунбаева 56", pizza3);
        PizzaBox pizzaBox3 = new PizzaBox(3, "желтый", "улица Тыналиева 78", pizza5);
        createPizzaBox(pizzaBox1);
        createPizzaBox(pizzaBox2);
        createPizzaBox(pizzaBox3);
        List<PizzaBox> pizzaBoxList = getAllPizzaBox();
        pizzaBoxList.stream().filter(x -> x.getPizza() != null).forEach(x -> System.out.format("%s", x));

    }

    public static Integer createPizza(Pizza pizza) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizza);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Пицца успешно создано " + pizza.toString());
        return pizza.getId();
    }

    public static List<Pizza> getAllPizza() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<Pizza> pizzaList = hibernateSession.createQuery("FROM Pizza").list();
        hibernateSession.close();
        System.out.println("Получено " + pizzaList.size() + " пиццы");
        return pizzaList;
    }

    public static Integer createPizzaBox(PizzaBox pizzaBox) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.save(pizzaBox);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Коробка для пиццы успешно создано " + pizzaBox.toString());
        return pizzaBox.getId();
    }

    public static List<PizzaBox> getAllPizzaBox() {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<PizzaBox> pizzaBoxes = hibernateSession.createQuery("FROM PizzaBox").list();
        hibernateSession.close();
        System.out.println("Получено " + pizzaBoxes.size() + " коробки для пиццы");
        return pizzaBoxes;
    }

    public static void updateWithLoad(Pizza pizza) {
        System.out.println("Изменение заказа в карзине");
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        Pizza pizzaFromBox = hibernateSession.load(Pizza.class, pizza.getId());
        pizzaFromBox.setId(pizza.getId());
        pizzaFromBox.setName(pizza.getName());
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        System.out.println("Пицца в коробке успешно изменено " + pizzaFromBox.toString());
    }
}