package com.baizhi.service;

import com.baizhi.entity.Student;

public interface StudentService {
    public void insert(Student student);
    public void delete(String id);
    public void update(Student student);
}
