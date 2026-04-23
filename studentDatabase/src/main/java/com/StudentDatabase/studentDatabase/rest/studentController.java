package com.StudentDatabase.studentDatabase.rest;

import com.StudentDatabase.studentDatabase.dao.studentDatabaseDAO;
import com.StudentDatabase.studentDatabase.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class studentController {

    private studentDatabaseDAO studentDatabaseDAO;

    @Autowired
    public studentController(studentDatabaseDAO studentDatabaseDAO) {
        this.studentDatabaseDAO = studentDatabaseDAO;
    }

    // GET all students
    @GetMapping("/students")
    public List<Data> getAllStudents() {
        return studentDatabaseDAO.findAll();
    }

    // GET student by ID
    @GetMapping("/students/{id}")
    public Data getStudentById(@PathVariable int id) {
        return studentDatabaseDAO.findById(id);
    }

    // CREATE new student
    @PostMapping("/students")
    public String createStudent(@RequestBody Data data) {
        studentDatabaseDAO.save(data);
        return "Student saved: " + data.getStudentName();
    }

    // UPDATE student
    @PutMapping("/students/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Data data) {
        data.setId(id);
        studentDatabaseDAO.update(data);
        return "Student updated: " + data.getStudentName();
    }

    // DELETE student
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        Data data = studentDatabaseDAO.findById(id);
        if (data != null) {
            // Add delete method to your DAO
            return "Student deleted";
        }
        return "Student not found";
    }
}