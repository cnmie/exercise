package com.exercise.demo.model;

public class Repertory {
    private int rid;
    private String rname;
    private String raddress;

    public int getRid() {
        return rid;
    }

    public Repertory(int rid, String rname, String raddress) {
        this.rid = rid;
        this.rname = rname;
        this.raddress = raddress;
    }

    @Override
    public String toString() {
        return "Repertory{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", raddress='" + raddress + '\'' +
                '}';
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRaddress() {
        return raddress;
    }

    public void setRaddress(String raddress) {
        this.raddress = raddress;
    }
}
