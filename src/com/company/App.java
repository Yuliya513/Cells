package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> list;
        list = new ArrayList<>();
list.add(new Student(new FullName("Ivan","Ivanov"),25,"Math"));


        list.add(new Student(new FullName("Petro","Sen"),25,"Math"));
        list.add(new Student(new FullName("Iryna","Oliver"),25,"Biology"));
        list.add(new Student(new FullName("Inna","Comma"),25,"Physics"));


        System.out.println("list= "+list);
        for (Person current: list){
            System.out.println("info: "+current. info());
            System.out.println("activity: "+current. activity());

        }
    }
}
