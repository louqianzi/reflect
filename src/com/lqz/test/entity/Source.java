package com.lqz.test.entity;

import com.lqz.test.annotation.IgnoreField;
import com.lqz.test.annotation.TargetField;

import java.util.Date;

public class Source {
    @TargetField("name")
    private String Sname;
    @IgnoreField
    private String Snumber;
    @TargetField("age")
    private int age;
    @TargetField("score")
    private double score;
    @TargetField("birthday")
    private Date Sbrithday;
    @IgnoreField
    private String selse;

    @Override
    public String toString() {
        return "Source{" +
                "Sname='" + Sname + '\'' +
                ", Snumber='" + Snumber + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", Sbrithday=" + Sbrithday +
                ", selse='" + selse + '\'' +
                '}';
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSnumber() {
        return Snumber;
    }

    public void setSnumber(String snumber) {
        Snumber = snumber;
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

    public Date getSbrithday() {
        return Sbrithday;
    }

    public void setSbrithday(Date sbrithday) {
        Sbrithday = sbrithday;
    }

    public String getSelse() {
        return selse;
    }

    public void setSelse(String selse) {
        this.selse = selse;
    }

    public Source() {
    }

    public Source(String sname, String snumber, int age, double score, Date sbrithday, String selse) {
        Sname = sname;
        Snumber = snumber;
        this.age = age;
        this.score = score;
        Sbrithday = sbrithday;
        this.selse = selse;
    }
}
