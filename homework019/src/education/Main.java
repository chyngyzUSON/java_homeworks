package education;

public class Main {

    public static void main(String[] args) {
	// write your code here
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

//        Student first = new Student();
//        LocalDate firstDateOfBirth = first
    }
}
