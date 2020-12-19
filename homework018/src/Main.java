import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	//  TASK  A
        Course java = new Course("Java",01.01.2020, "JV-F20", "Askhat Serikov");
        String javaNameIsCourse = java.getNameIsCourse();
        LocalDate javaDate = java.getDate();
        String javaID = java.getID();
        String javaFullNameTeacher = java.getFullNameTeacher();
        System.out.println("Course titles: " + javaNameIsCourse + ";\n" +
                "Date of course creation: " + javaDate + ";\n" +
                "Course ID: " + javaID + ";\n" +
                "Name of the teacher: " + javaFullNameTeacher + ";\n");

        Course frontEnd = new Course("FrontEnd",01.01.2020, "FE-F20", "Polina");
        String frontEndNameIsCourse = frontEnd.getNameIsCourse();
        LocalDate frontEndDate = frontEnd.getDate();
        String frontEndID = frontEnd.getID();
        String frontEndFullNameTeacher = frontEnd.getFullNameTeacher();
        System.out.println("Course titles: " + frontEndNameIsCourse + ";\n" +
                "Date of course creation: " + frontEndDate + ";\n" +
                "Course ID: " + frontEndID + ";\n" +
                "Name of the teacher: " + frontEndFullNameTeacher + ";\n");

        Student first = new Student();
        //LocalDate firstDateOfBirth = first

    //  TASK  B

        Shepherd laika = new Shepherd("Laika", 2, "shepherd", 50);
        System.out.println(laika.toString());

        Bulldog alabai = new Bulldog("Alabai", 3, "bulldog", 45);
        System.out.println(alabai.toString());

        Dalmatian dalmatinetc = new Dalmatian("Dalmatinetc", 3, "dalmaian", 55);
        System.out.println(dalmatinetc.toString());
    }
}
