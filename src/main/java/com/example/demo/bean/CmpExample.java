package com.example.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class CmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmpExample() {
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

        public Criteria andCmpNubIsNull() {
            addCriterion("cmp_nub is null");
            return (Criteria) this;
        }

        public Criteria andCmpNubIsNotNull() {
            addCriterion("cmp_nub is not null");
            return (Criteria) this;
        }

        public Criteria andCmpNubEqualTo(Integer value) {
            addCriterion("cmp_nub =", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubNotEqualTo(Integer value) {
            addCriterion("cmp_nub <>", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubGreaterThan(Integer value) {
            addCriterion("cmp_nub >", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmp_nub >=", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubLessThan(Integer value) {
            addCriterion("cmp_nub <", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubLessThanOrEqualTo(Integer value) {
            addCriterion("cmp_nub <=", value, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubIn(List<Integer> values) {
            addCriterion("cmp_nub in", values, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubNotIn(List<Integer> values) {
            addCriterion("cmp_nub not in", values, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubBetween(Integer value1, Integer value2) {
            addCriterion("cmp_nub between", value1, value2, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNubNotBetween(Integer value1, Integer value2) {
            addCriterion("cmp_nub not between", value1, value2, "cmpNub");
            return (Criteria) this;
        }

        public Criteria andCmpNameIsNull() {
            addCriterion("cmp_name is null");
            return (Criteria) this;
        }

        public Criteria andCmpNameIsNotNull() {
            addCriterion("cmp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCmpNameEqualTo(String value) {
            addCriterion("cmp_name =", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameNotEqualTo(String value) {
            addCriterion("cmp_name <>", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameGreaterThan(String value) {
            addCriterion("cmp_name >", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("cmp_name >=", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameLessThan(String value) {
            addCriterion("cmp_name <", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameLessThanOrEqualTo(String value) {
            addCriterion("cmp_name <=", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameLike(String value) {
            addCriterion("cmp_name like", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameNotLike(String value) {
            addCriterion("cmp_name not like", value, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameIn(List<String> values) {
            addCriterion("cmp_name in", values, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameNotIn(List<String> values) {
            addCriterion("cmp_name not in", values, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameBetween(String value1, String value2) {
            addCriterion("cmp_name between", value1, value2, "cmpName");
            return (Criteria) this;
        }

        public Criteria andCmpNameNotBetween(String value1, String value2) {
            addCriterion("cmp_name not between", value1, value2, "cmpName");
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

        public Criteria andAdrIsNull() {
            addCriterion("adr is null");
            return (Criteria) this;
        }

        public Criteria andAdrIsNotNull() {
            addCriterion("adr is not null");
            return (Criteria) this;
        }

        public Criteria andAdrEqualTo(String value) {
            addCriterion("adr =", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrNotEqualTo(String value) {
            addCriterion("adr <>", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrGreaterThan(String value) {
            addCriterion("adr >", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrGreaterThanOrEqualTo(String value) {
            addCriterion("adr >=", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrLessThan(String value) {
            addCriterion("adr <", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrLessThanOrEqualTo(String value) {
            addCriterion("adr <=", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrLike(String value) {
            addCriterion("adr like", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrNotLike(String value) {
            addCriterion("adr not like", value, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrIn(List<String> values) {
            addCriterion("adr in", values, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrNotIn(List<String> values) {
            addCriterion("adr not in", values, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrBetween(String value1, String value2) {
            addCriterion("adr between", value1, value2, "adr");
            return (Criteria) this;
        }

        public Criteria andAdrNotBetween(String value1, String value2) {
            addCriterion("adr not between", value1, value2, "adr");
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

        public Criteria andCmpTypeIsNull() {
            addCriterion("cmp_type is null");
            return (Criteria) this;
        }

        public Criteria andCmpTypeIsNotNull() {
            addCriterion("cmp_type is not null");
            return (Criteria) this;
        }

        public Criteria andCmpTypeEqualTo(String value) {
            addCriterion("cmp_type =", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeNotEqualTo(String value) {
            addCriterion("cmp_type <>", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeGreaterThan(String value) {
            addCriterion("cmp_type >", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cmp_type >=", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeLessThan(String value) {
            addCriterion("cmp_type <", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeLessThanOrEqualTo(String value) {
            addCriterion("cmp_type <=", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeLike(String value) {
            addCriterion("cmp_type like", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeNotLike(String value) {
            addCriterion("cmp_type not like", value, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeIn(List<String> values) {
            addCriterion("cmp_type in", values, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeNotIn(List<String> values) {
            addCriterion("cmp_type not in", values, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeBetween(String value1, String value2) {
            addCriterion("cmp_type between", value1, value2, "cmpType");
            return (Criteria) this;
        }

        public Criteria andCmpTypeNotBetween(String value1, String value2) {
            addCriterion("cmp_type not between", value1, value2, "cmpType");
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