package com.idiot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther idiot
 * @date 2018/9/18 - 10:29
 */
@Entity
@Table(name = "dqm_course")
public class Course {
    private Integer id;
    private String course;
    private List<Student> students;
    private List<Score> scord;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 20)
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Transient
    public List<Student> getStudents() {
        List<Student> students=new ArrayList<>();
        for (Score score : getScord()) {
            students.add(score.getStudent());
        }
        return students;
    }



    @OneToMany(mappedBy = "course")
    public List<Score> getScord() {
        return scord;
    }

    public void setScord(List<Score> scord) {
        this.scord = scord;
    }

    public Course() {
        super();
    }

    public Course(Integer id, String course, List<Student> students) {
        this.id = id;
        this.course = course;
        this.students = students;
    }
}
