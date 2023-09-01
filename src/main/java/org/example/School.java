package org.example;

import java.util.ArrayList;
import java.util.List;

//Schritt 3: Lege eine Klasse "School" an, zu der man Students über eine Methode hinzufügen kann ('addStudent').
public class School {

    List <Student> studentsInASchool = new ArrayList<>();

    //da habe ich die neuen Studenten auf meiner allgemeinen Liste , die in main erstellt wurde, hinzugefügt.
    /*public void addStudent(List <Student> students,Student newStudent){

    students.add(newStudent);
    }

     public void printAllStudentsInTheSchool(List <Student> students){
        for(Student x: students){
            System.out.println("Student " + x.martikelnummer + " ist: " + x.vorname + " " + x.nachname);
        }
    }


    */


    //ich würde da eine neue Liste erstellen nur für die Studenten,die in dieser Schule sind, um alles besser zu greifen danach sein zu können.
    public void addStudent(Student newStudent){
        studentsInASchool.add(newStudent);
    }

    //Schritt 4: Implementiere eine Methode, um alle Students der Schule auszugeben (als Text, auf die Console).
    public void printAllStudentsInTheSchool(){
        for(Student x: studentsInASchool){
            System.out.println("Student " + x.martikelnummer + " ist: " + x.vorname + " " + x.nachname);
        }
    }

    //Schritt 5: Füge eine Methode hinzu, um eine*n Student anhand der id zu finden. Der*Die gefundene Stundent soll returned werden.
    public void findStudentByID(int id){
        boolean test = false;
        for(Student x: studentsInASchool){
            if(x.martikelnummer == id){
                System.out.println("Diese Student ID wurde gefunden! :)");
                System.out.println("Student " + x.martikelnummer + " ist: " + x.vorname + " " + x.nachname);
                test = true;
                break;
            }
        }
        if(test != true){
            System.out.println("Diese Student ID wurde nicht gefunden! :(");
        }
    }
    //Schritt 6: Erstelle eine Methode, um eine*n Student aus der Schule zu entfernen.

    public void deleteAStudentFromSchool(int id){
        boolean test = false;
        for(Student x: studentsInASchool){
            if(x.martikelnummer == id){
                System.out.println("Diese Student ID wird gelöscht! :)");
               studentsInASchool.remove(x);
                test = true;
                break;
            }
        }
        if(test != true){
            System.out.println("Diese Student ID wurde nicht gefunden! :(");
        }
    }
}
