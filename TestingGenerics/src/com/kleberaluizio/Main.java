package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        CollegeStudent kevin = new CollegeStudent("Kevin",18);
        CollegeStudent sue = new CollegeStudent("Suellen",21);
        CollegeStudent bill = new CollegeStudent("William",19);
        CollegeStudent alex = new CollegeStudent("Alex",20);
        KindergardenStudent nino = new KindergardenStudent("Nino", 5);

        Class<CollegeStudent> collegeClass = new Class<>();
        collegeClass.addStudent(kevin);
        collegeClass.addStudent(sue);
        collegeClass.addStudent(bill);
        collegeClass.addStudent(alex);
        collegeClass.addStudent(kevin);

        collegeClass.showClassOrderByAge();







    }
}
