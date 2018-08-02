package com.exercise.demo.model;

import java.util.List;

public class Goods {
    private int gid;
    private String gname;
    private List<Relation> relations;

    public List<Relation> getRelations() {
        return relations;
    }

    public void setRelations(List<Relation> relations) {
        this.relations = relations;
    }

    public Goods(int gid, String gname, List<Relation> relations) {
        this.gid = gid;
        this.gname = gname;
        this.relations = relations;
    }

    public Goods() {
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Goods(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }
}
