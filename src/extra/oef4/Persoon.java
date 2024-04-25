package extra.oef4;

import java.time.LocalDate;
import java.util.Objects;

public class Persoon {

    private String familinaam;
    private String voornaam;
    private LocalDate geboortedatum;
    private String geboorteplaats;

    public Persoon(String familinaam, String voornaam, LocalDate geboortedatum, String geboorteplaats) {
        this.familinaam = familinaam;
        this.voornaam = voornaam;
        this.geboortedatum = geboortedatum;
        this.geboorteplaats = geboorteplaats;
    }

    public String getFamilinaam() {
        return familinaam;
    }

    public void setFamilinaam(String familinaam) {
        this.familinaam = familinaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getGeboorteplaats() {
        return geboorteplaats;
    }

    public void setGeboorteplaats(String geboorteplaats) {
        this.geboorteplaats = geboorteplaats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(familinaam, persoon.familinaam) && Objects.equals(voornaam, persoon.voornaam) && Objects.equals(geboortedatum, persoon.geboortedatum) && Objects.equals(geboorteplaats, persoon.geboorteplaats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familinaam, voornaam, geboortedatum, geboorteplaats);
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "familinaam='" + familinaam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", geboortedatum=" + geboortedatum +
                ", geboorteplaats='" + geboorteplaats + '\'' +
                '}';
    }

    public int sorteerOpNaam(Persoon persoon){
        return this.familinaam.compareTo(persoon.familinaam);
    }
}
