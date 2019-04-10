package com.idiot.repository;

import com.idiot.common.CommonRepository;
import com.idiot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @auther idiot
 * @date 2018/9/29 - 22:24
 */
@Repository
public interface StudentRepository extends CommonRepository<Student,Integer> {
    public Student findByXuehaoAndPassword(String xuehao, String password);
}
