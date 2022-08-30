package com.example.springschool.models;

import javax.persistence.*;

@Entity
@Table(name="tables")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long grade;

    @Column
    private String comment;

    public Report() {
    }

    public Report(long grade, String comment) {
        this.grade = grade;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
