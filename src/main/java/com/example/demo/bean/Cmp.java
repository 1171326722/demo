package com.example.demo.bean;

import java.io.Serializable;

public class Cmp implements Serializable {
    private Integer cmpNub;

    private String cmpName;

    private String tel;

    private String adr;

    private String email;

    private String cmpType;

    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getCmpNub() {
        return cmpNub;
    }

    public void setCmpNub(Integer cmpNub) {
        this.cmpNub = cmpNub;
    }

    public String getCmpName() {
        return cmpName;
    }

    public void setCmpName(String cmpName) {
        this.cmpName = cmpName == null ? null : cmpName.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr == null ? null : adr.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCmpType() {
        return cmpType;
    }

    public void setCmpType(String cmpType) {
        this.cmpType = cmpType == null ? null : cmpType.trim();
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
        sb.append(", cmpNub=").append(cmpNub);
        sb.append(", cmpName=").append(cmpName);
        sb.append(", tel=").append(tel);
        sb.append(", adr=").append(adr);
        sb.append(", email=").append(email);
        sb.append(", cmpType=").append(cmpType);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}