package by.HomeWorks.task14;

import java.util.Objects;

public class Patient implements Comparable<Patient>{
    private String id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int age, String diagnosis, Gender gender, String id, String name, String surname) {
        this.age = age;
        this.diagnosis = diagnosis;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(id, patient.id) &&
                Objects.equals(name, patient.name) &&
                Objects.equals(surname, patient.surname) &&
                Objects.equals(diagnosis, patient.diagnosis) &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, diagnosis, age, gender);
    }

    @Override
    public int compareTo(Patient other) {
        return this.id.compareTo(other.id);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
