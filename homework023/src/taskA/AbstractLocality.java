package taskA;

public abstract class AbstractLocality {
    private String leader;
    private String name;

    public AbstractLocality(){}
    public AbstractLocality(String leader, String name) {
        this.leader = leader;
        this.name = name;
    }

    public abstract void manager();

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
