package com.StudentDatabase.studentDatabase.dao;

import com.StudentDatabase.studentDatabase.entity.Data;

import java.util.List;

public interface studentDatabaseDAO {

    void save (Data data);

    Data findById (int id);

    List<Data> findAll ();

    void update (Data data);
}
