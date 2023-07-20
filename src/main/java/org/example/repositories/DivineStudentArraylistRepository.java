package org.example.services;

import org.example.models.Student;

import java.util.ArrayList;
import java.util.List;

public class DivineStudentArraylistRepository implements StudentRepository {
    List<Student> students = new ArrayList<>();
    @Override
    public Student findStudent(int id) {
        for (Student student : students)
            if (student.getId() == id)
                return student;

        return null;
    }
}
