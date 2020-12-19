import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate lessonDate;
    Student[] students;
    String nameIsCourse;
    LocalTime startTime;
    boolean homeTask;
    boolean exam;

    public Lesson(){}
    public Lesson(LocalDate lessonDate, Student[] students, String nameIsCourse, LocalTime startTime, boolean homeTask, boolean exam) {
        this.lessonDate = lessonDate;
        this.students = students;
        this.nameIsCourse = nameIsCourse;
        this.startTime = startTime;
        this.homeTask = homeTask;
        this.exam = exam;

    }

    @Override
    public String toString() {
        String message1 = "Я студент " + name + " " + surname + ", Возраст " + dateOfBirth + "\n";
        String message2 = "Это курс " + nameIsCourse + "\n";
        String message3 = "Это группа по курсу " + nameIsCourse + ", в которой обучается " + students + "\n";
    }

    public LocalDate getLessonDate() {
        return lessonDate;
    }
    public void setLessonDate(LocalDate lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getNameIsCourse() {
        return nameIsCourse;
    }
    public void setNameIsCourse(String nameIsCourse) {
        this.nameIsCourse = nameIsCourse;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public boolean isHomeTask() {
        return homeTask;
    }
    public void setHomeTask(boolean homeTask) {
        this.homeTask = homeTask;
    }

    public boolean isExam() {
        return exam;
    }
    public void setExam(boolean exam) {
        this.exam = exam;
    }


}
