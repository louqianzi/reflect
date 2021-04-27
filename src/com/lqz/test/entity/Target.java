package com.lqz.test.entity;

import java.util.Date;

public class Target {
    private String name;
    private int age;
    private double score;
    private Date birthday;

    public Target() {
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Target(String name, int age, double score, Date birthday) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.birthday = birthday;
    }
}
