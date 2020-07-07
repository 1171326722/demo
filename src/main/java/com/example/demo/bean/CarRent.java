package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class CarRent implements Serializable {
    private String contractNub;

    private String licenseNumber;

    private String userNub;

    private Date rentTime;

    private String rentModel;

    private Integer rentPrice;

    private Integer weekendPrice;

    private String rentNub;

    private String weekendNub;

    private String deposit;

    private String mileagePerday;

    private String mileage;

    private Integer overkmPrice;

    private Integer overtimePrice;

    private Date shouldReturnTime;

    private String kmReturn;

    private Integer otherPay;

    private Double discount;

    private Double actualPay;

    private Double allPay;

    private String state;

    private Date createDate;

    private String createPeople;

    private Date actualReturnTime;

    private static final long serialVersionUID = 1L;

    public String getContractNub() {
        return contractNub;
    }

    public void setContractNub(String contractNub) {
        this.contractNub = contractNub == null ? null : contractNub.trim();
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    public String getUserNub() {
        return userNub;
    }

    public void setUserNub(String userNub) {
        this.userNub = userNub == null ? null : userNub.trim();
    }

    public Date getRentTime() {
        return rentTime;
    }

    public void setRentTime(Date rentTime) {
        this.rentTime = rentTime;
    }

    public String getRentModel() {
        return rentModel;
    }

    public void setRentModel(String rentModel) {
        this.rentModel = rentModel == null ? null : rentModel.trim();
    }

    public Integer getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Integer rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Integer getWeekendPrice() {
        return weekendPrice;
    }

    public void setWeekendPrice(Integer weekendPrice) {
        this.weekendPrice = weekendPrice;
    }

    public String getRentNub() {
        return rentNub;
    }

    public void setRentNub(String rentNub) {
        this.rentNub = rentNub == null ? null : rentNub.trim();
    }

    public String getWeekendNub() {
        return weekendNub;
    }

    public void setWeekendNub(String weekendNub) {
        this.weekendNub = weekendNub == null ? null : weekendNub.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public String getMileagePerday() {
        return mileagePerday;
    }

    public void setMileagePerday(String mileagePerday) {
        this.mileagePerday = mileagePerday == null ? null : mileagePerday.trim();
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    public Integer getOverkmPrice() {
        return overkmPrice;
    }

    public void setOverkmPrice(Integer overkmPrice) {
        this.overkmPrice = overkmPrice;
    }

    public Integer getOvertimePrice() {
        return overtimePrice;
    }

    public void setOvertimePrice(Integer overtimePrice) {
        this.overtimePrice = overtimePrice;
    }

    public Date getShouldReturnTime() {
        return shouldReturnTime;
    }

    public void setShouldReturnTime(Date shouldReturnTime) {
        this.shouldReturnTime = shouldReturnTime;
    }

    public String getKmReturn() {
        return kmReturn;
    }

    public void setKmReturn(String kmReturn) {
        this.kmReturn = kmReturn == null ? null : kmReturn.trim();
    }

    public Integer getOtherPay() {
        return otherPay;
    }

    public void setOtherPay(Integer otherPay) {
        this.otherPay = otherPay;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getActualPay() {
        return actualPay;
    }

    public void setActualPay(Double actualPay) {
        this.actualPay = actualPay;
    }

    public Double getAllPay() {
        return allPay;
    }

    public void setAllPay(Double allPay) {
        this.allPay = allPay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }

    public Date getActualReturnTime() {
        return actualReturnTime;
    }

    public void setActualReturnTime(Date actualReturnTime) {
        this.actualReturnTime = actualReturnTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contractNub=").append(contractNub);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", userNub=").append(userNub);
        sb.append(", rentTime=").append(rentTime);
        sb.append(", rentModel=").append(rentModel);
        sb.append(", rentPrice=").append(rentPrice);
        sb.append(", weekendPrice=").append(weekendPrice);
        sb.append(", rentNub=").append(rentNub);
        sb.append(", weekendNub=").append(weekendNub);
        sb.append(", deposit=").append(deposit);
        sb.append(", mileagePerday=").append(mileagePerday);
        sb.append(", mileage=").append(mileage);
        sb.append(", overkmPrice=").append(overkmPrice);
        sb.append(", overtimePrice=").append(overtimePrice);
        sb.append(", shouldReturnTime=").append(shouldReturnTime);
        sb.append(", kmReturn=").append(kmReturn);
        sb.append(", otherPay=").append(otherPay);
        sb.append(", discount=").append(discount);
        sb.append(", actualPay=").append(actualPay);
        sb.append(", allPay=").append(allPay);
        sb.append(", state=").append(state);
        sb.append(", createDate=").append(createDate);
        sb.append(", createPeople=").append(createPeople);
        sb.append(", actualReturnTime=").append(actualReturnTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}