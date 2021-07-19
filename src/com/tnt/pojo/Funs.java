package com.tnt.pojo;

public class Funs {
    private Integer funId;

    private String funName;

    private String funUrl;

    private Integer funPid;

    private String funTarget;

    private Integer funSort;

    private Integer funLevel;

    public Integer getFunId() {
        return funId;
    }

    public void setFunId(Integer funId) {
        this.funId = funId;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName == null ? null : funName.trim();
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl == null ? null : funUrl.trim();
    }

    public Integer getFunPid() {
        return funPid;
    }

    public void setFunPid(Integer funPid) {
        this.funPid = funPid;
    }

    public String getFunTarget() {
        return funTarget;
    }

    public void setFunTarget(String funTarget) {
        this.funTarget = funTarget == null ? null : funTarget.trim();
    }

    public Integer getFunSort() {
        return funSort;
    }

    public void setFunSort(Integer funSort) {
        this.funSort = funSort;
    }

    public Integer getFunLevel() {
        return funLevel;
    }

    public void setFunLevel(Integer funLevel) {
        this.funLevel = funLevel;
    }
}