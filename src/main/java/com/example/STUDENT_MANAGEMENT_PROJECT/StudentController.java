package com.example.STUDENT_MANAGEMENT_PROJECT;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    // Where I define the API's

    HashMap<Integer,Student> hashMap = new HashMap<>();

    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student student){

        int key = student.getRollNo();
        hashMap.put(key,student);

    }

    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){

        Student student = hashMap.get(rollNo);

        return student;
    }


}
