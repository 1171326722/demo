package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarRentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarRentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContractNubIsNull() {
            addCriterion("contract_nub is null");
            return (Criteria) this;
        }

        public Criteria andContractNubIsNotNull() {
            addCriterion("contract_nub is not null");
            return (Criteria) this;
        }

        public Criteria andContractNubEqualTo(String value) {
            addCriterion("contract_nub =", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubNotEqualTo(String value) {
            addCriterion("contract_nub <>", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubGreaterThan(String value) {
            addCriterion("contract_nub >", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubGreaterThanOrEqualTo(String value) {
            addCriterion("contract_nub >=", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubLessThan(String value) {
            addCriterion("contract_nub <", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubLessThanOrEqualTo(String value) {
            addCriterion("contract_nub <=", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubLike(String value) {
            addCriterion("contract_nub like", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubNotLike(String value) {
            addCriterion("contract_nub not like", value, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubIn(List<String> values) {
            addCriterion("contract_nub in", values, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubNotIn(List<String> values) {
            addCriterion("contract_nub not in", values, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubBetween(String value1, String value2) {
            addCriterion("contract_nub between", value1, value2, "contractNub");
            return (Criteria) this;
        }

        public Criteria andContractNubNotBetween(String value1, String value2) {
            addCriterion("contract_nub not between", value1, value2, "contractNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andUserNubIsNull() {
            addCriterion("user_nub is null");
            return (Criteria) this;
        }

        public Criteria andUserNubIsNotNull() {
            addCriterion("user_nub is not null");
            return (Criteria) this;
        }

        public Criteria andUserNubEqualTo(String value) {
            addCriterion("user_nub =", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubNotEqualTo(String value) {
            addCriterion("user_nub <>", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubGreaterThan(String value) {
            addCriterion("user_nub >", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubGreaterThanOrEqualTo(String value) {
            addCriterion("user_nub >=", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubLessThan(String value) {
            addCriterion("user_nub <", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubLessThanOrEqualTo(String value) {
            addCriterion("user_nub <=", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubLike(String value) {
            addCriterion("user_nub like", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubNotLike(String value) {
            addCriterion("user_nub not like", value, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubIn(List<String> values) {
            addCriterion("user_nub in", values, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubNotIn(List<String> values) {
            addCriterion("user_nub not in", values, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubBetween(String value1, String value2) {
            addCriterion("user_nub between", value1, value2, "userNub");
            return (Criteria) this;
        }

        public Criteria andUserNubNotBetween(String value1, String value2) {
            addCriterion("user_nub not between", value1, value2, "userNub");
            return (Criteria) this;
        }

        public Criteria andRentTimeIsNull() {
            addCriterion("rent_time is null");
            return (Criteria) this;
        }

        public Criteria andRentTimeIsNotNull() {
            addCriterion("rent_time is not null");
            return (Criteria) this;
        }

        public Criteria andRentTimeEqualTo(Date value) {
            addCriterionForJDBCDate("rent_time =", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("rent_time <>", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("rent_time >", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_time >=", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeLessThan(Date value) {
            addCriterionForJDBCDate("rent_time <", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rent_time <=", value, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeIn(List<Date> values) {
            addCriterionForJDBCDate("rent_time in", values, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("rent_time not in", values, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_time between", value1, value2, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rent_time not between", value1, value2, "rentTime");
            return (Criteria) this;
        }

        public Criteria andRentModelIsNull() {
            addCriterion("rent_model is null");
            return (Criteria) this;
        }

        public Criteria andRentModelIsNotNull() {
            addCriterion("rent_model is not null");
            return (Criteria) this;
        }

        public Criteria andRentModelEqualTo(String value) {
            addCriterion("rent_model =", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelNotEqualTo(String value) {
            addCriterion("rent_model <>", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelGreaterThan(String value) {
            addCriterion("rent_model >", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelGreaterThanOrEqualTo(String value) {
            addCriterion("rent_model >=", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelLessThan(String value) {
            addCriterion("rent_model <", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelLessThanOrEqualTo(String value) {
            addCriterion("rent_model <=", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelLike(String value) {
            addCriterion("rent_model like", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelNotLike(String value) {
            addCriterion("rent_model not like", value, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelIn(List<String> values) {
            addCriterion("rent_model in", values, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelNotIn(List<String> values) {
            addCriterion("rent_model not in", values, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelBetween(String value1, String value2) {
            addCriterion("rent_model between", value1, value2, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentModelNotBetween(String value1, String value2) {
            addCriterion("rent_model not between", value1, value2, "rentModel");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNull() {
            addCriterion("rent_price is null");
            return (Criteria) this;
        }

        public Criteria andRentPriceIsNotNull() {
            addCriterion("rent_price is not null");
            return (Criteria) this;
        }

        public Criteria andRentPriceEqualTo(Integer value) {
            addCriterion("rent_price =", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotEqualTo(Integer value) {
            addCriterion("rent_price <>", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThan(Integer value) {
            addCriterion("rent_price >", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_price >=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThan(Integer value) {
            addCriterion("rent_price <", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceLessThanOrEqualTo(Integer value) {
            addCriterion("rent_price <=", value, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceIn(List<Integer> values) {
            addCriterion("rent_price in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotIn(List<Integer> values) {
            addCriterion("rent_price not in", values, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceBetween(Integer value1, Integer value2) {
            addCriterion("rent_price between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andRentPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_price not between", value1, value2, "rentPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIsNull() {
            addCriterion("weekend_price is null");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIsNotNull() {
            addCriterion("weekend_price is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceEqualTo(Integer value) {
            addCriterion("weekend_price =", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotEqualTo(Integer value) {
            addCriterion("weekend_price <>", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceGreaterThan(Integer value) {
            addCriterion("weekend_price >", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekend_price >=", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceLessThan(Integer value) {
            addCriterion("weekend_price <", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceLessThanOrEqualTo(Integer value) {
            addCriterion("weekend_price <=", value, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceIn(List<Integer> values) {
            addCriterion("weekend_price in", values, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotIn(List<Integer> values) {
            addCriterion("weekend_price not in", values, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceBetween(Integer value1, Integer value2) {
            addCriterion("weekend_price between", value1, value2, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andWeekendPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("weekend_price not between", value1, value2, "weekendPrice");
            return (Criteria) this;
        }

        public Criteria andRentNubIsNull() {
            addCriterion("rent_nub is null");
            return (Criteria) this;
        }

        public Criteria andRentNubIsNotNull() {
            addCriterion("rent_nub is not null");
            return (Criteria) this;
        }

        public Criteria andRentNubEqualTo(String value) {
            addCriterion("rent_nub =", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubNotEqualTo(String value) {
            addCriterion("rent_nub <>", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubGreaterThan(String value) {
            addCriterion("rent_nub >", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubGreaterThanOrEqualTo(String value) {
            addCriterion("rent_nub >=", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubLessThan(String value) {
            addCriterion("rent_nub <", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubLessThanOrEqualTo(String value) {
            addCriterion("rent_nub <=", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubLike(String value) {
            addCriterion("rent_nub like", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubNotLike(String value) {
            addCriterion("rent_nub not like", value, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubIn(List<String> values) {
            addCriterion("rent_nub in", values, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubNotIn(List<String> values) {
            addCriterion("rent_nub not in", values, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubBetween(String value1, String value2) {
            addCriterion("rent_nub between", value1, value2, "rentNub");
            return (Criteria) this;
        }

        public Criteria andRentNubNotBetween(String value1, String value2) {
            addCriterion("rent_nub not between", value1, value2, "rentNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubIsNull() {
            addCriterion("weekend_nub is null");
            return (Criteria) this;
        }

        public Criteria andWeekendNubIsNotNull() {
            addCriterion("weekend_nub is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendNubEqualTo(String value) {
            addCriterion("weekend_nub =", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubNotEqualTo(String value) {
            addCriterion("weekend_nub <>", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubGreaterThan(String value) {
            addCriterion("weekend_nub >", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubGreaterThanOrEqualTo(String value) {
            addCriterion("weekend_nub >=", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubLessThan(String value) {
            addCriterion("weekend_nub <", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubLessThanOrEqualTo(String value) {
            addCriterion("weekend_nub <=", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubLike(String value) {
            addCriterion("weekend_nub like", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubNotLike(String value) {
            addCriterion("weekend_nub not like", value, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubIn(List<String> values) {
            addCriterion("weekend_nub in", values, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubNotIn(List<String> values) {
            addCriterion("weekend_nub not in", values, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubBetween(String value1, String value2) {
            addCriterion("weekend_nub between", value1, value2, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andWeekendNubNotBetween(String value1, String value2) {
            addCriterion("weekend_nub not between", value1, value2, "weekendNub");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayIsNull() {
            addCriterion("mileage_perday is null");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayIsNotNull() {
            addCriterion("mileage_perday is not null");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayEqualTo(String value) {
            addCriterion("mileage_perday =", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayNotEqualTo(String value) {
            addCriterion("mileage_perday <>", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayGreaterThan(String value) {
            addCriterion("mileage_perday >", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayGreaterThanOrEqualTo(String value) {
            addCriterion("mileage_perday >=", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayLessThan(String value) {
            addCriterion("mileage_perday <", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayLessThanOrEqualTo(String value) {
            addCriterion("mileage_perday <=", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayLike(String value) {
            addCriterion("mileage_perday like", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayNotLike(String value) {
            addCriterion("mileage_perday not like", value, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayIn(List<String> values) {
            addCriterion("mileage_perday in", values, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayNotIn(List<String> values) {
            addCriterion("mileage_perday not in", values, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayBetween(String value1, String value2) {
            addCriterion("mileage_perday between", value1, value2, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileagePerdayNotBetween(String value1, String value2) {
            addCriterion("mileage_perday not between", value1, value2, "mileagePerday");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("mileage like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("mileage not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceIsNull() {
            addCriterion("overkm_price is null");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceIsNotNull() {
            addCriterion("overkm_price is not null");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceEqualTo(Integer value) {
            addCriterion("overkm_price =", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceNotEqualTo(Integer value) {
            addCriterion("overkm_price <>", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceGreaterThan(Integer value) {
            addCriterion("overkm_price >", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("overkm_price >=", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceLessThan(Integer value) {
            addCriterion("overkm_price <", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceLessThanOrEqualTo(Integer value) {
            addCriterion("overkm_price <=", value, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceIn(List<Integer> values) {
            addCriterion("overkm_price in", values, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceNotIn(List<Integer> values) {
            addCriterion("overkm_price not in", values, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceBetween(Integer value1, Integer value2) {
            addCriterion("overkm_price between", value1, value2, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOverkmPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("overkm_price not between", value1, value2, "overkmPrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceIsNull() {
            addCriterion("overtime_price is null");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceIsNotNull() {
            addCriterion("overtime_price is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceEqualTo(Integer value) {
            addCriterion("overtime_price =", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceNotEqualTo(Integer value) {
            addCriterion("overtime_price <>", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceGreaterThan(Integer value) {
            addCriterion("overtime_price >", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_price >=", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceLessThan(Integer value) {
            addCriterion("overtime_price <", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceLessThanOrEqualTo(Integer value) {
            addCriterion("overtime_price <=", value, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceIn(List<Integer> values) {
            addCriterion("overtime_price in", values, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceNotIn(List<Integer> values) {
            addCriterion("overtime_price not in", values, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceBetween(Integer value1, Integer value2) {
            addCriterion("overtime_price between", value1, value2, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andOvertimePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_price not between", value1, value2, "overtimePrice");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeIsNull() {
            addCriterion("should_return_time is null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeIsNotNull() {
            addCriterion("should_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("should_return_time =", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("should_return_time <>", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("should_return_time >", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("should_return_time >=", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeLessThan(Date value) {
            addCriterionForJDBCDate("should_return_time <", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("should_return_time <=", value, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("should_return_time in", values, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("should_return_time not in", values, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("should_return_time between", value1, value2, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andShouldReturnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("should_return_time not between", value1, value2, "shouldReturnTime");
            return (Criteria) this;
        }

        public Criteria andKmReturnIsNull() {
            addCriterion("km_return is null");
            return (Criteria) this;
        }

        public Criteria andKmReturnIsNotNull() {
            addCriterion("km_return is not null");
            return (Criteria) this;
        }

        public Criteria andKmReturnEqualTo(String value) {
            addCriterion("km_return =", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnNotEqualTo(String value) {
            addCriterion("km_return <>", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnGreaterThan(String value) {
            addCriterion("km_return >", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnGreaterThanOrEqualTo(String value) {
            addCriterion("km_return >=", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnLessThan(String value) {
            addCriterion("km_return <", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnLessThanOrEqualTo(String value) {
            addCriterion("km_return <=", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnLike(String value) {
            addCriterion("km_return like", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnNotLike(String value) {
            addCriterion("km_return not like", value, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnIn(List<String> values) {
            addCriterion("km_return in", values, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnNotIn(List<String> values) {
            addCriterion("km_return not in", values, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnBetween(String value1, String value2) {
            addCriterion("km_return between", value1, value2, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andKmReturnNotBetween(String value1, String value2) {
            addCriterion("km_return not between", value1, value2, "kmReturn");
            return (Criteria) this;
        }

        public Criteria andOtherPayIsNull() {
            addCriterion("other_pay is null");
            return (Criteria) this;
        }

        public Criteria andOtherPayIsNotNull() {
            addCriterion("other_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPayEqualTo(Integer value) {
            addCriterion("other_pay =", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayNotEqualTo(Integer value) {
            addCriterion("other_pay <>", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayGreaterThan(Integer value) {
            addCriterion("other_pay >", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_pay >=", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayLessThan(Integer value) {
            addCriterion("other_pay <", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayLessThanOrEqualTo(Integer value) {
            addCriterion("other_pay <=", value, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayIn(List<Integer> values) {
            addCriterion("other_pay in", values, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayNotIn(List<Integer> values) {
            addCriterion("other_pay not in", values, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayBetween(Integer value1, Integer value2) {
            addCriterion("other_pay between", value1, value2, "otherPay");
            return (Criteria) this;
        }

        public Criteria andOtherPayNotBetween(Integer value1, Integer value2) {
            addCriterion("other_pay not between", value1, value2, "otherPay");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNull() {
            addCriterion("actual_pay is null");
            return (Criteria) this;
        }

        public Criteria andActualPayIsNotNull() {
            addCriterion("actual_pay is not null");
            return (Criteria) this;
        }

        public Criteria andActualPayEqualTo(Double value) {
            addCriterion("actual_pay =", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotEqualTo(Double value) {
            addCriterion("actual_pay <>", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThan(Double value) {
            addCriterion("actual_pay >", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayGreaterThanOrEqualTo(Double value) {
            addCriterion("actual_pay >=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThan(Double value) {
            addCriterion("actual_pay <", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayLessThanOrEqualTo(Double value) {
            addCriterion("actual_pay <=", value, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayIn(List<Double> values) {
            addCriterion("actual_pay in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotIn(List<Double> values) {
            addCriterion("actual_pay not in", values, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayBetween(Double value1, Double value2) {
            addCriterion("actual_pay between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andActualPayNotBetween(Double value1, Double value2) {
            addCriterion("actual_pay not between", value1, value2, "actualPay");
            return (Criteria) this;
        }

        public Criteria andAllPayIsNull() {
            addCriterion("all_pay is null");
            return (Criteria) this;
        }

        public Criteria andAllPayIsNotNull() {
            addCriterion("all_pay is not null");
            return (Criteria) this;
        }

        public Criteria andAllPayEqualTo(Double value) {
            addCriterion("all_pay =", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayNotEqualTo(Double value) {
            addCriterion("all_pay <>", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayGreaterThan(Double value) {
            addCriterion("all_pay >", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayGreaterThanOrEqualTo(Double value) {
            addCriterion("all_pay >=", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayLessThan(Double value) {
            addCriterion("all_pay <", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayLessThanOrEqualTo(Double value) {
            addCriterion("all_pay <=", value, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayIn(List<Double> values) {
            addCriterion("all_pay in", values, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayNotIn(List<Double> values) {
            addCriterion("all_pay not in", values, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayBetween(Double value1, Double value2) {
            addCriterion("all_pay between", value1, value2, "allPay");
            return (Criteria) this;
        }

        public Criteria andAllPayNotBetween(Double value1, Double value2) {
            addCriterion("all_pay not between", value1, value2, "allPay");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNull() {
            addCriterion("create_people is null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIsNotNull() {
            addCriterion("create_people is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleEqualTo(String value) {
            addCriterion("create_people =", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotEqualTo(String value) {
            addCriterion("create_people <>", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThan(String value) {
            addCriterion("create_people >", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleGreaterThanOrEqualTo(String value) {
            addCriterion("create_people >=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThan(String value) {
            addCriterion("create_people <", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLessThanOrEqualTo(String value) {
            addCriterion("create_people <=", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleLike(String value) {
            addCriterion("create_people like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotLike(String value) {
            addCriterion("create_people not like", value, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleIn(List<String> values) {
            addCriterion("create_people in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotIn(List<String> values) {
            addCriterion("create_people not in", values, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleBetween(String value1, String value2) {
            addCriterion("create_people between", value1, value2, "createPeople");
            return (Criteria) this;
        }

        public Criteria andCreatePeopleNotBetween(String value1, String value2) {
            addCriterion("create_people not between", value1, value2, "createPeople");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeIsNull() {
            addCriterion("actual_return_time is null");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeIsNotNull() {
            addCriterion("actual_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_time =", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_time <>", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("actual_return_time >", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_time >=", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeLessThan(Date value) {
            addCriterionForJDBCDate("actual_return_time <", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actual_return_time <=", value, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeIn(List<Date> values) {
            addCriterionForJDBCDate("actual_return_time in", values, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("actual_return_time not in", values, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_return_time between", value1, value2, "actualReturnTime");
            return (Criteria) this;
        }

        public Criteria andActualReturnTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actual_return_time not between", value1, value2, "actualReturnTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}