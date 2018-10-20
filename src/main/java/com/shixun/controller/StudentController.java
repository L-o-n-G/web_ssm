package com.shixun.controller;

import com.shixun.dao.StudentMapper;
import com.shixun.entity.Student;
import com.shixun.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    @RequestMapping("/test")
    public String test(){
        Student stu=new Student();
        stu.setId(IdGenerator.getID());
        stu.setName("杨龙");
        System.out.println("ok");
        studentMapper.insert(stu);
        return "hehe";
    }
}
