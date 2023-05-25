package com.mno.student.controller;



import com.mno.student.entity.Student;
import com.mno.student.service.StudentSer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/student")
@RequiredArgsConstructor
public class StudentController {


    private final StudentSer studentSer;


    @PostMapping("save")
    private void saveStudent(@RequestBody Student student){
        studentSer.saveStudent(student);
    }

    @GetMapping("all")
    private List<Student> getallStudent(){
        return studentSer.getallStudent();
    }
    @PutMapping("update")
    private Student update(@RequestBody Student student){
        return studentSer.update(student);
    }


    @DeleteMapping("delete/{id}")
    private void delete(@PathVariable("id") Long id){
        studentSer.delete(id);
    }

    


}
