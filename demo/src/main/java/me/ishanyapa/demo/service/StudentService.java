package me.ishanyapa.demo.service;

import me.ishanyapa.demo.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    public Student save(Student student);

    public Student update(String id, Student student);

    public Student findStudentById(String id);

    public List<Student> findAll();

    public Student delete(String id);
}
