package com.example.test.modelclass;



import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class DATum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("StudentName")
    @Expose
    private String studentName;
    @SerializedName("RegNo")
    @Expose
    private String regNo;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("ParentName")
    @Expose
    private String parentName;
    @SerializedName("ParentMob")
    @Expose
    private String parentMob;
    @SerializedName("Class")
    @Expose
    private String _class;
    @SerializedName("Division")
    @Expose
    private String division;
    @SerializedName("SubjectName")
    @Expose
    private String subjectName;
    @SerializedName("MaxMark")
    @Expose
    private Integer maxMark;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(Integer maxMark) {
        this.maxMark = maxMark;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentMob() {
        return parentMob;
    }

    public void setParentMob(String parentMob) {
        this.parentMob = parentMob;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

}