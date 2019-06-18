package com.testing.session.dao;

import com.testing.session.model.Student;

import java.util.List;

public interface StudentDao {

    void addStudent(Student student);

    void updateStudent(Student student);

    List getAllStudent();
}
