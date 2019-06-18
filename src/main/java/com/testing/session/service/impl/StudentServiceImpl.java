package com.testing.session.service.impl;

import com.testing.session.dao.StudentDao;
import com.testing.session.dto.request.StudentRequestDto;
import com.testing.session.model.Student;
import com.testing.session.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "StudentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao mStudentDao;

    @Override
    public void createStudent(StudentRequestDto studentRequestDto) {
        Student student = new Student();
        student.setFullName(studentRequestDto.getFullName());
        student.setAddress(studentRequestDto.getAddress());
        mStudentDao.addStudent(student);
    }

    @Override
    public void editStudent(StudentRequestDto studentRequestDto) {
        Student student = new Student();
        student.setStudentId(studentRequestDto.getStudentId());
        student.setFullName(studentRequestDto.getFullName());
        student.setAddress(studentRequestDto.getAddress());
        mStudentDao.updateStudent(student);
    }

    @Override
    public List getStudents() {
        List list = mStudentDao.getAllStudent();
        return list;
    }
}
