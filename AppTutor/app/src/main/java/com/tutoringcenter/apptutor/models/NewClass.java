package com.tutoringcenter.apptutor.models;

public class NewClass {

    private String idlop ;
    private String tenlop;
    private String subject;
    private String grade;
    private String salary;
    private String numberOfLessons;
    private String request;

    public NewClass(String idlop, String tenlop, String request) {
        this.idlop = idlop;
        this.tenlop = tenlop;
        this.request=request;
    }

    public NewClass(String idlop, String tenlop, String subject, String grade, String salary, String numberOfLessons, String request) {
        this.idlop = idlop;
        this.tenlop = tenlop;
        this.subject = subject;
        this.grade = grade;
        this.salary = salary;
        this.numberOfLessons = numberOfLessons;
        this.request = request;
    }

    public NewClass() {
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getNumberOfLessons() {
        return numberOfLessons;
    }

    public void setNumberOfLessons(String numberOfLessons) {
        this.numberOfLessons = numberOfLessons;
    }


    public String getIdlop() {
        return idlop;
    }

    public void setIdlop(String idlop) {
        this.idlop = idlop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public  String toString(){
        return getIdlop()+ "|" +getTenlop();
    }
}
