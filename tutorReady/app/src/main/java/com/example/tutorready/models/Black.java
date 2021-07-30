package com.example.tutorready.models;

public class Black {
    private String fullName ;
    private String phone;
    private String grade ;
    private String reason;
    public  Black(){

    }

    public Black(String fullName, String phone, String grade, String reason) {
        this.fullName = fullName;
        this.phone = phone;
        this.grade = grade;
        this.reason = reason;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
