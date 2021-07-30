package com.example.tutorready.models;

public class Grade {

    private String idlop ;
    private String tenlop;
    private String request;

    public Grade(String idlop, String tenlop, String request) {
        this.idlop = idlop;
        this.tenlop = tenlop;
        this.request=request;
    }

    public Grade() {
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

    public String toString(){
        return getIdlop()+ "|" +getTenlop();
    }
}
