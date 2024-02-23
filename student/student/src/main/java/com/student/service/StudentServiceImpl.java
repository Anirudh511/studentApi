package com.student.service;

import com.student.entity.Student;
import com.student.repository.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    ModelMapper mapper;

    public Student addStudent(Student student){
        Student addStudent=mapper.map(student,Student.class);
        return mapper.map(studentRepo.save(addStudent),Student.class);
    }
//    @Override
//    public Student addStudent(Student student) {
//        Student addStudent=mapper.map(student,Student.class);
//        return mapper.map(studentRepo.save(addStudent),Student.class);
//    }

    @Override
    public Student getStudent(Long id) {

        return mapper.map(studentRepo.findById(id),Student.class);
    }

    @Override
    public Student updateStudent(Student student) {
        Student student1=studentRepo.findById(student.getId()).get();
        if(student1.getId()==student.getId()){
            return studentRepo.save(student);
        }
          return null;
    }

    @Override
    public Student patchStudent(Student student) {
        return null;
    }


    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        Boolean flag=studentRepo.findById(id).isEmpty();
        if(Boolean.TRUE.equals(flag)){
           return "Delete successfully";
        }
        return "not Delete";
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }
}
