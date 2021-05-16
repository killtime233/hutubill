package com.hutubill.entity;

import java.io.DataInputStream;
import java.util.Date;

public class Record {
    private int spend;
    private int id;
    private int cid;
    private String comment;
    public Date date;

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSpend() {
        return spend;
    }

    public int getId() {
        return id;
    }

    public int getCid() {
        return cid;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }
}
