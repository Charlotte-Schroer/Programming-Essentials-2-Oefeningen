package exceptions.easy;

import java.io.Serializable;
import java.util.Objects;

public class Boek {
    private String titel;
    private final int ISBN;

    public Boek(int ISBN, String titel) {
        this.ISBN = ISBN;
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boek boek = (Boek) o;
        return ISBN == boek.ISBN && Objects.equals(titel, boek.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, ISBN);
    }

    @Override
    public String toString() {
        return "Boek{" +
                "titel='" + titel + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
