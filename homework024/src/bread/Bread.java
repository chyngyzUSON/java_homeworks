package bread;

public class Bread implements Bakeable{
    @Override
    public void bake() {
        System.out.println("Выпекание хлеба");
    }
}
