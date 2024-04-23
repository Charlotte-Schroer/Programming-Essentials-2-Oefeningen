package input_output.medium;

import java.io.Serializable;
import java.time.LocalDate;

public class Artikel implements Serializable {

    private LocalDate publicatiedatum;
    private String titel;
    private String auteur;
    private String inhoud;

    public Artikel(LocalDate publicatiedatum, String titel, String auteur, String inhoud) {
        this.publicatiedatum = publicatiedatum;
        this.titel = titel;
        this.auteur = auteur;
        this.inhoud = inhoud;
    }

    public LocalDate getPublicatiedatum() {
        return publicatiedatum;
    }

    public void setPublicatiedatum(LocalDate publicatiedatum) {
        this.publicatiedatum = publicatiedatum;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getInhoud() {
        return inhoud;
    }

    public void setInhoud(String inhoud) {
        this.inhoud = inhoud;
    }

    @Override
    public String toString() {
        return "Artikel" +
                "publicatiedatum: " + publicatiedatum +
                "titel: '" + titel + '\'' +
                "auteur: '" + auteur + '\'' +
                "inhoud: '" + inhoud + '\'';
    }
}
