package com.baizhi.service;

import com.baizhi.dao.StudentDAO;
import com.baizhi.entity.Student;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO;

    public void setStudentDAO(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }

    @Override
    public void insert(Student student) {
        studentDAO.insert(student);
    }

    @Override
    public void delete(String id) {
        studentDAO.delete(id);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }
}
