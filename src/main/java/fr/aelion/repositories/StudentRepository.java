package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> students = new ArrayList<>();

    public StudentRepository() {
        this.populate();
    }

    private void populate() {
        Student student = new Student("Endive","Chicon", "chicon.endive@picardie.com");
        student.setUsername("dim");
        student.setPassword("blabla");

        // Add student to list
        this.students.add(student);
    }
}
