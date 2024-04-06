package inheritance.school;

import classes.Adres;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Jef", "Pierlalala", 1236, "IT");
        Student student2 = new Student("Jos", "Degroote", 25697, "Verpleegkunde");
        System.out.println(student1);
        System.out.println(student2);

        Docent docent1 = new Docent("David", "Debakker", "Webdesign", new Lokaal(new Adres("Bosstraat", 1, 9632, "Weet-ik-veel"), "B",4,23));
        System.out.println(docent1);
    }
}
