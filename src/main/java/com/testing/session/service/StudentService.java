package com.testing.session.service;

import com.testing.session.dto.request.StudentRequestDto;

import java.util.List;

public interface StudentService {

    void createStudent(StudentRequestDto studentRequestDto);

    void editStudent(StudentRequestDto studentRequestDto);

    List getStudents();

}
