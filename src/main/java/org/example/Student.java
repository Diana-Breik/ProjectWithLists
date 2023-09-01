package org.example;

public class Student {
    //Schritt 1: Lege eine Java-Klasse "Student" an, die folgende Eigenschaften haben soll: Vorname, Nachname, Matrikelnummer.
    public String vorname;
    public String nachname;
    public int martikelnummer;

    public Student() {
    }

    public Student(String vorname, String nachname, int martikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.martikelnummer = martikelnummer;
    }

}
