package com.exercise.demo.model;

public class Sku {
    int sid;
    int gid;
    String scolor;
    String ssize;
    String sstyle;

    public Sku() {
    }

    public Sku(int sid, int gid, String scolor, String ssize, String sstyle) {
        this.sid = sid;
        this.gid = gid;
        this.scolor = scolor;
        this.ssize = ssize;
        this.sstyle = sstyle;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "sid=" + sid +
                ", gid=" + gid +
                ", scolor='" + scolor + '\'' +
                ", ssize='" + ssize + '\'' +
                ", sstyle='" + sstyle + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getScolor() {
        return scolor;
    }

    public void setScolor(String scolor) {
        this.scolor = scolor;
    }

    public String getSsize() {
        return ssize;
    }

    public void setSsize(String ssize) {
        this.ssize = ssize;
    }

    public String getSstyle() {
        return sstyle;
    }

    public void setSstyle(String sstyle) {
        this.sstyle = sstyle;
    }
}
