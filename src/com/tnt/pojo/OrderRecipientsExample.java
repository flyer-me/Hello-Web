package com.tnt.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderRecipientsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRecipientsExample() {
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

        public Criteria andRecipientsIdIsNull() {
            addCriterion("recipients_id is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdIsNotNull() {
            addCriterion("recipients_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdEqualTo(Integer value) {
            addCriterion("recipients_id =", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotEqualTo(Integer value) {
            addCriterion("recipients_id <>", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdGreaterThan(Integer value) {
            addCriterion("recipients_id >", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipients_id >=", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdLessThan(Integer value) {
            addCriterion("recipients_id <", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdLessThanOrEqualTo(Integer value) {
            addCriterion("recipients_id <=", value, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdIn(List<Integer> values) {
            addCriterion("recipients_id in", values, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotIn(List<Integer> values) {
            addCriterion("recipients_id not in", values, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdBetween(Integer value1, Integer value2) {
            addCriterion("recipients_id between", value1, value2, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recipients_id not between", value1, value2, "recipientsId");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameIsNull() {
            addCriterion("recipients_name is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameIsNotNull() {
            addCriterion("recipients_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameEqualTo(String value) {
            addCriterion("recipients_name =", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameNotEqualTo(String value) {
            addCriterion("recipients_name <>", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameGreaterThan(String value) {
            addCriterion("recipients_name >", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameGreaterThanOrEqualTo(String value) {
            addCriterion("recipients_name >=", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameLessThan(String value) {
            addCriterion("recipients_name <", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameLessThanOrEqualTo(String value) {
            addCriterion("recipients_name <=", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameLike(String value) {
            addCriterion("recipients_name like", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameNotLike(String value) {
            addCriterion("recipients_name not like", value, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameIn(List<String> values) {
            addCriterion("recipients_name in", values, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameNotIn(List<String> values) {
            addCriterion("recipients_name not in", values, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameBetween(String value1, String value2) {
            addCriterion("recipients_name between", value1, value2, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsNameNotBetween(String value1, String value2) {
            addCriterion("recipients_name not between", value1, value2, "recipientsName");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressIsNull() {
            addCriterion("recipients_address is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressIsNotNull() {
            addCriterion("recipients_address is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressEqualTo(String value) {
            addCriterion("recipients_address =", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressNotEqualTo(String value) {
            addCriterion("recipients_address <>", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressGreaterThan(String value) {
            addCriterion("recipients_address >", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("recipients_address >=", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressLessThan(String value) {
            addCriterion("recipients_address <", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressLessThanOrEqualTo(String value) {
            addCriterion("recipients_address <=", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressLike(String value) {
            addCriterion("recipients_address like", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressNotLike(String value) {
            addCriterion("recipients_address not like", value, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressIn(List<String> values) {
            addCriterion("recipients_address in", values, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressNotIn(List<String> values) {
            addCriterion("recipients_address not in", values, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressBetween(String value1, String value2) {
            addCriterion("recipients_address between", value1, value2, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsAddressNotBetween(String value1, String value2) {
            addCriterion("recipients_address not between", value1, value2, "recipientsAddress");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIsNull() {
            addCriterion("recipients_phone is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIsNotNull() {
            addCriterion("recipients_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneEqualTo(String value) {
            addCriterion("recipients_phone =", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotEqualTo(String value) {
            addCriterion("recipients_phone <>", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThan(String value) {
            addCriterion("recipients_phone >", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("recipients_phone >=", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThan(String value) {
            addCriterion("recipients_phone <", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLessThanOrEqualTo(String value) {
            addCriterion("recipients_phone <=", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneLike(String value) {
            addCriterion("recipients_phone like", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotLike(String value) {
            addCriterion("recipients_phone not like", value, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneIn(List<String> values) {
            addCriterion("recipients_phone in", values, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotIn(List<String> values) {
            addCriterion("recipients_phone not in", values, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneBetween(String value1, String value2) {
            addCriterion("recipients_phone between", value1, value2, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsPhoneNotBetween(String value1, String value2) {
            addCriterion("recipients_phone not between", value1, value2, "recipientsPhone");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserIsNull() {
            addCriterion("recipients_user is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserIsNotNull() {
            addCriterion("recipients_user is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserEqualTo(Integer value) {
            addCriterion("recipients_user =", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserNotEqualTo(Integer value) {
            addCriterion("recipients_user <>", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserGreaterThan(Integer value) {
            addCriterion("recipients_user >", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipients_user >=", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserLessThan(Integer value) {
            addCriterion("recipients_user <", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserLessThanOrEqualTo(Integer value) {
            addCriterion("recipients_user <=", value, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserIn(List<Integer> values) {
            addCriterion("recipients_user in", values, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserNotIn(List<Integer> values) {
            addCriterion("recipients_user not in", values, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserBetween(Integer value1, Integer value2) {
            addCriterion("recipients_user between", value1, value2, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsUserNotBetween(Integer value1, Integer value2) {
            addCriterion("recipients_user not between", value1, value2, "recipientsUser");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedIsNull() {
            addCriterion("recipients_checked is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedIsNotNull() {
            addCriterion("recipients_checked is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedEqualTo(Integer value) {
            addCriterion("recipients_checked =", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedNotEqualTo(Integer value) {
            addCriterion("recipients_checked <>", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedGreaterThan(Integer value) {
            addCriterion("recipients_checked >", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("recipients_checked >=", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedLessThan(Integer value) {
            addCriterion("recipients_checked <", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("recipients_checked <=", value, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedIn(List<Integer> values) {
            addCriterion("recipients_checked in", values, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedNotIn(List<Integer> values) {
            addCriterion("recipients_checked not in", values, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("recipients_checked between", value1, value2, "recipientsChecked");
            return (Criteria) this;
        }

        public Criteria andRecipientsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("recipients_checked not between", value1, value2, "recipientsChecked");
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