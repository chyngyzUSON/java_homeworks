package taskA.city;

import taskA.AbstractLocality;

public class City extends AbstractLocality {

    @Override
    public String toString() {
        return "Город " + getName() + ", мэр города " + getLeader();
    }

    @Override
    public void searchByLeader() {
        System.out.println(getName());
    }
}
