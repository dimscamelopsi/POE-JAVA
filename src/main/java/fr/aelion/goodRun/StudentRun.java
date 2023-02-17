package fr.aelion.goodRun;

import fr.aelion.models.Student;

public class StudentRun {
    public void connexion() {
        Student student = new Student("Endive","Chicon", "chicon.endive@picardie.com");
        student.setUsername("dim");
        student.setPassword("blabla");

        if(!student.isLoggedIn()){
            if (student.login("dim","blabla")) {
                System.out.println("t'es connecté");
            } else {
                System.out.println("t'es pas connecté");
            }
        }

        if(student.isLoggedIn()) {
            student.logout();
        }

        if(!student.login("ou","lkjlkjlk")) {
            System.out.println("erreur");
        }
    }
}
