package me.ishanyapa.demo.controller;

import me.ishanyapa.demo.Constant.Constants;
import me.ishanyapa.demo.domain.Student;
import me.ishanyapa.demo.service.Impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = Constants.REQUEST_MAPPING.STUDENT)
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Student> addStudent(@RequestBody @Valid Student student) {
        return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);
    }
}
