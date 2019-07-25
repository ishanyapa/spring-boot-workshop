package me.ishanyapa.demo.service.Impl;

import me.ishanyapa.demo.domain.Student;
import me.ishanyapa.demo.repository.StudentRepository;
import me.ishanyapa.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(String id, Student student) {
        return null;
    }

    @Override
    public Student findStudentById(String id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student delete(String id) {
        return null;
    }
}
