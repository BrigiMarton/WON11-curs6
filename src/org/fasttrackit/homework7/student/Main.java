package org.fasttrackit.homework7.student;

public class Main {
    public static void main(String[] args){

        Student student = new Student("John", 9);
        Student.numberOfStudents++;
        Student.gradeSum += 9;

        anotherMethodWrittenBySomebodyElse();

        System.out.println("Average grade is" + (Student.gradeSum/ Student.numberOfStudents));
    }

    public static void anotherMethodWrittenBySomebodyElse() {
        Student student = new Student("name", 8);
    }
}
