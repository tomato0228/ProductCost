package com.njust.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LzSvrRhoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LzSvrRhoExample() {
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

        public Criteria andModelTimeIsNull() {
            addCriterion("MODEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModelTimeIsNotNull() {
            addCriterion("MODEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModelTimeEqualTo(String value) {
            addCriterion("MODEL_TIME =", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotEqualTo(String value) {
            addCriterion("MODEL_TIME <>", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThan(String value) {
            addCriterion("MODEL_TIME >", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME >=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThan(String value) {
            addCriterion("MODEL_TIME <", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLessThanOrEqualTo(String value) {
            addCriterion("MODEL_TIME <=", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeLike(String value) {
            addCriterion("MODEL_TIME like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotLike(String value) {
            addCriterion("MODEL_TIME not like", value, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeIn(List<String> values) {
            addCriterion("MODEL_TIME in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotIn(List<String> values) {
            addCriterion("MODEL_TIME not in", values, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeBetween(String value1, String value2) {
            addCriterion("MODEL_TIME between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andModelTimeNotBetween(String value1, String value2) {
            addCriterion("MODEL_TIME not between", value1, value2, "modelTime");
            return (Criteria) this;
        }

        public Criteria andRhoIndexIsNull() {
            addCriterion("RHO_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andRhoIndexIsNotNull() {
            addCriterion("RHO_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andRhoIndexEqualTo(BigDecimal value) {
            addCriterion("RHO_INDEX =", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexNotEqualTo(BigDecimal value) {
            addCriterion("RHO_INDEX <>", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexGreaterThan(BigDecimal value) {
            addCriterion("RHO_INDEX >", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RHO_INDEX >=", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexLessThan(BigDecimal value) {
            addCriterion("RHO_INDEX <", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RHO_INDEX <=", value, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexIn(List<BigDecimal> values) {
            addCriterion("RHO_INDEX in", values, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexNotIn(List<BigDecimal> values) {
            addCriterion("RHO_INDEX not in", values, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RHO_INDEX between", value1, value2, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoIndexNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RHO_INDEX not between", value1, value2, "rhoIndex");
            return (Criteria) this;
        }

        public Criteria andRhoValueIsNull() {
            addCriterion("RHO_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRhoValueIsNotNull() {
            addCriterion("RHO_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRhoValueEqualTo(BigDecimal value) {
            addCriterion("RHO_VALUE =", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueNotEqualTo(BigDecimal value) {
            addCriterion("RHO_VALUE <>", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueGreaterThan(BigDecimal value) {
            addCriterion("RHO_VALUE >", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RHO_VALUE >=", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueLessThan(BigDecimal value) {
            addCriterion("RHO_VALUE <", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RHO_VALUE <=", value, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueIn(List<BigDecimal> values) {
            addCriterion("RHO_VALUE in", values, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueNotIn(List<BigDecimal> values) {
            addCriterion("RHO_VALUE not in", values, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RHO_VALUE between", value1, value2, "rhoValue");
            return (Criteria) this;
        }

        public Criteria andRhoValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RHO_VALUE not between", value1, value2, "rhoValue");
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