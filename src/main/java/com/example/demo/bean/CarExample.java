package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andNubIsNull() {
            addCriterion("nub is null");
            return (Criteria) this;
        }

        public Criteria andNubIsNotNull() {
            addCriterion("nub is not null");
            return (Criteria) this;
        }

        public Criteria andNubEqualTo(String value) {
            addCriterion("nub =", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubNotEqualTo(String value) {
            addCriterion("nub <>", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubGreaterThan(String value) {
            addCriterion("nub >", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubGreaterThanOrEqualTo(String value) {
            addCriterion("nub >=", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubLessThan(String value) {
            addCriterion("nub <", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubLessThanOrEqualTo(String value) {
            addCriterion("nub <=", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubLike(String value) {
            addCriterion("nub like", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubNotLike(String value) {
            addCriterion("nub not like", value, "nub");
            return (Criteria) this;
        }

        public Criteria andNubIn(List<String> values) {
            addCriterion("nub in", values, "nub");
            return (Criteria) this;
        }

        public Criteria andNubNotIn(List<String> values) {
            addCriterion("nub not in", values, "nub");
            return (Criteria) this;
        }

        public Criteria andNubBetween(String value1, String value2) {
            addCriterion("nub between", value1, value2, "nub");
            return (Criteria) this;
        }

        public Criteria andNubNotBetween(String value1, String value2) {
            addCriterion("nub not between", value1, value2, "nub");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andEngineIsNull() {
            addCriterion("engine is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("engine is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("engine =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("engine <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("engine >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("engine >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("engine <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("engine <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("engine like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("engine not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("engine in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("engine not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("engine between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("engine not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andFrameIsNull() {
            addCriterion("frame is null");
            return (Criteria) this;
        }

        public Criteria andFrameIsNotNull() {
            addCriterion("frame is not null");
            return (Criteria) this;
        }

        public Criteria andFrameEqualTo(String value) {
            addCriterion("frame =", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameNotEqualTo(String value) {
            addCriterion("frame <>", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameGreaterThan(String value) {
            addCriterion("frame >", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameGreaterThanOrEqualTo(String value) {
            addCriterion("frame >=", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameLessThan(String value) {
            addCriterion("frame <", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameLessThanOrEqualTo(String value) {
            addCriterion("frame <=", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameLike(String value) {
            addCriterion("frame like", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameNotLike(String value) {
            addCriterion("frame not like", value, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameIn(List<String> values) {
            addCriterion("frame in", values, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameNotIn(List<String> values) {
            addCriterion("frame not in", values, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameBetween(String value1, String value2) {
            addCriterion("frame between", value1, value2, "frame");
            return (Criteria) this;
        }

        public Criteria andFrameNotBetween(String value1, String value2) {
            addCriterion("frame not between", value1, value2, "frame");
            return (Criteria) this;
        }

        public Criteria andSellerIsNull() {
            addCriterion("seller is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsNotNull() {
            addCriterion("seller is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEqualTo(String value) {
            addCriterion("seller =", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotEqualTo(String value) {
            addCriterion("seller <>", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThan(String value) {
            addCriterion("seller >", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerGreaterThanOrEqualTo(String value) {
            addCriterion("seller >=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThan(String value) {
            addCriterion("seller <", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLessThanOrEqualTo(String value) {
            addCriterion("seller <=", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerLike(String value) {
            addCriterion("seller like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotLike(String value) {
            addCriterion("seller not like", value, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerIn(List<String> values) {
            addCriterion("seller in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotIn(List<String> values) {
            addCriterion("seller not in", values, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerBetween(String value1, String value2) {
            addCriterion("seller between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andSellerNotBetween(String value1, String value2) {
            addCriterion("seller not between", value1, value2, "seller");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterionForJDBCDate("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterionForJDBCDate("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubIsNull() {
            addCriterion("insurance_nub is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubIsNotNull() {
            addCriterion("insurance_nub is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubEqualTo(String value) {
            addCriterion("insurance_nub =", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubNotEqualTo(String value) {
            addCriterion("insurance_nub <>", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubGreaterThan(String value) {
            addCriterion("insurance_nub >", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_nub >=", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubLessThan(String value) {
            addCriterion("insurance_nub <", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubLessThanOrEqualTo(String value) {
            addCriterion("insurance_nub <=", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubLike(String value) {
            addCriterion("insurance_nub like", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubNotLike(String value) {
            addCriterion("insurance_nub not like", value, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubIn(List<String> values) {
            addCriterion("insurance_nub in", values, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubNotIn(List<String> values) {
            addCriterion("insurance_nub not in", values, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubBetween(String value1, String value2) {
            addCriterion("insurance_nub between", value1, value2, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceNubNotBetween(String value1, String value2) {
            addCriterion("insurance_nub not between", value1, value2, "insuranceNub");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpIsNull() {
            addCriterion("insurance_cmp is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpIsNotNull() {
            addCriterion("insurance_cmp is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpEqualTo(String value) {
            addCriterion("insurance_cmp =", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpNotEqualTo(String value) {
            addCriterion("insurance_cmp <>", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpGreaterThan(String value) {
            addCriterion("insurance_cmp >", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_cmp >=", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpLessThan(String value) {
            addCriterion("insurance_cmp <", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpLessThanOrEqualTo(String value) {
            addCriterion("insurance_cmp <=", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpLike(String value) {
            addCriterion("insurance_cmp like", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpNotLike(String value) {
            addCriterion("insurance_cmp not like", value, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpIn(List<String> values) {
            addCriterion("insurance_cmp in", values, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpNotIn(List<String> values) {
            addCriterion("insurance_cmp not in", values, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpBetween(String value1, String value2) {
            addCriterion("insurance_cmp between", value1, value2, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceCmpNotBetween(String value1, String value2) {
            addCriterion("insurance_cmp not between", value1, value2, "insuranceCmp");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNull() {
            addCriterion("insurance_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNotNull() {
            addCriterion("insurance_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeEqualTo(String value) {
            addCriterion("insurance_type =", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotEqualTo(String value) {
            addCriterion("insurance_type <>", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThan(String value) {
            addCriterion("insurance_type >", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_type >=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThan(String value) {
            addCriterion("insurance_type <", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThanOrEqualTo(String value) {
            addCriterion("insurance_type <=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLike(String value) {
            addCriterion("insurance_type like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotLike(String value) {
            addCriterion("insurance_type not like", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIn(List<String> values) {
            addCriterion("insurance_type in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotIn(List<String> values) {
            addCriterion("insurance_type not in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeBetween(String value1, String value2) {
            addCriterion("insurance_type between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotBetween(String value1, String value2) {
            addCriterion("insurance_type not between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeIsNull() {
            addCriterion("insurance_start_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeIsNotNull() {
            addCriterion("insurance_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeEqualTo(String value) {
            addCriterion("insurance_start_time =", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeNotEqualTo(String value) {
            addCriterion("insurance_start_time <>", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeGreaterThan(String value) {
            addCriterion("insurance_start_time >", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_start_time >=", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeLessThan(String value) {
            addCriterion("insurance_start_time <", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeLessThanOrEqualTo(String value) {
            addCriterion("insurance_start_time <=", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeLike(String value) {
            addCriterion("insurance_start_time like", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeNotLike(String value) {
            addCriterion("insurance_start_time not like", value, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeIn(List<String> values) {
            addCriterion("insurance_start_time in", values, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeNotIn(List<String> values) {
            addCriterion("insurance_start_time not in", values, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeBetween(String value1, String value2) {
            addCriterion("insurance_start_time between", value1, value2, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceStartTimeNotBetween(String value1, String value2) {
            addCriterion("insurance_start_time not between", value1, value2, "insuranceStartTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeIsNull() {
            addCriterion("insurance_end_time is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeIsNotNull() {
            addCriterion("insurance_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeEqualTo(String value) {
            addCriterion("insurance_end_time =", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeNotEqualTo(String value) {
            addCriterion("insurance_end_time <>", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeGreaterThan(String value) {
            addCriterion("insurance_end_time >", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_end_time >=", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeLessThan(String value) {
            addCriterion("insurance_end_time <", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeLessThanOrEqualTo(String value) {
            addCriterion("insurance_end_time <=", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeLike(String value) {
            addCriterion("insurance_end_time like", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeNotLike(String value) {
            addCriterion("insurance_end_time not like", value, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeIn(List<String> values) {
            addCriterion("insurance_end_time in", values, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeNotIn(List<String> values) {
            addCriterion("insurance_end_time not in", values, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeBetween(String value1, String value2) {
            addCriterion("insurance_end_time between", value1, value2, "insuranceEndTime");
            return (Criteria) this;
        }

        public Criteria andInsuranceEndTimeNotBetween(String value1, String value2) {
            addCriterion("insurance_end_time not between", value1, value2, "insuranceEndTime");
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

        public Criteria andDayRentIsNull() {
            addCriterion("day_rent is null");
            return (Criteria) this;
        }

        public Criteria andDayRentIsNotNull() {
            addCriterion("day_rent is not null");
            return (Criteria) this;
        }

        public Criteria andDayRentEqualTo(Integer value) {
            addCriterion("day_rent =", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentNotEqualTo(Integer value) {
            addCriterion("day_rent <>", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentGreaterThan(Integer value) {
            addCriterion("day_rent >", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_rent >=", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentLessThan(Integer value) {
            addCriterion("day_rent <", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentLessThanOrEqualTo(Integer value) {
            addCriterion("day_rent <=", value, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentIn(List<Integer> values) {
            addCriterion("day_rent in", values, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentNotIn(List<Integer> values) {
            addCriterion("day_rent not in", values, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentBetween(Integer value1, Integer value2) {
            addCriterion("day_rent between", value1, value2, "dayRent");
            return (Criteria) this;
        }

        public Criteria andDayRentNotBetween(Integer value1, Integer value2) {
            addCriterion("day_rent not between", value1, value2, "dayRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentIsNull() {
            addCriterion("week_rent is null");
            return (Criteria) this;
        }

        public Criteria andWeekRentIsNotNull() {
            addCriterion("week_rent is not null");
            return (Criteria) this;
        }

        public Criteria andWeekRentEqualTo(Integer value) {
            addCriterion("week_rent =", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentNotEqualTo(Integer value) {
            addCriterion("week_rent <>", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentGreaterThan(Integer value) {
            addCriterion("week_rent >", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("week_rent >=", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentLessThan(Integer value) {
            addCriterion("week_rent <", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentLessThanOrEqualTo(Integer value) {
            addCriterion("week_rent <=", value, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentIn(List<Integer> values) {
            addCriterion("week_rent in", values, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentNotIn(List<Integer> values) {
            addCriterion("week_rent not in", values, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentBetween(Integer value1, Integer value2) {
            addCriterion("week_rent between", value1, value2, "weekRent");
            return (Criteria) this;
        }

        public Criteria andWeekRentNotBetween(Integer value1, Integer value2) {
            addCriterion("week_rent not between", value1, value2, "weekRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentIsNull() {
            addCriterion("month_rent is null");
            return (Criteria) this;
        }

        public Criteria andMonthRentIsNotNull() {
            addCriterion("month_rent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthRentEqualTo(Integer value) {
            addCriterion("month_rent =", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentNotEqualTo(Integer value) {
            addCriterion("month_rent <>", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentGreaterThan(Integer value) {
            addCriterion("month_rent >", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_rent >=", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentLessThan(Integer value) {
            addCriterion("month_rent <", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentLessThanOrEqualTo(Integer value) {
            addCriterion("month_rent <=", value, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentIn(List<Integer> values) {
            addCriterion("month_rent in", values, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentNotIn(List<Integer> values) {
            addCriterion("month_rent not in", values, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentBetween(Integer value1, Integer value2) {
            addCriterion("month_rent between", value1, value2, "monthRent");
            return (Criteria) this;
        }

        public Criteria andMonthRentNotBetween(Integer value1, Integer value2) {
            addCriterion("month_rent not between", value1, value2, "monthRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentIsNull() {
            addCriterion("weekend_rent is null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentIsNotNull() {
            addCriterion("weekend_rent is not null");
            return (Criteria) this;
        }

        public Criteria andWeekendRentEqualTo(Integer value) {
            addCriterion("weekend_rent =", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentNotEqualTo(Integer value) {
            addCriterion("weekend_rent <>", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentGreaterThan(Integer value) {
            addCriterion("weekend_rent >", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("weekend_rent >=", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentLessThan(Integer value) {
            addCriterion("weekend_rent <", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentLessThanOrEqualTo(Integer value) {
            addCriterion("weekend_rent <=", value, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentIn(List<Integer> values) {
            addCriterion("weekend_rent in", values, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentNotIn(List<Integer> values) {
            addCriterion("weekend_rent not in", values, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentBetween(Integer value1, Integer value2) {
            addCriterion("weekend_rent between", value1, value2, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andWeekendRentNotBetween(Integer value1, Integer value2) {
            addCriterion("weekend_rent not between", value1, value2, "weekendRent");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmIsNull() {
            addCriterion("day_limit_km is null");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmIsNotNull() {
            addCriterion("day_limit_km is not null");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmEqualTo(Integer value) {
            addCriterion("day_limit_km =", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmNotEqualTo(Integer value) {
            addCriterion("day_limit_km <>", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmGreaterThan(Integer value) {
            addCriterion("day_limit_km >", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_limit_km >=", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmLessThan(Integer value) {
            addCriterion("day_limit_km <", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmLessThanOrEqualTo(Integer value) {
            addCriterion("day_limit_km <=", value, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmIn(List<Integer> values) {
            addCriterion("day_limit_km in", values, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmNotIn(List<Integer> values) {
            addCriterion("day_limit_km not in", values, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmBetween(Integer value1, Integer value2) {
            addCriterion("day_limit_km between", value1, value2, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andDayLimitKmNotBetween(Integer value1, Integer value2) {
            addCriterion("day_limit_km not between", value1, value2, "dayLimitKm");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentIsNull() {
            addCriterion("overtime_rent is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentIsNotNull() {
            addCriterion("overtime_rent is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentEqualTo(Integer value) {
            addCriterion("overtime_rent =", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentNotEqualTo(Integer value) {
            addCriterion("overtime_rent <>", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentGreaterThan(Integer value) {
            addCriterion("overtime_rent >", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime_rent >=", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentLessThan(Integer value) {
            addCriterion("overtime_rent <", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentLessThanOrEqualTo(Integer value) {
            addCriterion("overtime_rent <=", value, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentIn(List<Integer> values) {
            addCriterion("overtime_rent in", values, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentNotIn(List<Integer> values) {
            addCriterion("overtime_rent not in", values, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentBetween(Integer value1, Integer value2) {
            addCriterion("overtime_rent between", value1, value2, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOvertimeRentNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime_rent not between", value1, value2, "overtimeRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentIsNull() {
            addCriterion("overkm_rent is null");
            return (Criteria) this;
        }

        public Criteria andOverkmRentIsNotNull() {
            addCriterion("overkm_rent is not null");
            return (Criteria) this;
        }

        public Criteria andOverkmRentEqualTo(Integer value) {
            addCriterion("overkm_rent =", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentNotEqualTo(Integer value) {
            addCriterion("overkm_rent <>", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentGreaterThan(Integer value) {
            addCriterion("overkm_rent >", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentGreaterThanOrEqualTo(Integer value) {
            addCriterion("overkm_rent >=", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentLessThan(Integer value) {
            addCriterion("overkm_rent <", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentLessThanOrEqualTo(Integer value) {
            addCriterion("overkm_rent <=", value, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentIn(List<Integer> values) {
            addCriterion("overkm_rent in", values, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentNotIn(List<Integer> values) {
            addCriterion("overkm_rent not in", values, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentBetween(Integer value1, Integer value2) {
            addCriterion("overkm_rent between", value1, value2, "overkmRent");
            return (Criteria) this;
        }

        public Criteria andOverkmRentNotBetween(Integer value1, Integer value2) {
            addCriterion("overkm_rent not between", value1, value2, "overkmRent");
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

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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