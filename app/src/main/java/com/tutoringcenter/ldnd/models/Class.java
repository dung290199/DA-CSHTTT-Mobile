package com.tutoringcenter.ldnd.models;

public class Class {

    private String idlop ;
    private String tenlop;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Class(String idlop, String tenlop, int id) {
        this.idlop = idlop;
        this.tenlop = tenlop;
        this.id = id;
    }

    public Class() {
    }

    public Class(String idlop, String tenlop) {
        this.idlop = idlop;
        this.tenlop = tenlop;
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

    public  String toString(){
        return getIdlop()+ "|" +getTenlop();
    }
}
