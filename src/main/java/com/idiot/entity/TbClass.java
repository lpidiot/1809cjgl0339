package com.idiot.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @auther idiot
 * @date 2018/9/18 - 10:29
 */
@Entity
@Table(name = "dqm_tbclass")
public class TbClass {
    private Integer id;
    private String name;
    private String teacher;
    private List<Student> studens;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(length = 10)
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @OneToMany(mappedBy = "tbClass")
    public List<Student> getStudens() {
        return studens;
    }

    public void setStudens(List<Student> studens) {
        this.studens = studens;
    }

    public TbClass() {
        super();
    }

    public TbClass(Integer id, String name, String teacher, List<Student> studens) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.studens = studens;
    }
}
