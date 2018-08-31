package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcProductExample() {
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

        public Criteria andProductTreeIdIsNull() {
            addCriterion("PRODUCT_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdIsNotNull() {
            addCriterion("PRODUCT_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID =", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID <>", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_TREE_ID >", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID >=", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdLessThan(Integer value) {
            addCriterion("PRODUCT_TREE_ID <", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TREE_ID <=", value, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdIn(List<Integer> values) {
            addCriterion("PRODUCT_TREE_ID in", values, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_TREE_ID not in", values, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TREE_ID between", value1, value2, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TREE_ID not between", value1, value2, "productTreeId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdIsNull() {
            addCriterion("SUPER_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdIsNotNull() {
            addCriterion("SUPER_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdEqualTo(Integer value) {
            addCriterion("SUPER_PRODUCT_ID =", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdNotEqualTo(Integer value) {
            addCriterion("SUPER_PRODUCT_ID <>", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdGreaterThan(Integer value) {
            addCriterion("SUPER_PRODUCT_ID >", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPER_PRODUCT_ID >=", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdLessThan(Integer value) {
            addCriterion("SUPER_PRODUCT_ID <", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("SUPER_PRODUCT_ID <=", value, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdIn(List<Integer> values) {
            addCriterion("SUPER_PRODUCT_ID in", values, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdNotIn(List<Integer> values) {
            addCriterion("SUPER_PRODUCT_ID not in", values, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_PRODUCT_ID between", value1, value2, "superProductId");
            return (Criteria) this;
        }

        public Criteria andSuperProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPER_PRODUCT_ID not between", value1, value2, "superProductId");
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