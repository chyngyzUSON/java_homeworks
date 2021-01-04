public class Main {

    public static void main(String[] args) {
	    Climbable babyMonkeys = new ChildMonkey();
	    babyMonkeys.climb();
        System.out.println("****************");

        Monkey monkey = new Monkey();
        monkey.climb();
        monkey.eat();

        monkey.setClimbable(new ChildMonkey());
        monkey.keepOnTheBack();


    }
}
