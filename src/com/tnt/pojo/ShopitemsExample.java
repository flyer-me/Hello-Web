package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShopitemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopitemsExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemGoodsIsNull() {
            addCriterion("item_goods is null");
            return (Criteria) this;
        }

        public Criteria andItemGoodsIsNotNull() {
            addCriterion("item_goods is not null");
            return (Criteria) this;
        }

        public Criteria andItemGoodsEqualTo(Integer value) {
            addCriterion("item_goods =", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsNotEqualTo(Integer value) {
            addCriterion("item_goods <>", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsGreaterThan(Integer value) {
            addCriterion("item_goods >", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_goods >=", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsLessThan(Integer value) {
            addCriterion("item_goods <", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("item_goods <=", value, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsIn(List<Integer> values) {
            addCriterion("item_goods in", values, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsNotIn(List<Integer> values) {
            addCriterion("item_goods not in", values, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsBetween(Integer value1, Integer value2) {
            addCriterion("item_goods between", value1, value2, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("item_goods not between", value1, value2, "itemGoods");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(Integer value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(Integer value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(Integer value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(Integer value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<Integer> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<Integer> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(Integer value1, Integer value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemUserIsNull() {
            addCriterion("item_user is null");
            return (Criteria) this;
        }

        public Criteria andItemUserIsNotNull() {
            addCriterion("item_user is not null");
            return (Criteria) this;
        }

        public Criteria andItemUserEqualTo(Integer value) {
            addCriterion("item_user =", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserNotEqualTo(Integer value) {
            addCriterion("item_user <>", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserGreaterThan(Integer value) {
            addCriterion("item_user >", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_user >=", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserLessThan(Integer value) {
            addCriterion("item_user <", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserLessThanOrEqualTo(Integer value) {
            addCriterion("item_user <=", value, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserIn(List<Integer> values) {
            addCriterion("item_user in", values, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserNotIn(List<Integer> values) {
            addCriterion("item_user not in", values, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserBetween(Integer value1, Integer value2) {
            addCriterion("item_user between", value1, value2, "itemUser");
            return (Criteria) this;
        }

        public Criteria andItemUserNotBetween(Integer value1, Integer value2) {
            addCriterion("item_user not between", value1, value2, "itemUser");
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