package com.bugong.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BUserExample() {
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

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(Integer value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(Integer value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(Integer value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(Integer value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(Integer value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<Integer> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<Integer> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("REAL_NAME =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("REAL_NAME <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("REAL_NAME >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_NAME >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("REAL_NAME <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_NAME <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("REAL_NAME like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("REAL_NAME not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("REAL_NAME in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("REAL_NAME not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("REAL_NAME between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("REAL_NAME not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNull() {
            addCriterion("USER_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIsNotNull() {
            addCriterion("USER_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionEqualTo(String value) {
            addCriterion("USER_DESCRIPTION =", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotEqualTo(String value) {
            addCriterion("USER_DESCRIPTION <>", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThan(String value) {
            addCriterion("USER_DESCRIPTION >", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DESCRIPTION >=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThan(String value) {
            addCriterion("USER_DESCRIPTION <", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLessThanOrEqualTo(String value) {
            addCriterion("USER_DESCRIPTION <=", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionLike(String value) {
            addCriterion("USER_DESCRIPTION like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotLike(String value) {
            addCriterion("USER_DESCRIPTION not like", value, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionIn(List<String> values) {
            addCriterion("USER_DESCRIPTION in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotIn(List<String> values) {
            addCriterion("USER_DESCRIPTION not in", values, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionBetween(String value1, String value2) {
            addCriterion("USER_DESCRIPTION between", value1, value2, "userDescription");
            return (Criteria) this;
        }

        public Criteria andUserDescriptionNotBetween(String value1, String value2) {
            addCriterion("USER_DESCRIPTION not between", value1, value2, "userDescription");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
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