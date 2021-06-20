package com.company;

import java.util.Objects;

public class Student extends Person{
    private String subject;

    public Student(FullName fullName, int age, String subject) {
        super(fullName, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(subject, student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject);
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "subject='" + subject + '\'' + super.toString() +
                '}';
    }

    public String activity(){
        return subject;
    }
}
