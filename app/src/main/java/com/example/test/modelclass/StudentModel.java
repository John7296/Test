package com.example.test.modelclass;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentModel {
    public StudentModel(String request) {
        this.request = request;
    }

    @SerializedName("request")
    @Expose
    private String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

}



