package com.exercise.demo.model;

import java.util.List;

public class Relation {
    private int relationid;
    private int rid;
    private int gid;
    private Repertory repertory;

    public Relation() {
    }

    public Relation(int relationid, int rid, int gid) {
        this.relationid = relationid;
        this.rid = rid;
        this.gid = gid;
    }

    public Relation(int relationid, int rid, int gid, Repertory repertory) {
        this.relationid = relationid;
        this.rid = rid;
        this.gid = gid;
        this.repertory = repertory;
    }

    public Repertory getRepertory() {
        return repertory;
    }

    public void setRepertory(Repertory repertory) {
        this.repertory = repertory;
    }

    public int getRelationid() {
        return relationid;
    }

    public void setRelationid(int relationid) {
        this.relationid = relationid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

}
