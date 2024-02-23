package com.student.service;

import com.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student addStudent(Student student);
    Student getStudent(Long id);
    Student updateStudent(Student student);
    Student patchStudent(Student student);
    String  deleteStudent(Long id);
     List<Student> getAllStudent();
}
