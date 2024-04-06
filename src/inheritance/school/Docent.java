package inheritance.school;

public class Docent extends Personeel {

    private String specialisatie;
    private Student[] students;
    private int studentCount;

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Docent(String voornaam, String achternaam, String specialisatie, Lokaal lokaal) {
        super(voornaam, achternaam, lokaal);
        this.specialisatie = specialisatie;
        students = new Student[100]; //max aantal studenten
        studentCount = 0;
    }
    public void addStudent(Student student){
        if(studentCount<students.length){
        students[studentCount] = student;
        studentCount++;}
        /* private boolean foundSpot = false;
        for (int i = 0 ; i<students.length && !foundSpot; i++){
            if(students[i] ==null){
                students[i] = student;
                foundSpot = true;
                studentCount++;
            }*/
    }

    @Override
    public String toString() {
        return "Docent" + getVoornaam() + " " + getAchternaam() + "\nSpecialisatie: " + specialisatie + "\nLokaal: " + getLokaal();
    }

}
