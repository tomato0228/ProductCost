package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LlcNetMinoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcNetMinoutExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andSvrtimeIsNull() {
            addCriterion("SvrTime is null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIsNotNull() {
            addCriterion("SvrTime is not null");
            return (Criteria) this;
        }

        public Criteria andSvrtimeEqualTo(String value) {
            addCriterion("SvrTime =", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotEqualTo(String value) {
            addCriterion("SvrTime <>", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThan(String value) {
            addCriterion("SvrTime >", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeGreaterThanOrEqualTo(String value) {
            addCriterion("SvrTime >=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThan(String value) {
            addCriterion("SvrTime <", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLessThanOrEqualTo(String value) {
            addCriterion("SvrTime <=", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeLike(String value) {
            addCriterion("SvrTime like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotLike(String value) {
            addCriterion("SvrTime not like", value, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeIn(List<String> values) {
            addCriterion("SvrTime in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotIn(List<String> values) {
            addCriterion("SvrTime not in", values, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeBetween(String value1, String value2) {
            addCriterion("SvrTime between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andSvrtimeNotBetween(String value1, String value2) {
            addCriterion("SvrTime not between", value1, value2, "svrtime");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexIsNull() {
            addCriterion("MinOut_Index is null");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexIsNotNull() {
            addCriterion("MinOut_Index is not null");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexEqualTo(BigDecimal value) {
            addCriterion("MinOut_Index =", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexNotEqualTo(BigDecimal value) {
            addCriterion("MinOut_Index <>", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexGreaterThan(BigDecimal value) {
            addCriterion("MinOut_Index >", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinOut_Index >=", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexLessThan(BigDecimal value) {
            addCriterion("MinOut_Index <", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinOut_Index <=", value, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexIn(List<BigDecimal> values) {
            addCriterion("MinOut_Index in", values, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexNotIn(List<BigDecimal> values) {
            addCriterion("MinOut_Index not in", values, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinOut_Index between", value1, value2, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinOut_Index not between", value1, value2, "minoutIndex");
            return (Criteria) this;
        }

        public Criteria andMinoutValueIsNull() {
            addCriterion("MinOut_Value is null");
            return (Criteria) this;
        }

        public Criteria andMinoutValueIsNotNull() {
            addCriterion("MinOut_Value is not null");
            return (Criteria) this;
        }

        public Criteria andMinoutValueEqualTo(BigDecimal value) {
            addCriterion("MinOut_Value =", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueNotEqualTo(BigDecimal value) {
            addCriterion("MinOut_Value <>", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueGreaterThan(BigDecimal value) {
            addCriterion("MinOut_Value >", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MinOut_Value >=", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueLessThan(BigDecimal value) {
            addCriterion("MinOut_Value <", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MinOut_Value <=", value, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueIn(List<BigDecimal> values) {
            addCriterion("MinOut_Value in", values, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueNotIn(List<BigDecimal> values) {
            addCriterion("MinOut_Value not in", values, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinOut_Value between", value1, value2, "minoutValue");
            return (Criteria) this;
        }

        public Criteria andMinoutValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MinOut_Value not between", value1, value2, "minoutValue");
            return (Criteria) this;
        }
    }

    /**
     */
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