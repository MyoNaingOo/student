package com.mno.student.service;

import com.mno.student.entity.Student;
import com.mno.student.reposity.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentSer {

    private final StudentRepo studentRepo;


    public void saveStudent(Student student){
        studentRepo.save(student);
    }


    public List<Student> getallStudent() {
        return studentRepo.findAll();
    }

    public Student update(Student student) {
        return studentRepo.save(student);
    }


    public void delete(Long id) {
        studentRepo.deleteById(id);
    }
}
