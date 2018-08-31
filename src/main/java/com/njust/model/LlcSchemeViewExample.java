package com.njust.model;

import java.util.ArrayList;
import java.util.List;

public class LlcSchemeViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LlcSchemeViewExample() {
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

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(Integer value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(Integer value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(Integer value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(Integer value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<Integer> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<Integer> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(Integer value1, Integer value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHEME_ID not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
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

        public Criteria andTaskTreeIdIsNull() {
            addCriterion("TASK_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIsNotNull() {
            addCriterion("TASK_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID =", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <>", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThan(Integer value) {
            addCriterion("TASK_TREE_ID >", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID >=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThan(Integer value) {
            addCriterion("TASK_TREE_ID <", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_TREE_ID <=", value, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotIn(List<Integer> values) {
            addCriterion("TASK_TREE_ID not in", values, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andTaskTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_TREE_ID not between", value1, value2, "taskTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIsNull() {
            addCriterion("RESOURCE_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIsNotNull() {
            addCriterion("RESOURCE_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID =", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <>", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID >", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID >=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThan(Integer value) {
            addCriterion("RESOURCE_TREE_ID <", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TREE_ID <=", value, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotIn(List<Integer> values) {
            addCriterion("RESOURCE_TREE_ID not in", values, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andResourceTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TREE_ID not between", value1, value2, "resourceTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIsNull() {
            addCriterion("TIME_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIsNotNull() {
            addCriterion("TIME_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID =", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <>", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThan(Integer value) {
            addCriterion("TIME_TREE_ID >", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID >=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThan(Integer value) {
            addCriterion("TIME_TREE_ID <", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TIME_TREE_ID <=", value, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotIn(List<Integer> values) {
            addCriterion("TIME_TREE_ID not in", values, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTimeTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME_TREE_ID not between", value1, value2, "timeTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIsNull() {
            addCriterion("TECHNOLOGY_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIsNotNull() {
            addCriterion("TECHNOLOGY_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID =", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <>", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID >=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThan(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TECHNOLOGY_TREE_ID <=", value, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotIn(List<Integer> values) {
            addCriterion("TECHNOLOGY_TREE_ID not in", values, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TECHNOLOGY_TREE_ID not between", value1, value2, "technologyTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNull() {
            addCriterion("COST_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIsNotNull() {
            addCriterion("COST_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdEqualTo(Integer value) {
            addCriterion("COST_TREE_ID =", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <>", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThan(Integer value) {
            addCriterion("COST_TREE_ID >", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID >=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThan(Integer value) {
            addCriterion("COST_TREE_ID <", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdLessThanOrEqualTo(Integer value) {
            addCriterion("COST_TREE_ID <=", value, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdIn(List<Integer> values) {
            addCriterion("COST_TREE_ID in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotIn(List<Integer> values) {
            addCriterion("COST_TREE_ID not in", values, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID between", value1, value2, "costTreeId");
            return (Criteria) this;
        }

        public Criteria andCostTreeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COST_TREE_ID not between", value1, value2, "costTreeId");
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

        public Criteria andProductTreeNameIsNull() {
            addCriterion("PRODUCT_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameIsNotNull() {
            addCriterion("PRODUCT_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameEqualTo(String value) {
            addCriterion("PRODUCT_TREE_NAME =", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameNotEqualTo(String value) {
            addCriterion("PRODUCT_TREE_NAME <>", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameGreaterThan(String value) {
            addCriterion("PRODUCT_TREE_NAME >", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TREE_NAME >=", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameLessThan(String value) {
            addCriterion("PRODUCT_TREE_NAME <", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TREE_NAME <=", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameLike(String value) {
            addCriterion("PRODUCT_TREE_NAME like", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameNotLike(String value) {
            addCriterion("PRODUCT_TREE_NAME not like", value, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameIn(List<String> values) {
            addCriterion("PRODUCT_TREE_NAME in", values, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameNotIn(List<String> values) {
            addCriterion("PRODUCT_TREE_NAME not in", values, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_TREE_NAME between", value1, value2, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andProductTreeNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TREE_NAME not between", value1, value2, "productTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameIsNull() {
            addCriterion("TASK_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameIsNotNull() {
            addCriterion("TASK_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameEqualTo(String value) {
            addCriterion("TASK_TREE_NAME =", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameNotEqualTo(String value) {
            addCriterion("TASK_TREE_NAME <>", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameGreaterThan(String value) {
            addCriterion("TASK_TREE_NAME >", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_TREE_NAME >=", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameLessThan(String value) {
            addCriterion("TASK_TREE_NAME <", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_TREE_NAME <=", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameLike(String value) {
            addCriterion("TASK_TREE_NAME like", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameNotLike(String value) {
            addCriterion("TASK_TREE_NAME not like", value, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameIn(List<String> values) {
            addCriterion("TASK_TREE_NAME in", values, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameNotIn(List<String> values) {
            addCriterion("TASK_TREE_NAME not in", values, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameBetween(String value1, String value2) {
            addCriterion("TASK_TREE_NAME between", value1, value2, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andTaskTreeNameNotBetween(String value1, String value2) {
            addCriterion("TASK_TREE_NAME not between", value1, value2, "taskTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIsNull() {
            addCriterion("RESOURCE_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIsNotNull() {
            addCriterion("RESOURCE_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME =", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME <>", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameGreaterThan(String value) {
            addCriterion("RESOURCE_TREE_NAME >", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME >=", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLessThan(String value) {
            addCriterion("RESOURCE_TREE_NAME <", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TREE_NAME <=", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameLike(String value) {
            addCriterion("RESOURCE_TREE_NAME like", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotLike(String value) {
            addCriterion("RESOURCE_TREE_NAME not like", value, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameIn(List<String> values) {
            addCriterion("RESOURCE_TREE_NAME in", values, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotIn(List<String> values) {
            addCriterion("RESOURCE_TREE_NAME not in", values, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameBetween(String value1, String value2) {
            addCriterion("RESOURCE_TREE_NAME between", value1, value2, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andResourceTreeNameNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TREE_NAME not between", value1, value2, "resourceTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIsNull() {
            addCriterion("TIME_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIsNotNull() {
            addCriterion("TIME_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameEqualTo(String value) {
            addCriterion("TIME_TREE_NAME =", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotEqualTo(String value) {
            addCriterion("TIME_TREE_NAME <>", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameGreaterThan(String value) {
            addCriterion("TIME_TREE_NAME >", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIME_TREE_NAME >=", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLessThan(String value) {
            addCriterion("TIME_TREE_NAME <", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLessThanOrEqualTo(String value) {
            addCriterion("TIME_TREE_NAME <=", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameLike(String value) {
            addCriterion("TIME_TREE_NAME like", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotLike(String value) {
            addCriterion("TIME_TREE_NAME not like", value, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameIn(List<String> values) {
            addCriterion("TIME_TREE_NAME in", values, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotIn(List<String> values) {
            addCriterion("TIME_TREE_NAME not in", values, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameBetween(String value1, String value2) {
            addCriterion("TIME_TREE_NAME between", value1, value2, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTimeTreeNameNotBetween(String value1, String value2) {
            addCriterion("TIME_TREE_NAME not between", value1, value2, "timeTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameIsNull() {
            addCriterion("TECHNOLOGY_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameIsNotNull() {
            addCriterion("TECHNOLOGY_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameEqualTo(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME =", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameNotEqualTo(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME <>", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameGreaterThan(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME >", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME >=", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameLessThan(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME <", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameLessThanOrEqualTo(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME <=", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameLike(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME like", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameNotLike(String value) {
            addCriterion("TECHNOLOGY_TREE_NAME not like", value, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameIn(List<String> values) {
            addCriterion("TECHNOLOGY_TREE_NAME in", values, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameNotIn(List<String> values) {
            addCriterion("TECHNOLOGY_TREE_NAME not in", values, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY_TREE_NAME between", value1, value2, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andTechnologyTreeNameNotBetween(String value1, String value2) {
            addCriterion("TECHNOLOGY_TREE_NAME not between", value1, value2, "technologyTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameIsNull() {
            addCriterion("COST_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameIsNotNull() {
            addCriterion("COST_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameEqualTo(String value) {
            addCriterion("COST_TREE_NAME =", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameNotEqualTo(String value) {
            addCriterion("COST_TREE_NAME <>", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameGreaterThan(String value) {
            addCriterion("COST_TREE_NAME >", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("COST_TREE_NAME >=", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameLessThan(String value) {
            addCriterion("COST_TREE_NAME <", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameLessThanOrEqualTo(String value) {
            addCriterion("COST_TREE_NAME <=", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameLike(String value) {
            addCriterion("COST_TREE_NAME like", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameNotLike(String value) {
            addCriterion("COST_TREE_NAME not like", value, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameIn(List<String> values) {
            addCriterion("COST_TREE_NAME in", values, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameNotIn(List<String> values) {
            addCriterion("COST_TREE_NAME not in", values, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameBetween(String value1, String value2) {
            addCriterion("COST_TREE_NAME between", value1, value2, "costTreeName");
            return (Criteria) this;
        }

        public Criteria andCostTreeNameNotBetween(String value1, String value2) {
            addCriterion("COST_TREE_NAME not between", value1, value2, "costTreeName");
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