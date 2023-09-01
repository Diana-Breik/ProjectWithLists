package org.example;

import java.util.ArrayList;
import java.util.List;

//Erstellt ein neues Projekt in IntelliJ und legt damit den Grundstein für das Java-List Projekt.
//
//Schritt 1: Lege eine Java-Klasse "Student" an, die folgende Eigenschaften haben soll: Vorname, Nachname, Matrikelnummer.
//Schritt 2: Erstelle eine Java List für Elemente des Typs "Student" und füge mehrere Studenten hinzu.
//Abstrahieren mit den Mitteln der Objektorientierung.
//
//Schritt 3: Lege eine Klasse "School" an, zu der man Students über eine Methode hinzufügen kann ('addStudent').
//Schritt 4: Implementiere eine Methode, um alle Students der Schule auszugeben (als Text, auf die Console).
//Algorithmen mit Listen.
//
//Schritt 5: Füge eine Methode hinzu, um eine*n Student anhand der id zu finden. Der*Die gefundene Stundent soll returned werden.
//Schritt 6: Erstelle eine Methode, um eine*n Student aus der Schule zu entfernen.
//Falls ihr diese Aufgabe bereits früher abgeschlossen habt, dürft ihr die Bonusaufgabe auf der nächsten Seite bearbeiten.

public class Main {
    public static void main(String[] args)
    {
        Student student1 = new Student("AA","AA",1);
        Student student2 = new Student("BB","BB",2);
        Student student3 = new Student("CC","CC",3);
        Student student4 = new Student("DD","DD",4);
        Student student5 = new Student("EE","EE",5);

        //Schritt 2: : Erstelle eine Java List für Elemente des Typs "Student" und füge mehrere Studenten hinzu.

        List <Student> students = new ArrayList<>();

        //die Studenten werden in den nächsten Zeilen hinzugefügt und dann ausgegeben bei der Schleife.
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println("Die Studenten anhand der ersten zwei Aufgaben: ");
         for(Student x: students){
            System.out.println("Student " + x.martikelnummer + " ist: " + x.vorname + " " + x.nachname);
        }


        //neue Studenten zu der Schule hinzufügen und dann all die Studenten auf die Console ausgeben
        System.out.println("--------------------------------------------------------------");
        School school = new School();
        System.out.println("wir würden Studenten zu dieser Schule hinzufügen," + "diese sind all unsere Studenten: ");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.printAllStudentsInTheSchool();

        //Aufruf der Methode (findStudentByID)
        System.out.println("wie suchen die Id:1 für einen Student");
        school.findStudentByID(1);

        //Aufruf der Methode ()
        System.out.println("wie würden die Infos der Id:1 entfernen");
        school.deleteAStudentFromSchool(1);
        System.out.println("diese sind all unsere jetzige Studenten: ");
        school.printAllStudentsInTheSchool();
    }

}