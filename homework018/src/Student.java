import java.time.LocalDate;

public class Student extends Person {
    String studyFormat;         //  онлайн, оффлайн;
    String academicPerformance; //  отл, хор, удов;

    public Student() {}

    public Student(String name, String surname, String citizenship, String gender, LocalDate dateOfBirth, String studyFormat, String academicPerformance) {
        super(name, surname, citizenship, gender, dateOfBirth);
        this.studyFormat = studyFormat;
        this.academicPerformance = academicPerformance;
    }
}
