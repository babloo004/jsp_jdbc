package com.avinash.Servlet.model;


public class Student {

    //instance variables
    private int sid;
    private String first_name;
    private String last_name;
    private int marks;

    //setters

    //sid
    public void setSid(int sid){
        this.sid = sid;
    }

    //first_name
    public void setFirst_name(String fn){
        this.first_name = fn;
    }

    //last_name
    public void setLast_name(String ln){
        this.last_name = ln;
    }

    //marks
    public void setMarks(int marks){
        this.marks = marks;
    }

    //getters

    //sid
    public int getSid(){
        return this.sid;
    }

    //first_name
    public String getFirst_name(){
        return this.first_name;
    }

    //last_name
    public String getLast_name(){
        return this.last_name;
    }

    //marks
    public int getMarks(){
        return this.marks;
    }

    public String toString() {
        return "Student{sid= " + sid + ", First Name= " + first_name +", Last Name= " + last_name + ", marks=" + marks + "}";
    }
}
