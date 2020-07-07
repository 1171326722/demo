package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String userNub;

    private String sex;

    private String name;

    private Integer age;

    private String idNumber;

    private String tel;

    private String workAdr;

    private String homeAdr;

    private String zipCode;

    private String email;

    private String licenseNub;

    private String licenseType;

    private Date licenseStartTime;

    private Date licenseEndTime;

    private String driverYears;

    private String vipCheck;

    private String vipType;

    private String mortgageCer;

    private String guarantee;

    private String guaranteeIdcard;

    private static final long serialVersionUID = 1L;

    public String getUserNub() {
        return userNub;
    }

    public void setUserNub(String userNub) {
        this.userNub = userNub == null ? null : userNub.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getWorkAdr() {
        return workAdr;
    }

    public void setWorkAdr(String workAdr) {
        this.workAdr = workAdr == null ? null : workAdr.trim();
    }

    public String getHomeAdr() {
        return homeAdr;
    }

    public void setHomeAdr(String homeAdr) {
        this.homeAdr = homeAdr == null ? null : homeAdr.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLicenseNub() {
        return licenseNub;
    }

    public void setLicenseNub(String licenseNub) {
        this.licenseNub = licenseNub == null ? null : licenseNub.trim();
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType == null ? null : licenseType.trim();
    }

    public Date getLicenseStartTime() {
        return licenseStartTime;
    }

    public void setLicenseStartTime(Date licenseStartTime) {
        this.licenseStartTime = licenseStartTime;
    }

    public Date getLicenseEndTime() {
        return licenseEndTime;
    }

    public void setLicenseEndTime(Date licenseEndTime) {
        this.licenseEndTime = licenseEndTime;
    }

    public String getDriverYears() {
        return driverYears;
    }

    public void setDriverYears(String driverYears) {
        this.driverYears = driverYears == null ? null : driverYears.trim();
    }

    public String getVipCheck() {
        return vipCheck;
    }

    public void setVipCheck(String vipCheck) {
        this.vipCheck = vipCheck == null ? null : vipCheck.trim();
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType == null ? null : vipType.trim();
    }

    public String getMortgageCer() {
        return mortgageCer;
    }

    public void setMortgageCer(String mortgageCer) {
        this.mortgageCer = mortgageCer == null ? null : mortgageCer.trim();
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee == null ? null : guarantee.trim();
    }

    public String getGuaranteeIdcard() {
        return guaranteeIdcard;
    }

    public void setGuaranteeIdcard(String guaranteeIdcard) {
        this.guaranteeIdcard = guaranteeIdcard == null ? null : guaranteeIdcard.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userNub=").append(userNub);
        sb.append(", sex=").append(sex);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", tel=").append(tel);
        sb.append(", workAdr=").append(workAdr);
        sb.append(", homeAdr=").append(homeAdr);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", email=").append(email);
        sb.append(", licenseNub=").append(licenseNub);
        sb.append(", licenseType=").append(licenseType);
        sb.append(", licenseStartTime=").append(licenseStartTime);
        sb.append(", licenseEndTime=").append(licenseEndTime);
        sb.append(", driverYears=").append(driverYears);
        sb.append(", vipCheck=").append(vipCheck);
        sb.append(", vipType=").append(vipType);
        sb.append(", mortgageCer=").append(mortgageCer);
        sb.append(", guarantee=").append(guarantee);
        sb.append(", guaranteeIdcard=").append(guaranteeIdcard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}