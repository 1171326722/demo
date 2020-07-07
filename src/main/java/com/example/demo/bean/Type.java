package com.example.demo.bean;

import java.io.Serializable;

public class Type implements Serializable {
    private String typeNub;

    private String typeName;

    private Integer typeSort;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getTypeNub() {
        return typeNub;
    }

    public void setTypeNub(String typeNub) {
        this.typeNub = typeNub == null ? null : typeNub.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Integer typeSort) {
        this.typeSort = typeSort;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", typeNub=").append(typeNub);
        sb.append(", typeName=").append(typeName);
        sb.append(", typeSort=").append(typeSort);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}