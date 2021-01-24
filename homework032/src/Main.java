import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Object> dogs = new HashSet<Object>();
        for (int i = 1; i <= 40 ; i++) {
            dogs.add(i);
        }
        System.out.println(dogs);
    }
}
