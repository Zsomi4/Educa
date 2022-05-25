package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {

    Group[] groupArray = {
        new Group(1, "12a"),
        new Group(1, "11c"),
        new Group(1, "10g"),
        new Group(1, "9c"),
        new Group(1, "13a")
    };
    public Vector<Group> groupList = new Vector<>(Arrays.asList(groupArray));

    Student[] studentArrays = {
        new Student(1, "Nagy Lajos", 1),
        new Student(2, "Pici Miklós", 1),
        new Student(3, "Siklós Ádám", 2),
        new Student(4, "Pali Béla", 2),
        new Student(5, "Kelet Jancsi", 2),
        new Student(6, "Pala Sándor", 3),
        new Student(7, "Csont Juli", 3),
        new Student(8, "Ete Levente", 4),
        new Student(9, "Erős istván", 5),
    };
    public Vector<Student> studentList = new Vector<>(Arrays.asList(studentArrays));
}
