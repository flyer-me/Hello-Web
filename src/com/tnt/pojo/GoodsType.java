package com.tnt.pojo;

public class GoodsType {
    private Integer typeId;

    private String typeName;

    private Integer typePid;

    private Integer typeLevel;

    private String typePath;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypePid() {
        return typePid;
    }

    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    public Integer getTypeLevel() {
        return typeLevel;
    }

    public void setTypeLevel(Integer typeLevel) {
        this.typeLevel = typeLevel;
    }

    public String getTypePath() {
        return typePath;
    }

    public void setTypePath(String typePath) {
        this.typePath = typePath == null ? null : typePath.trim();
    }
}