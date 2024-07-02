package dev.jorge;

public class Person {

    private String name;
    private String lastName;
    private String documentNumber;
    private int yearOfBirth;

    public Person(String name, String lastName, String documentNumber, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String DocumentNumber) {
        this.documentNumber = DocumentNumber;
    }

    public int yearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
}
