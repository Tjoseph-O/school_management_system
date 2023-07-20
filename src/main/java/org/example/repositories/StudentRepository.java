package org.example.services;

import org.example.models.Student;

public interface StudentRepository {
    Student findStudent(int id);
}
