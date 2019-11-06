package com.baizhi.dao;

import com.baizhi.entity.Student;

public interface StudentDAO {
    public void insert(Student student);
    public void delete(String id);
    public void update(Student student);

}
