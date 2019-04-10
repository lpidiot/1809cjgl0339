package com.idiot.entity;

import javax.persistence.*;

/**
 * @auther idiot
 * @date 2018/9/18 - 15:30
 */
@Entity
@Table(name = "dqm_score")
public class Score {
    private Integer id;
    private Student student;
    private Course course;
    private Integer scord;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getScord() {
        return scord;
    }

    public void setScord(Integer scord) {
        this.scord = scord;
    }
}
