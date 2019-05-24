package com.bugong.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BMessageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMessageNoIsNull() {
            addCriterion("MESSAGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMessageNoIsNotNull() {
            addCriterion("MESSAGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMessageNoEqualTo(Integer value) {
            addCriterion("MESSAGE_NO =", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoNotEqualTo(Integer value) {
            addCriterion("MESSAGE_NO <>", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoGreaterThan(Integer value) {
            addCriterion("MESSAGE_NO >", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MESSAGE_NO >=", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoLessThan(Integer value) {
            addCriterion("MESSAGE_NO <", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoLessThanOrEqualTo(Integer value) {
            addCriterion("MESSAGE_NO <=", value, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoIn(List<Integer> values) {
            addCriterion("MESSAGE_NO in", values, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoNotIn(List<Integer> values) {
            addCriterion("MESSAGE_NO not in", values, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGE_NO between", value1, value2, "messageNo");
            return (Criteria) this;
        }

        public Criteria andMessageNoNotBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGE_NO not between", value1, value2, "messageNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdIsNull() {
            addCriterion("MESSAGE_OBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdIsNotNull() {
            addCriterion("MESSAGE_OBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdEqualTo(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID =", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdNotEqualTo(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID <>", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdGreaterThan(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID >", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID >=", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdLessThan(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID <", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("MESSAGE_OBJECT_ID <=", value, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdIn(List<Integer> values) {
            addCriterion("MESSAGE_OBJECT_ID in", values, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdNotIn(List<Integer> values) {
            addCriterion("MESSAGE_OBJECT_ID not in", values, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGE_OBJECT_ID between", value1, value2, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andMessageObjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGE_OBJECT_ID not between", value1, value2, "messageObjectId");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNull() {
            addCriterion("CREATE_DATA is null");
            return (Criteria) this;
        }

        public Criteria andCreateDataIsNotNull() {
            addCriterion("CREATE_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDataEqualTo(Date value) {
            addCriterion("CREATE_DATA =", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotEqualTo(Date value) {
            addCriterion("CREATE_DATA <>", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThan(Date value) {
            addCriterion("CREATE_DATA >", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATA >=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThan(Date value) {
            addCriterion("CREATE_DATA <", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATA <=", value, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataIn(List<Date> values) {
            addCriterion("CREATE_DATA in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotIn(List<Date> values) {
            addCriterion("CREATE_DATA not in", values, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATA between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andCreateDataNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATA not between", value1, value2, "createData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIsNull() {
            addCriterion("UPDATE_DATA is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIsNotNull() {
            addCriterion("UPDATE_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDataEqualTo(Date value) {
            addCriterion("UPDATE_DATA =", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotEqualTo(Date value) {
            addCriterion("UPDATE_DATA <>", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataGreaterThan(Date value) {
            addCriterion("UPDATE_DATA >", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATA >=", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataLessThan(Date value) {
            addCriterion("UPDATE_DATA <", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATA <=", value, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataIn(List<Date> values) {
            addCriterion("UPDATE_DATA in", values, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotIn(List<Date> values) {
            addCriterion("UPDATE_DATA not in", values, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATA between", value1, value2, "updateData");
            return (Criteria) this;
        }

        public Criteria andUpdateDataNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATA not between", value1, value2, "updateData");
            return (Criteria) this;
        }

        public Criteria andRs1IsNull() {
            addCriterion("RS_1 is null");
            return (Criteria) this;
        }

        public Criteria andRs1IsNotNull() {
            addCriterion("RS_1 is not null");
            return (Criteria) this;
        }

        public Criteria andRs1EqualTo(String value) {
            addCriterion("RS_1 =", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1NotEqualTo(String value) {
            addCriterion("RS_1 <>", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1GreaterThan(String value) {
            addCriterion("RS_1 >", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1GreaterThanOrEqualTo(String value) {
            addCriterion("RS_1 >=", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1LessThan(String value) {
            addCriterion("RS_1 <", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1LessThanOrEqualTo(String value) {
            addCriterion("RS_1 <=", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1Like(String value) {
            addCriterion("RS_1 like", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1NotLike(String value) {
            addCriterion("RS_1 not like", value, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1In(List<String> values) {
            addCriterion("RS_1 in", values, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1NotIn(List<String> values) {
            addCriterion("RS_1 not in", values, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1Between(String value1, String value2) {
            addCriterion("RS_1 between", value1, value2, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs1NotBetween(String value1, String value2) {
            addCriterion("RS_1 not between", value1, value2, "rs1");
            return (Criteria) this;
        }

        public Criteria andRs2IsNull() {
            addCriterion("RS_2 is null");
            return (Criteria) this;
        }

        public Criteria andRs2IsNotNull() {
            addCriterion("RS_2 is not null");
            return (Criteria) this;
        }

        public Criteria andRs2EqualTo(String value) {
            addCriterion("RS_2 =", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2NotEqualTo(String value) {
            addCriterion("RS_2 <>", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2GreaterThan(String value) {
            addCriterion("RS_2 >", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2GreaterThanOrEqualTo(String value) {
            addCriterion("RS_2 >=", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2LessThan(String value) {
            addCriterion("RS_2 <", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2LessThanOrEqualTo(String value) {
            addCriterion("RS_2 <=", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2Like(String value) {
            addCriterion("RS_2 like", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2NotLike(String value) {
            addCriterion("RS_2 not like", value, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2In(List<String> values) {
            addCriterion("RS_2 in", values, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2NotIn(List<String> values) {
            addCriterion("RS_2 not in", values, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2Between(String value1, String value2) {
            addCriterion("RS_2 between", value1, value2, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs2NotBetween(String value1, String value2) {
            addCriterion("RS_2 not between", value1, value2, "rs2");
            return (Criteria) this;
        }

        public Criteria andRs3IsNull() {
            addCriterion("RS_3 is null");
            return (Criteria) this;
        }

        public Criteria andRs3IsNotNull() {
            addCriterion("RS_3 is not null");
            return (Criteria) this;
        }

        public Criteria andRs3EqualTo(String value) {
            addCriterion("RS_3 =", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3NotEqualTo(String value) {
            addCriterion("RS_3 <>", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3GreaterThan(String value) {
            addCriterion("RS_3 >", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3GreaterThanOrEqualTo(String value) {
            addCriterion("RS_3 >=", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3LessThan(String value) {
            addCriterion("RS_3 <", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3LessThanOrEqualTo(String value) {
            addCriterion("RS_3 <=", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3Like(String value) {
            addCriterion("RS_3 like", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3NotLike(String value) {
            addCriterion("RS_3 not like", value, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3In(List<String> values) {
            addCriterion("RS_3 in", values, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3NotIn(List<String> values) {
            addCriterion("RS_3 not in", values, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3Between(String value1, String value2) {
            addCriterion("RS_3 between", value1, value2, "rs3");
            return (Criteria) this;
        }

        public Criteria andRs3NotBetween(String value1, String value2) {
            addCriterion("RS_3 not between", value1, value2, "rs3");
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