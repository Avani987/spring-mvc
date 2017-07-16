package com.exercise.controller;

public class Student {

    String fname;
    String lname;

    public Student() {
        fname=null;
        lname=null;
    }

    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}
