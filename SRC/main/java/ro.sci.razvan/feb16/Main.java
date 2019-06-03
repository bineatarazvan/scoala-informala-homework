package ro.sci.razvan.feb16;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Materie> myListMaterie = new ArrayList<>();

        //create student 1
        Student student = new Student(1, "razvan", "bineata");

        Materie materie = new Materie(1, "MIP",  9);
        Materie materie1 = new Materie(2, "C", 9);

        myListMaterie.add(materie);
        myListMaterie.add(materie1);

        student.setMaterieList(myListMaterie);

        //create student 2
        Student student1 = new Student(2, "simona", "bineata");

        Materie materie2 = new Materie(1, "MIP", 10);
        Materie materie3 = new Materie(2, "C", 9);

        myListMaterie = new ArrayList<>();

        myListMaterie.add(materie2);
        myListMaterie.add(materie3);
        student1.setMaterieList(myListMaterie);


        //afisare studenti + note

        System.out.println("Notele la materiile studentului cu ID " + student.getIdStudent() + " care are numele: " +
                student.getFirstNameStudent() + " " + student.getLastNameStudent() + " sunt: ");
            double avgNote = 0;
            int count = 0;
        for( Materie l: student.getMaterieList()){
            count++;
            avgNote = (avgNote + l.getNoteMaterie())/count;
            System.out.println("Materia " + l.getNameMaterie() + " cu nota: " + l.getNoteMaterie());
        }
        System.out.println(  " Media notelor la toate materiile este : " + avgNote);

        System.out.println("\nNotele la materiile studentului cu ID " + student1.getIdStudent() + " care are numele: " +
                student1.getFirstNameStudent() + " " + student1.getLastNameStudent() + " sunt: ");
        count= 0;
        avgNote =0;
        for( Materie l: student1.getMaterieList()){
            count ++;
            avgNote = (avgNote + l.getNoteMaterie())/count;
            System.out.println("Materia " + l.getNameMaterie() + " cu nota: " + l.getNoteMaterie());
        }
        System.out.println(  " Media notelor la toate materiile este : " + avgNote);


    }


}
