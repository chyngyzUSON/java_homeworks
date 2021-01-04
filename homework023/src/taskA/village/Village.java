package taskA.village;

import taskA.AbstractLocality;

public class Village extends AbstractLocality {


    @Override
    public void searchByLeader() {
        System.out.println(getName());
    }
}
