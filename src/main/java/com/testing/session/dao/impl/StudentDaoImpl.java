package com.testing.session.dao.impl;

import com.testing.session.dao.StudentDao;
import com.testing.session.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository(value = "StudentDao")
@Transactional
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private EntityManager mEntityManager;

    @Override
    public void addStudent(Student student) {
        mEntityManager.persist(student);
    }

    @Override
    public void updateStudent(Student student) {
        mEntityManager.merge(student);
    }

    @Override
    public List getAllStudent() {
        Query query = mEntityManager.createQuery("Select NEW com.testing.session.dto.response.StudentResponseDto(s.studentId as studentId, s.fullName as fullName, s.address as address) from Student as s");
        List list = query.getResultList();
        return list;
    }
}
