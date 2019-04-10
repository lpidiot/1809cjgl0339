package com.idiot.service;

import com.idiot.common.CommonService;
import com.idiot.entity.Student;
import com.idiot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther idiot
 * @date 2018/9/30 - 8:09
 */
@Service
public class StudentService extends CommonService<Student,Integer> {
    @Autowired
    private StudentRepository repository;
    public Student findByXuehaoAndPassword(String xuehao,String password){
        return repository.findByXuehaoAndPassword(xuehao,password);
    }
}
