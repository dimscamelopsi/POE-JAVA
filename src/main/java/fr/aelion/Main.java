package fr.aelion;

import fr.aelion.models.Person;
import fr.aelion.models.Student;

import java.sql.SQLOutput;

public class Main {
    private static Main app;
    public static void main(String[] args) {
        app = new Main();
        if (app instanceof Main) {
            System.out.println("You are a Main object");
        } else {
            System.out.println("You're not a Main object");
        }
        System.out.println("I'm the main method");
        app.connexion();
    }

    /**
     * Class constructor : trigger when an instance of this Class is created
     * It's a method and it's optional
     * Il porte le même nom que la classe en Java
     */
    public Main() {
        Person jl = new Person();
        jl.setLastName("Aubert");
        jl.setFirstName("Jean-Luc");
        jl.setPhoneNumber("06 01 01 01 01");
        jl.setEmail("jla@blabla.fr");

        System.out.println("I am " + jl.greetings());

        Person jt = new Person();
        jt.setLastName("Titi");
        jt.setFirstName("Jeannot");
        jt.setPhoneNumber("06 05 04 08 09");
        jt.setEmail("jeannot.titi@grominet.it");

        System.out.println("I am " + jt.greetings());

        Person mel = new Person("Gnagna", "Mélanie", "05 06 04 01 03", "mélanie.gnagna@gnigni.gne");
        System.out.println("I'm " + mel.greetings());

        Person dim = new Person("Doum","dim.doum@dam.fr");



    }

    /**
     *
     * Les paramètres d'une méthode se nomment signatures
     */
    public Main(String name){
        System.out.println("Hello" + name);
    }

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