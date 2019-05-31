package com.han.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestTwoCompare {

    public static void main(String[] args) {
        // create ArrayList to store Student
        List<Student> al = new ArrayList();

        // create customer objects using constructor initialization
        Student obj1 = new Student(1, "Ajay", 27);
        Student obj2 = new Student(3, "Sneha", 23);
        Student obj3 = new Student(3, "Simran", 37);
        Student obj4 = new Student(3, "Alice", 23);
        Student obj5 = new Student(5, "Ak", 29);
        Student obj6 = new Student(6, "Pengpeng", 22);

        // add customer objects to ArrayList
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        // before Sorting arraylist: iterate using Iterator
        Iterator<Student> custIterator = al.iterator();

        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

        System.out.println("----------------------------------------------");
        Collections.sort(al, new StudentSortingComparator());

        for (Student stu : al) {
            System.out.println(stu);
        }
    }

}
