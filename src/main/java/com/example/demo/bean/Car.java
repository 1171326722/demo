package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {
    private String nub;

    private String type;

    private String name;

    private String color;

    private String engine;

    private String frame;

    private String seller;

    private Date buyDate;

    private String insuranceNub;

    private String insuranceCmp;

    private String insuranceType;

    private String insuranceStartTime;

    private String insuranceEndTime;

    private String deposit;

    private Integer dayRent;

    private Integer weekRent;

    private Integer monthRent;

    private Integer weekendRent;

    private Integer dayLimitKm;

    private Integer overtimeRent;

    private Integer overkmRent;

    private Integer state;

    private String note;

    private static final long serialVersionUID = 1L;

    public String getNub() {
        return nub;
    }

    public void setNub(String nub) {
        this.nub = nub == null ? null : nub.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame == null ? null : frame.trim();
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller == null ? null : seller.trim();
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getInsuranceNub() {
        return insuranceNub;
    }

    public void setInsuranceNub(String insuranceNub) {
        this.insuranceNub = insuranceNub == null ? null : insuranceNub.trim();
    }

    public String getInsuranceCmp() {
        return insuranceCmp;
    }

    public void setInsuranceCmp(String insuranceCmp) {
        this.insuranceCmp = insuranceCmp == null ? null : insuranceCmp.trim();
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType == null ? null : insuranceType.trim();
    }

    public String getInsuranceStartTime() {
        return insuranceStartTime;
    }

    public void setInsuranceStartTime(String insuranceStartTime) {
        this.insuranceStartTime = insuranceStartTime == null ? null : insuranceStartTime.trim();
    }

    public String getInsuranceEndTime() {
        return insuranceEndTime;
    }

    public void setInsuranceEndTime(String insuranceEndTime) {
        this.insuranceEndTime = insuranceEndTime == null ? null : insuranceEndTime.trim();
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit == null ? null : deposit.trim();
    }

    public Integer getDayRent() {
        return dayRent;
    }

    public void setDayRent(Integer dayRent) {
        this.dayRent = dayRent;
    }

    public Integer getWeekRent() {
        return weekRent;
    }

    public void setWeekRent(Integer weekRent) {
        this.weekRent = weekRent;
    }

    public Integer getMonthRent() {
        return monthRent;
    }

    public void setMonthRent(Integer monthRent) {
        this.monthRent = monthRent;
    }

    public Integer getWeekendRent() {
        return weekendRent;
    }

    public void setWeekendRent(Integer weekendRent) {
        this.weekendRent = weekendRent;
    }

    public Integer getDayLimitKm() {
        return dayLimitKm;
    }

    public void setDayLimitKm(Integer dayLimitKm) {
        this.dayLimitKm = dayLimitKm;
    }

    public Integer getOvertimeRent() {
        return overtimeRent;
    }

    public void setOvertimeRent(Integer overtimeRent) {
        this.overtimeRent = overtimeRent;
    }

    public Integer getOverkmRent() {
        return overkmRent;
    }

    public void setOverkmRent(Integer overkmRent) {
        this.overkmRent = overkmRent;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        sb.append(", nub=").append(nub);
        sb.append(", type=").append(type);
        sb.append(", name=").append(name);
        sb.append(", color=").append(color);
        sb.append(", engine=").append(engine);
        sb.append(", frame=").append(frame);
        sb.append(", seller=").append(seller);
        sb.append(", buyDate=").append(buyDate);
        sb.append(", insuranceNub=").append(insuranceNub);
        sb.append(", insuranceCmp=").append(insuranceCmp);
        sb.append(", insuranceType=").append(insuranceType);
        sb.append(", insuranceStartTime=").append(insuranceStartTime);
        sb.append(", insuranceEndTime=").append(insuranceEndTime);
        sb.append(", deposit=").append(deposit);
        sb.append(", dayRent=").append(dayRent);
        sb.append(", weekRent=").append(weekRent);
        sb.append(", monthRent=").append(monthRent);
        sb.append(", weekendRent=").append(weekendRent);
        sb.append(", dayLimitKm=").append(dayLimitKm);
        sb.append(", overtimeRent=").append(overtimeRent);
        sb.append(", overkmRent=").append(overkmRent);
        sb.append(", state=").append(state);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}