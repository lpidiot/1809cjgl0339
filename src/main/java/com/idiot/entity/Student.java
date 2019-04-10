package com.idiot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther idiot
 * @date 2018/9/18 - 10:28
 */
@Entity
@Table(name = "dqm_student")
public class Student {
    private Integer id;
    private String name;
    private String xuehao;
    private String password;
    private String sex;
    private Integer manager;
    private TbClass tbClass;
    private List<Course> courses;
    private List<Score> scores;

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

    @Column(length = 10,unique = true)
    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    @Column(length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Column(length = 1)
    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    @ManyToOne
    public TbClass getTbClass() {
        return tbClass;
    }

    public void setTbClass(TbClass tbClass) {
        this.tbClass = tbClass;
    }

   /* @ManyToMany
    @JoinTable(name="student_course",joinColumns = {@JoinColumn(name="student_id")},inverseJoinColumns = {@JoinColumn(name="course_id")})
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
*/

   @Transient
   public List<Course> getCourses() {
       List<Course> courses=new ArrayList<>();
       for (Score score : getScores()) {
           courses.add(score.getCourse());
       }
        return courses;
    }

    @Transient
    public String getCoursesName(){
       String course="";
        for (Course co : getCourses()) {
            course+=co.getCourse()+",";
        }
        if(course.length()>0){
            course=course.substring(0,course.length()-1);
        }
        return course;

    }


    @OneToMany(mappedBy = "student")
    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student() {
        super();
    }


}
