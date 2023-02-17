package fr.aelion;

import fr.aelion.goodRun.PersonRun;
import fr.aelion.goodRun.StudentRun;
import fr.aelion.models.Person;
import fr.aelion.models.Student;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        PersonRun personRun = new PersonRun();
        personRun.run();

//        StudentRun studentRun = new StudentRun();
//        studentRun.connexion();

        new StudentRun().connexion();
    }

}