public class ChildMonkey implements Climbable{
    @Override
    public void climb() {
        System.out.println("Детёныши обезьян тоже карабкается");
    }


    @Override
    public String toString() {
        return "детёныш";
    }
}
