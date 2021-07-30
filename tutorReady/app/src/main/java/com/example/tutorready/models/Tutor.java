package com.example.tutorready.models;
public class Tutor {
    private String id;
    private String username ;
    private String password;
    private String email ;
    private String role;
    private String fullname;
    private String birthday;
    private String phone;
    private String address;
    private Boolean gender;
    private String picture;
    private String cv;


    public Tutor() {
       }
    public Tutor(String id, String fullname, String birthday) {
        this.id=id;
        this.fullname = fullname;
        this.address = birthday;
    }
    public Tutor(String id, String username, String password, String email, String role, String fullname, String birthday, String phone, String address, Boolean gender, String picture, String cv) {
        this.id=id;
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
        this.cv = cv;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "name='" + username + '\'' +
                ", sdt='" + phone + '\'' +
                '}';
    }
}
