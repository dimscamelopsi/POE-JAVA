package fr.aelion.models;

public class Person {
    private String lastName;
    private String firstName;

    private String phoneNumber;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Person() {}

    /**
     *Ce type de constructeur est à éviter s'il y a trop d'attributs en paramètres
     */
    public Person(String lastName, String firstName, String phoneNumber, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Person (String lastName, String email) {
        this.lastName = lastName;
        this.email = email;
    }
    public String greetings() {
        return this.firstName.toUpperCase() + " " + this.lastName.toUpperCase();
    }
}
