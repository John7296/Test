package com.example.test.modelclass;


import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Example {



    @SerializedName("d")
    @Expose
    private D d;

    public Example() {

    }

    public D getD() {
        return d;
    }

    public void setD(D d) {
        this.d = d;
    }

}