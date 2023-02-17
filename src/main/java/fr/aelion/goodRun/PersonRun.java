package fr.aelion.goodRun;

import fr.aelion.models.Person;

public class PersonRun {
    public void run() {
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
}
