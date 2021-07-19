package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class FunsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunsExample() {
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

        public Criteria andFunIdIsNull() {
            addCriterion("fun_id is null");
            return (Criteria) this;
        }

        public Criteria andFunIdIsNotNull() {
            addCriterion("fun_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunIdEqualTo(Integer value) {
            addCriterion("fun_id =", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotEqualTo(Integer value) {
            addCriterion("fun_id <>", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdGreaterThan(Integer value) {
            addCriterion("fun_id >", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fun_id >=", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdLessThan(Integer value) {
            addCriterion("fun_id <", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdLessThanOrEqualTo(Integer value) {
            addCriterion("fun_id <=", value, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdIn(List<Integer> values) {
            addCriterion("fun_id in", values, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotIn(List<Integer> values) {
            addCriterion("fun_id not in", values, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdBetween(Integer value1, Integer value2) {
            addCriterion("fun_id between", value1, value2, "funId");
            return (Criteria) this;
        }

        public Criteria andFunIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fun_id not between", value1, value2, "funId");
            return (Criteria) this;
        }

        public Criteria andFunNameIsNull() {
            addCriterion("fun_name is null");
            return (Criteria) this;
        }

        public Criteria andFunNameIsNotNull() {
            addCriterion("fun_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunNameEqualTo(String value) {
            addCriterion("fun_name =", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotEqualTo(String value) {
            addCriterion("fun_name <>", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameGreaterThan(String value) {
            addCriterion("fun_name >", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameGreaterThanOrEqualTo(String value) {
            addCriterion("fun_name >=", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLessThan(String value) {
            addCriterion("fun_name <", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLessThanOrEqualTo(String value) {
            addCriterion("fun_name <=", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameLike(String value) {
            addCriterion("fun_name like", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotLike(String value) {
            addCriterion("fun_name not like", value, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameIn(List<String> values) {
            addCriterion("fun_name in", values, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotIn(List<String> values) {
            addCriterion("fun_name not in", values, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameBetween(String value1, String value2) {
            addCriterion("fun_name between", value1, value2, "funName");
            return (Criteria) this;
        }

        public Criteria andFunNameNotBetween(String value1, String value2) {
            addCriterion("fun_name not between", value1, value2, "funName");
            return (Criteria) this;
        }

        public Criteria andFunUrlIsNull() {
            addCriterion("fun_url is null");
            return (Criteria) this;
        }

        public Criteria andFunUrlIsNotNull() {
            addCriterion("fun_url is not null");
            return (Criteria) this;
        }

        public Criteria andFunUrlEqualTo(String value) {
            addCriterion("fun_url =", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotEqualTo(String value) {
            addCriterion("fun_url <>", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlGreaterThan(String value) {
            addCriterion("fun_url >", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fun_url >=", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLessThan(String value) {
            addCriterion("fun_url <", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLessThanOrEqualTo(String value) {
            addCriterion("fun_url <=", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlLike(String value) {
            addCriterion("fun_url like", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotLike(String value) {
            addCriterion("fun_url not like", value, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlIn(List<String> values) {
            addCriterion("fun_url in", values, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotIn(List<String> values) {
            addCriterion("fun_url not in", values, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlBetween(String value1, String value2) {
            addCriterion("fun_url between", value1, value2, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunUrlNotBetween(String value1, String value2) {
            addCriterion("fun_url not between", value1, value2, "funUrl");
            return (Criteria) this;
        }

        public Criteria andFunPidIsNull() {
            addCriterion("fun_pid is null");
            return (Criteria) this;
        }

        public Criteria andFunPidIsNotNull() {
            addCriterion("fun_pid is not null");
            return (Criteria) this;
        }

        public Criteria andFunPidEqualTo(Integer value) {
            addCriterion("fun_pid =", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidNotEqualTo(Integer value) {
            addCriterion("fun_pid <>", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidGreaterThan(Integer value) {
            addCriterion("fun_pid >", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fun_pid >=", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidLessThan(Integer value) {
            addCriterion("fun_pid <", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidLessThanOrEqualTo(Integer value) {
            addCriterion("fun_pid <=", value, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidIn(List<Integer> values) {
            addCriterion("fun_pid in", values, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidNotIn(List<Integer> values) {
            addCriterion("fun_pid not in", values, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidBetween(Integer value1, Integer value2) {
            addCriterion("fun_pid between", value1, value2, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunPidNotBetween(Integer value1, Integer value2) {
            addCriterion("fun_pid not between", value1, value2, "funPid");
            return (Criteria) this;
        }

        public Criteria andFunTargetIsNull() {
            addCriterion("fun_target is null");
            return (Criteria) this;
        }

        public Criteria andFunTargetIsNotNull() {
            addCriterion("fun_target is not null");
            return (Criteria) this;
        }

        public Criteria andFunTargetEqualTo(String value) {
            addCriterion("fun_target =", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetNotEqualTo(String value) {
            addCriterion("fun_target <>", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetGreaterThan(String value) {
            addCriterion("fun_target >", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetGreaterThanOrEqualTo(String value) {
            addCriterion("fun_target >=", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetLessThan(String value) {
            addCriterion("fun_target <", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetLessThanOrEqualTo(String value) {
            addCriterion("fun_target <=", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetLike(String value) {
            addCriterion("fun_target like", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetNotLike(String value) {
            addCriterion("fun_target not like", value, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetIn(List<String> values) {
            addCriterion("fun_target in", values, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetNotIn(List<String> values) {
            addCriterion("fun_target not in", values, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetBetween(String value1, String value2) {
            addCriterion("fun_target between", value1, value2, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunTargetNotBetween(String value1, String value2) {
            addCriterion("fun_target not between", value1, value2, "funTarget");
            return (Criteria) this;
        }

        public Criteria andFunSortIsNull() {
            addCriterion("fun_sort is null");
            return (Criteria) this;
        }

        public Criteria andFunSortIsNotNull() {
            addCriterion("fun_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFunSortEqualTo(Integer value) {
            addCriterion("fun_sort =", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortNotEqualTo(Integer value) {
            addCriterion("fun_sort <>", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortGreaterThan(Integer value) {
            addCriterion("fun_sort >", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("fun_sort >=", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortLessThan(Integer value) {
            addCriterion("fun_sort <", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortLessThanOrEqualTo(Integer value) {
            addCriterion("fun_sort <=", value, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortIn(List<Integer> values) {
            addCriterion("fun_sort in", values, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortNotIn(List<Integer> values) {
            addCriterion("fun_sort not in", values, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortBetween(Integer value1, Integer value2) {
            addCriterion("fun_sort between", value1, value2, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunSortNotBetween(Integer value1, Integer value2) {
            addCriterion("fun_sort not between", value1, value2, "funSort");
            return (Criteria) this;
        }

        public Criteria andFunLevelIsNull() {
            addCriterion("fun_level is null");
            return (Criteria) this;
        }

        public Criteria andFunLevelIsNotNull() {
            addCriterion("fun_level is not null");
            return (Criteria) this;
        }

        public Criteria andFunLevelEqualTo(Integer value) {
            addCriterion("fun_level =", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelNotEqualTo(Integer value) {
            addCriterion("fun_level <>", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelGreaterThan(Integer value) {
            addCriterion("fun_level >", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("fun_level >=", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelLessThan(Integer value) {
            addCriterion("fun_level <", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelLessThanOrEqualTo(Integer value) {
            addCriterion("fun_level <=", value, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelIn(List<Integer> values) {
            addCriterion("fun_level in", values, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelNotIn(List<Integer> values) {
            addCriterion("fun_level not in", values, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelBetween(Integer value1, Integer value2) {
            addCriterion("fun_level between", value1, value2, "funLevel");
            return (Criteria) this;
        }

        public Criteria andFunLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("fun_level not between", value1, value2, "funLevel");
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