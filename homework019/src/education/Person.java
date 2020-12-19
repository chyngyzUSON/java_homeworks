package education;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    private String citizenship;
    private String gender;
    private LocalDate dateOfBirth;

    public Person(){}
    public Person(String name, String surname, String citizenship, String gender, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.citizenship = citizenship;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
