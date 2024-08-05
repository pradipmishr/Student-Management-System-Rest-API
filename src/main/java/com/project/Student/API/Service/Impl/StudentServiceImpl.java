package com.project.Student.API.Service.Impl;
import com.project.Student.API.ExceptionHandler.ResourceNotFoundException;
import com.project.Student.API.Model.Student;
import com.project.Student.API.Repository.StudentRepository;
import com.project.Student.API.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
    super();
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Student","Id",id));
    }

    @Override
    public Student updateStudent(Student student,long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Student","Id",id));
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setClasss(student.getClasss());
        existingStudent.setSection(student.getSection());
        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Student","Id",id));
        studentRepository.deleteById(id);
    }
}
