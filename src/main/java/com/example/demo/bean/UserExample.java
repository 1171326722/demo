package com.example.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andWorkAdrIsNull() {
            addCriterion("work_adr is null");
            return (Criteria) this;
        }

        public Criteria andWorkAdrIsNotNull() {
            addCriterion("work_adr is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAdrEqualTo(String value) {
            addCriterion("work_adr =", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrNotEqualTo(String value) {
            addCriterion("work_adr <>", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrGreaterThan(String value) {
            addCriterion("work_adr >", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrGreaterThanOrEqualTo(String value) {
            addCriterion("work_adr >=", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrLessThan(String value) {
            addCriterion("work_adr <", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrLessThanOrEqualTo(String value) {
            addCriterion("work_adr <=", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrLike(String value) {
            addCriterion("work_adr like", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrNotLike(String value) {
            addCriterion("work_adr not like", value, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrIn(List<String> values) {
            addCriterion("work_adr in", values, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrNotIn(List<String> values) {
            addCriterion("work_adr not in", values, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrBetween(String value1, String value2) {
            addCriterion("work_adr between", value1, value2, "workAdr");
            return (Criteria) this;
        }

        public Criteria andWorkAdrNotBetween(String value1, String value2) {
            addCriterion("work_adr not between", value1, value2, "workAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrIsNull() {
            addCriterion("home_adr is null");
            return (Criteria) this;
        }

        public Criteria andHomeAdrIsNotNull() {
            addCriterion("home_adr is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAdrEqualTo(String value) {
            addCriterion("home_adr =", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrNotEqualTo(String value) {
            addCriterion("home_adr <>", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrGreaterThan(String value) {
            addCriterion("home_adr >", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrGreaterThanOrEqualTo(String value) {
            addCriterion("home_adr >=", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrLessThan(String value) {
            addCriterion("home_adr <", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrLessThanOrEqualTo(String value) {
            addCriterion("home_adr <=", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrLike(String value) {
            addCriterion("home_adr like", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrNotLike(String value) {
            addCriterion("home_adr not like", value, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrIn(List<String> values) {
            addCriterion("home_adr in", values, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrNotIn(List<String> values) {
            addCriterion("home_adr not in", values, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrBetween(String value1, String value2) {
            addCriterion("home_adr between", value1, value2, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andHomeAdrNotBetween(String value1, String value2) {
            addCriterion("home_adr not between", value1, value2, "homeAdr");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLicenseNubIsNull() {
            addCriterion("license_nub is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNubIsNotNull() {
            addCriterion("license_nub is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNubEqualTo(String value) {
            addCriterion("license_nub =", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubNotEqualTo(String value) {
            addCriterion("license_nub <>", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubGreaterThan(String value) {
            addCriterion("license_nub >", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubGreaterThanOrEqualTo(String value) {
            addCriterion("license_nub >=", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubLessThan(String value) {
            addCriterion("license_nub <", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubLessThanOrEqualTo(String value) {
            addCriterion("license_nub <=", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubLike(String value) {
            addCriterion("license_nub like", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubNotLike(String value) {
            addCriterion("license_nub not like", value, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubIn(List<String> values) {
            addCriterion("license_nub in", values, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubNotIn(List<String> values) {
            addCriterion("license_nub not in", values, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubBetween(String value1, String value2) {
            addCriterion("license_nub between", value1, value2, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseNubNotBetween(String value1, String value2) {
            addCriterion("license_nub not between", value1, value2, "licenseNub");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNull() {
            addCriterion("license_type is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNotNull() {
            addCriterion("license_type is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeEqualTo(String value) {
            addCriterion("license_type =", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotEqualTo(String value) {
            addCriterion("license_type <>", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThan(String value) {
            addCriterion("license_type >", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_type >=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThan(String value) {
            addCriterion("license_type <", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("license_type <=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLike(String value) {
            addCriterion("license_type like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotLike(String value) {
            addCriterion("license_type not like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIn(List<String> values) {
            addCriterion("license_type in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotIn(List<String> values) {
            addCriterion("license_type not in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeBetween(String value1, String value2) {
            addCriterion("license_type between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("license_type not between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeIsNull() {
            addCriterion("license_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeIsNotNull() {
            addCriterion("license_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("license_start_time =", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("license_start_time <>", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("license_start_time >", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_start_time >=", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("license_start_time <", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_start_time <=", value, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("license_start_time in", values, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("license_start_time not in", values, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_start_time between", value1, value2, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_start_time not between", value1, value2, "licenseStartTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeIsNull() {
            addCriterion("license_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeIsNotNull() {
            addCriterion("license_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("license_end_time =", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("license_end_time <>", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("license_end_time >", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_end_time >=", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("license_end_time <", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_end_time <=", value, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("license_end_time in", values, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("license_end_time not in", values, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_end_time between", value1, value2, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andLicenseEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_end_time not between", value1, value2, "licenseEndTime");
            return (Criteria) this;
        }

        public Criteria andDriverYearsIsNull() {
            addCriterion("driver_years is null");
            return (Criteria) this;
        }

        public Criteria andDriverYearsIsNotNull() {
            addCriterion("driver_years is not null");
            return (Criteria) this;
        }

        public Criteria andDriverYearsEqualTo(String value) {
            addCriterion("driver_years =", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsNotEqualTo(String value) {
            addCriterion("driver_years <>", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsGreaterThan(String value) {
            addCriterion("driver_years >", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsGreaterThanOrEqualTo(String value) {
            addCriterion("driver_years >=", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsLessThan(String value) {
            addCriterion("driver_years <", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsLessThanOrEqualTo(String value) {
            addCriterion("driver_years <=", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsLike(String value) {
            addCriterion("driver_years like", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsNotLike(String value) {
            addCriterion("driver_years not like", value, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsIn(List<String> values) {
            addCriterion("driver_years in", values, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsNotIn(List<String> values) {
            addCriterion("driver_years not in", values, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsBetween(String value1, String value2) {
            addCriterion("driver_years between", value1, value2, "driverYears");
            return (Criteria) this;
        }

        public Criteria andDriverYearsNotBetween(String value1, String value2) {
            addCriterion("driver_years not between", value1, value2, "driverYears");
            return (Criteria) this;
        }

        public Criteria andVipCheckIsNull() {
            addCriterion("vip_check is null");
            return (Criteria) this;
        }

        public Criteria andVipCheckIsNotNull() {
            addCriterion("vip_check is not null");
            return (Criteria) this;
        }

        public Criteria andVipCheckEqualTo(String value) {
            addCriterion("vip_check =", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckNotEqualTo(String value) {
            addCriterion("vip_check <>", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckGreaterThan(String value) {
            addCriterion("vip_check >", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckGreaterThanOrEqualTo(String value) {
            addCriterion("vip_check >=", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckLessThan(String value) {
            addCriterion("vip_check <", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckLessThanOrEqualTo(String value) {
            addCriterion("vip_check <=", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckLike(String value) {
            addCriterion("vip_check like", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckNotLike(String value) {
            addCriterion("vip_check not like", value, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckIn(List<String> values) {
            addCriterion("vip_check in", values, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckNotIn(List<String> values) {
            addCriterion("vip_check not in", values, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckBetween(String value1, String value2) {
            addCriterion("vip_check between", value1, value2, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipCheckNotBetween(String value1, String value2) {
            addCriterion("vip_check not between", value1, value2, "vipCheck");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(String value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(String value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(String value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(String value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(String value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLike(String value) {
            addCriterion("vip_type like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotLike(String value) {
            addCriterion("vip_type not like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<String> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<String> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(String value1, String value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(String value1, String value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andMortgageCerIsNull() {
            addCriterion("mortgage_cer is null");
            return (Criteria) this;
        }

        public Criteria andMortgageCerIsNotNull() {
            addCriterion("mortgage_cer is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageCerEqualTo(String value) {
            addCriterion("mortgage_cer =", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerNotEqualTo(String value) {
            addCriterion("mortgage_cer <>", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerGreaterThan(String value) {
            addCriterion("mortgage_cer >", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerGreaterThanOrEqualTo(String value) {
            addCriterion("mortgage_cer >=", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerLessThan(String value) {
            addCriterion("mortgage_cer <", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerLessThanOrEqualTo(String value) {
            addCriterion("mortgage_cer <=", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerLike(String value) {
            addCriterion("mortgage_cer like", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerNotLike(String value) {
            addCriterion("mortgage_cer not like", value, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerIn(List<String> values) {
            addCriterion("mortgage_cer in", values, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerNotIn(List<String> values) {
            addCriterion("mortgage_cer not in", values, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerBetween(String value1, String value2) {
            addCriterion("mortgage_cer between", value1, value2, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andMortgageCerNotBetween(String value1, String value2) {
            addCriterion("mortgage_cer not between", value1, value2, "mortgageCer");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNull() {
            addCriterion("guarantee is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNotNull() {
            addCriterion("guarantee is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeEqualTo(String value) {
            addCriterion("guarantee =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(String value) {
            addCriterion("guarantee <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(String value) {
            addCriterion("guarantee >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(String value) {
            addCriterion("guarantee <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(String value) {
            addCriterion("guarantee <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLike(String value) {
            addCriterion("guarantee like", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotLike(String value) {
            addCriterion("guarantee not like", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<String> values) {
            addCriterion("guarantee in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<String> values) {
            addCriterion("guarantee not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(String value1, String value2) {
            addCriterion("guarantee between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(String value1, String value2) {
            addCriterion("guarantee not between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardIsNull() {
            addCriterion("guarantee_idcard is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardIsNotNull() {
            addCriterion("guarantee_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardEqualTo(String value) {
            addCriterion("guarantee_idcard =", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardNotEqualTo(String value) {
            addCriterion("guarantee_idcard <>", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardGreaterThan(String value) {
            addCriterion("guarantee_idcard >", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_idcard >=", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardLessThan(String value) {
            addCriterion("guarantee_idcard <", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardLessThanOrEqualTo(String value) {
            addCriterion("guarantee_idcard <=", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardLike(String value) {
            addCriterion("guarantee_idcard like", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardNotLike(String value) {
            addCriterion("guarantee_idcard not like", value, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardIn(List<String> values) {
            addCriterion("guarantee_idcard in", values, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardNotIn(List<String> values) {
            addCriterion("guarantee_idcard not in", values, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardBetween(String value1, String value2) {
            addCriterion("guarantee_idcard between", value1, value2, "guaranteeIdcard");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIdcardNotBetween(String value1, String value2) {
            addCriterion("guarantee_idcard not between", value1, value2, "guaranteeIdcard");
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