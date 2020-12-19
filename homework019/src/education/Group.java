package education;

import java.time.LocalDate;

public class Group {
    private String[] students;
    private String[] courses;
    private LocalDate dateStarted;
    private int duration;

    @Override
    public String toString() {
        String message1 = "Я студент " + name + " " + surname + ", Возраст " + dateOfBirth + "\n";
        String message2 = "Это курс " + nameIsCourse + "\n";
        String message3 = "Это группа по курсу " + nameIsCourse + ", в которой обучается " + students + "\n";
    }

    //  Constructor
    public Group(String[] students, String[] courses, LocalDate dateStarted, int duration) {
        this.students = students;
        this.courses = courses;
        this.dateStarted = dateStarted;
        this.duration = duration;
    }


    //  Setter
    public void setStudents(String[] students) {
        this.students = students;
    }
    public void  setCourses(String[] courses) {
        this.courses = courses;
    }
    public void setDateStarted(LocalDate dateStarted) {
        this.dateStarted = dateStarted;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }


    //  Getter
    public String[] getStudents() {
        return students;
    }
    public String[] getCourses() {
        return courses;
    }
    public LocalDate getDateStarted() {
        return dateStarted;
    }
    public int getDuration() {
        return duration;
    }
}
