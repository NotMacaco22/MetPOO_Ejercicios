package org.cash.models;

import java.util.Objects;

public class Student {
    private String cif;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // Constructors
    public Student() {
    }
    public Student(String cif, String firstName, String lastName, String email, String phoneNumber) {
        this.cif = cif;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters And Setters
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // To-String Function
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("cif='").append(cif).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Equals-to Function
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(cif, student.cif) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email) && Objects.equals(phoneNumber, student.phoneNumber);
    }

    // Convert To Hash Code Function
    @Override
    public int hashCode() {
        return Objects.hash(cif, firstName, lastName, email, phoneNumber);
    }

}
