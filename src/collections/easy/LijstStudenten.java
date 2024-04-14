package collections.easy;

import inheritance.school.Student;

import java.util.ArrayList;

import static java.util.Collections.shuffle;


public class LijstStudenten{
    public static void main(String[] args) {
        Student s1 = new Student("Charlotte", "Dewitte", 1234, "IT");
        Student s2 = new Student("Jan", "Zondervrees", 3694, "Orthopedagogie");
        Student s3 = new Student("Mike", "Degroote", 4598, "Muziek");
        Student s4 = new Student("Wendy", "Van Wanten", 9733, "Toerisme");

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        shuffle(students);
        System.out.println(students);


    }
}
