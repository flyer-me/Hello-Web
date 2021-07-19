package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailExample() {
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

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(Integer value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(Integer value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(Integer value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(Integer value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<Integer> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<Integer> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailOrderIsNull() {
            addCriterion("detail_order is null");
            return (Criteria) this;
        }

        public Criteria andDetailOrderIsNotNull() {
            addCriterion("detail_order is not null");
            return (Criteria) this;
        }

        public Criteria andDetailOrderEqualTo(String value) {
            addCriterion("detail_order =", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderNotEqualTo(String value) {
            addCriterion("detail_order <>", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderGreaterThan(String value) {
            addCriterion("detail_order >", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderGreaterThanOrEqualTo(String value) {
            addCriterion("detail_order >=", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderLessThan(String value) {
            addCriterion("detail_order <", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderLessThanOrEqualTo(String value) {
            addCriterion("detail_order <=", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderLike(String value) {
            addCriterion("detail_order like", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderNotLike(String value) {
            addCriterion("detail_order not like", value, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderIn(List<String> values) {
            addCriterion("detail_order in", values, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderNotIn(List<String> values) {
            addCriterion("detail_order not in", values, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderBetween(String value1, String value2) {
            addCriterion("detail_order between", value1, value2, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailOrderNotBetween(String value1, String value2) {
            addCriterion("detail_order not between", value1, value2, "detailOrder");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsIsNull() {
            addCriterion("detail_goods is null");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsIsNotNull() {
            addCriterion("detail_goods is not null");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsEqualTo(Integer value) {
            addCriterion("detail_goods =", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsNotEqualTo(Integer value) {
            addCriterion("detail_goods <>", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsGreaterThan(Integer value) {
            addCriterion("detail_goods >", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_goods >=", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsLessThan(Integer value) {
            addCriterion("detail_goods <", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("detail_goods <=", value, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsIn(List<Integer> values) {
            addCriterion("detail_goods in", values, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsNotIn(List<Integer> values) {
            addCriterion("detail_goods not in", values, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsBetween(Integer value1, Integer value2) {
            addCriterion("detail_goods between", value1, value2, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_goods not between", value1, value2, "detailGoods");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIsNull() {
            addCriterion("detail_price is null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIsNotNull() {
            addCriterion("detail_price is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPriceEqualTo(Float value) {
            addCriterion("detail_price =", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotEqualTo(Float value) {
            addCriterion("detail_price <>", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceGreaterThan(Float value) {
            addCriterion("detail_price >", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("detail_price >=", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceLessThan(Float value) {
            addCriterion("detail_price <", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("detail_price <=", value, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceIn(List<Float> values) {
            addCriterion("detail_price in", values, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotIn(List<Float> values) {
            addCriterion("detail_price not in", values, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceBetween(Float value1, Float value2) {
            addCriterion("detail_price between", value1, value2, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("detail_price not between", value1, value2, "detailPrice");
            return (Criteria) this;
        }

        public Criteria andDetailNumIsNull() {
            addCriterion("detail_num is null");
            return (Criteria) this;
        }

        public Criteria andDetailNumIsNotNull() {
            addCriterion("detail_num is not null");
            return (Criteria) this;
        }

        public Criteria andDetailNumEqualTo(Integer value) {
            addCriterion("detail_num =", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumNotEqualTo(Integer value) {
            addCriterion("detail_num <>", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumGreaterThan(Integer value) {
            addCriterion("detail_num >", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("detail_num >=", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumLessThan(Integer value) {
            addCriterion("detail_num <", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumLessThanOrEqualTo(Integer value) {
            addCriterion("detail_num <=", value, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumIn(List<Integer> values) {
            addCriterion("detail_num in", values, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumNotIn(List<Integer> values) {
            addCriterion("detail_num not in", values, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumBetween(Integer value1, Integer value2) {
            addCriterion("detail_num between", value1, value2, "detailNum");
            return (Criteria) this;
        }

        public Criteria andDetailNumNotBetween(Integer value1, Integer value2) {
            addCriterion("detail_num not between", value1, value2, "detailNum");
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