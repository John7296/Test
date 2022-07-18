package com.example.test.modelclass;

import java.util.List;
        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class D {

    @SerializedName("__type")
    @Expose
    private String type;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("DATA")
    @Expose
    public List<List<DATum>> data = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<List<DATum>> getData() {
        return data;
    }

    public void setData(List<List<DATum>> data) {
        this.data = data;
    }

}