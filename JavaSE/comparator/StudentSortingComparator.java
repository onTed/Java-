package com.han.comparator;

import java.util.Comparator;

public class StudentSortingComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int rollnoCompare = s1.getRollno().compareTo(s2.getRollno());
        int ageCompare = s1.getAge().compareTo(s2.getAge());
        if (rollnoCompare == 0) {
            return ((ageCompare == 0) ? rollnoCompare : ageCompare);
        } else {
            return rollnoCompare;
        }
    }
}
