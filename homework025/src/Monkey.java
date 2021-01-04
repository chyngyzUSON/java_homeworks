public class Monkey implements Climbable, CanHold, Eating {
    private CanHold canHold;
    private Climbable climbable;

    @Override
    public void climb() {
        System.out.println("Обезьяна умеет карабкатся");
    }

    @Override
    public void keepOnTheBack() {
        System.out.println("Она может держать на спине своего карабкающегося " + climbable + "a");
    }

    @Override
    public void eat() {
        System.out.println("Oна кушает съедобные фрукты");
    }

    public CanHold getCanHold() {
        return canHold;
    }

    public void setCanHold(CanHold canHold) {
        this.canHold = canHold;
    }

    public Climbable getClimbable() {
        return climbable;
    }

    public void setClimbable(Climbable climbable) {
        this.climbable = climbable;
    }
}
