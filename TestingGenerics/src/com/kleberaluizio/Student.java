package com.kleberaluizio;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student student) {
        if(this.getAge() > student.getAge()){
            return 1;
        } else if (this.getAge() < student.getAge()){
            return -1;
        } else {
            return 0;
        }
    }
}
