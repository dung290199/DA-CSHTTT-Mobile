package com.tutoringcenter.apptutor.models;

import java.util.Date;

public class Student {
    private String username ;
    private String password;
    private String email ;
    private  String role;
    private String fullname;
    private Date birthday;
    private String phone;
    private String address;
    private Boolean gender;
    private String picture;

    public Student() {
    }
    public Student(String fullname, String address, String phone) {
        this.fullname = fullname;
        this.phone = phone;
        this.address = address;
    }
    public Student(String username, String password, String email, String role, String fullname, Date birthday, String phone, String address, Boolean gender, String picture) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.fullname = fullname;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
        this.picture = picture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "name='" + username + '\'' +
                ", email='" + email + '\'' +
                ", sdt='" + phone + '\'' +
                '}';
    }
}
