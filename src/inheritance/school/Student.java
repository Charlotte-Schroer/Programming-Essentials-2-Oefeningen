package inheritance.school;

import inheritance.Persoon;

public class Student extends Persoon {
    private int studentennummer;
    private String specialisatie;

    public int getStudentennummer() {
        return studentennummer;
    }

    public void setStudentennummer(int studentennummer) {
        this.studentennummer = studentennummer;
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Student(String voornaam, String achternaam, int studentennummer, String specialisatie){
        super(voornaam, achternaam);
        setStudentennummer(studentennummer);
        setSpecialisatie(specialisatie);
    }
    @Override
    public String toString(){
        return "Student" + getVoornaam() + " " + getAchternaam() + "\nStudentennummer: " + getStudentennummer() + "\nSpecialisatie: " + getSpecialisatie();


    }
}
