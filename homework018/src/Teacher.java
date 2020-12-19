import java.time.LocalDate;

public class Teacher extends Person{
    String whatIsTeaching;

    public Teacher() {}
    public Teacher(String name, String surname, String citizenship, String gender, LocalDate dateOfBirth, String whatIsTeaching) {
        super(name, surname, citizenship, gender, dateOfBirth);
        this.whatIsTeaching = whatIsTeaching;
    }

    public String getWhatIsTeaching() {
        return whatIsTeaching;
    }
    public void setWhatIsTeaching(String whatIsTeaching) {
        this.whatIsTeaching = whatIsTeaching;
    }
}
