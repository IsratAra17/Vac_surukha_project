package com.example.surokhaapp.ModelClass;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelClass {
    @SerializedName("category")   /*1*/
    @Expose
    private String category;
    @SerializedName("nid")   /*1*/
    @Expose
    private String nid;
    @SerializedName("dob")   /*1*/
    @Expose
    private String dob;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
