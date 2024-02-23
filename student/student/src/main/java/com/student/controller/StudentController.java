package com.student.controller;

import com.student.entity.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {

//    @Autowired
//    StudentService studentServiceImpl;
//    @PostMapping("/addStudent")
//    public ResponseEntity<Student> addAdmin(@RequestBody Student student) {
//        return new ResponseEntity<>(studentServiceImpl.addStudent(student), HttpStatus.OK);
//    }
//
//    @GetMapping("/getStudent/{id}")
//    public ResponseEntity<Student> getStudent(@PathVariable Long id) {
//        return new ResponseEntity<>(studentServiceImpl.getStudent(id), HttpStatus.OK);
//    }
//    @PutMapping("/updateStudent")
//    public ResponseEntity<Student> updateAdmin(@RequestBody Student student) {
//        return new ResponseEntity<>(studentServiceImpl.updateStudent(student), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/deleteStudent/{id}")
//    public ResponseEntity<String> delete(@PathVariable Long id) {
//        return new ResponseEntity<>(studentServiceImpl.deleteStudent(id), HttpStatus.OK);
//    }
//
//    @GetMapping("/getAll")
//    public ResponseEntity <List<Student>> getALlStudent() {
//        return new ResponseEntity<>(studentServiceImpl.getAllStudent(), HttpStatus.OK);
//    }

    @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.OK);
    }

    @GetMapping("/getStudent")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        return new ResponseEntity<>(studentService.getStudent(id),HttpStatus.OK);
    }
    @PutMapping("/updateStudent")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.updateStudent(student),HttpStatus.OK);
    }
    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        return new ResponseEntity<>(studentService.deleteStudent(id),HttpStatus.OK);
    }
    @GetMapping("/getAllStudent")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<>(studentService.getAllStudent(),HttpStatus.OK);
    }
}
