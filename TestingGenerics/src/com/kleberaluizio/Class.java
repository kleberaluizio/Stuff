package com.kleberaluizio;

import java.util.ArrayList;
import java.util.Collections;

public class Class <T extends Student> {
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public boolean addStudent(T student){
        if (members.contains(student)){
            System.out.println(student.getName() + " is already in this class!");
            return false;
        } else {
            members.add(student);
            return true;
        }
    }
    public void showClassOrderByAge(){
        Collections.sort(members);

        System.out.println("--- Members by Age ---");
        for(Student s : members){
            System.out.println(s.getName() + ": "+s.getAge());
        }
    }

}
