package com.bugong.domain;

import java.util.ArrayList;
import java.util.List;

public class BRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BRoleExample() {
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

        public Criteria andRoleNoIsNull() {
            addCriterion("ROLE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRoleNoIsNotNull() {
            addCriterion("ROLE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNoEqualTo(Integer value) {
            addCriterion("ROLE_NO =", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotEqualTo(Integer value) {
            addCriterion("ROLE_NO <>", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThan(Integer value) {
            addCriterion("ROLE_NO >", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_NO >=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThan(Integer value) {
            addCriterion("ROLE_NO <", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_NO <=", value, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoIn(List<Integer> values) {
            addCriterion("ROLE_NO in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotIn(List<Integer> values) {
            addCriterion("ROLE_NO not in", values, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_NO between", value1, value2, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_NO not between", value1, value2, "roleNo");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNull() {
            addCriterion("ROLE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNotNull() {
            addCriterion("ROLE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION =", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <>", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThan(String value) {
            addCriterion("ROLE_DESCRIPTION >", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION >=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThan(String value) {
            addCriterion("ROLE_DESCRIPTION <", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLike(String value) {
            addCriterion("ROLE_DESCRIPTION like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotLike(String value) {
            addCriterion("ROLE_DESCRIPTION not like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION not in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION between", value1, value2, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION not between", value1, value2, "roleDescription");
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