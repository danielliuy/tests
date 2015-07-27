package com.daniu.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebAppskinsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public WebAppskinsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIsNull() {
            addCriterion("gmtCreate is null");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIsNotNull() {
            addCriterion("gmtCreate is not null");
            return (Criteria) this;
        }

        public Criteria andGmtcreateEqualTo(Date value) {
            addCriterion("gmtCreate =", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotEqualTo(Date value) {
            addCriterion("gmtCreate <>", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateGreaterThan(Date value) {
            addCriterion("gmtCreate >", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtCreate >=", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateLessThan(Date value) {
            addCriterion("gmtCreate <", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateLessThanOrEqualTo(Date value) {
            addCriterion("gmtCreate <=", value, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateIn(List<Date> values) {
            addCriterion("gmtCreate in", values, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotIn(List<Date> values) {
            addCriterion("gmtCreate not in", values, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateBetween(Date value1, Date value2) {
            addCriterion("gmtCreate between", value1, value2, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtcreateNotBetween(Date value1, Date value2) {
            addCriterion("gmtCreate not between", value1, value2, "gmtcreate");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyIsNull() {
            addCriterion("gmtModify is null");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyIsNotNull() {
            addCriterion("gmtModify is not null");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyEqualTo(Date value) {
            addCriterion("gmtModify =", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyNotEqualTo(Date value) {
            addCriterion("gmtModify <>", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyGreaterThan(Date value) {
            addCriterion("gmtModify >", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyGreaterThanOrEqualTo(Date value) {
            addCriterion("gmtModify >=", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyLessThan(Date value) {
            addCriterion("gmtModify <", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyLessThanOrEqualTo(Date value) {
            addCriterion("gmtModify <=", value, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyIn(List<Date> values) {
            addCriterion("gmtModify in", values, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyNotIn(List<Date> values) {
            addCriterion("gmtModify not in", values, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyBetween(Date value1, Date value2) {
            addCriterion("gmtModify between", value1, value2, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andGmtmodifyNotBetween(Date value1, Date value2) {
            addCriterion("gmtModify not between", value1, value2, "gmtmodify");
            return (Criteria) this;
        }

        public Criteria andIconurlIsNull() {
            addCriterion("iconUrl is null");
            return (Criteria) this;
        }

        public Criteria andIconurlIsNotNull() {
            addCriterion("iconUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIconurlEqualTo(String value) {
            addCriterion("iconUrl =", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotEqualTo(String value) {
            addCriterion("iconUrl <>", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlGreaterThan(String value) {
            addCriterion("iconUrl >", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlGreaterThanOrEqualTo(String value) {
            addCriterion("iconUrl >=", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLessThan(String value) {
            addCriterion("iconUrl <", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLessThanOrEqualTo(String value) {
            addCriterion("iconUrl <=", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlLike(String value) {
            addCriterion("iconUrl like", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotLike(String value) {
            addCriterion("iconUrl not like", value, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlIn(List<String> values) {
            addCriterion("iconUrl in", values, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotIn(List<String> values) {
            addCriterion("iconUrl not in", values, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlBetween(String value1, String value2) {
            addCriterion("iconUrl between", value1, value2, "iconurl");
            return (Criteria) this;
        }

        public Criteria andIconurlNotBetween(String value1, String value2) {
            addCriterion("iconUrl not between", value1, value2, "iconurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIsNull() {
            addCriterion("thumbnailUrl is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIsNotNull() {
            addCriterion("thumbnailUrl is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlEqualTo(String value) {
            addCriterion("thumbnailUrl =", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotEqualTo(String value) {
            addCriterion("thumbnailUrl <>", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlGreaterThan(String value) {
            addCriterion("thumbnailUrl >", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnailUrl >=", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLessThan(String value) {
            addCriterion("thumbnailUrl <", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLessThanOrEqualTo(String value) {
            addCriterion("thumbnailUrl <=", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlLike(String value) {
            addCriterion("thumbnailUrl like", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotLike(String value) {
            addCriterion("thumbnailUrl not like", value, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlIn(List<String> values) {
            addCriterion("thumbnailUrl in", values, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotIn(List<String> values) {
            addCriterion("thumbnailUrl not in", values, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlBetween(String value1, String value2) {
            addCriterion("thumbnailUrl between", value1, value2, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andThumbnailurlNotBetween(String value1, String value2) {
            addCriterion("thumbnailUrl not between", value1, value2, "thumbnailurl");
            return (Criteria) this;
        }

        public Criteria andSkinnameIsNull() {
            addCriterion("skinName is null");
            return (Criteria) this;
        }

        public Criteria andSkinnameIsNotNull() {
            addCriterion("skinName is not null");
            return (Criteria) this;
        }

        public Criteria andSkinnameEqualTo(String value) {
            addCriterion("skinName =", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameNotEqualTo(String value) {
            addCriterion("skinName <>", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameGreaterThan(String value) {
            addCriterion("skinName >", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameGreaterThanOrEqualTo(String value) {
            addCriterion("skinName >=", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameLessThan(String value) {
            addCriterion("skinName <", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameLessThanOrEqualTo(String value) {
            addCriterion("skinName <=", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameLike(String value) {
            addCriterion("skinName like", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameNotLike(String value) {
            addCriterion("skinName not like", value, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameIn(List<String> values) {
            addCriterion("skinName in", values, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameNotIn(List<String> values) {
            addCriterion("skinName not in", values, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameBetween(String value1, String value2) {
            addCriterion("skinName between", value1, value2, "skinname");
            return (Criteria) this;
        }

        public Criteria andSkinnameNotBetween(String value1, String value2) {
            addCriterion("skinName not between", value1, value2, "skinname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameIsNull() {
            addCriterion("ownerNickname is null");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameIsNotNull() {
            addCriterion("ownerNickname is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameEqualTo(String value) {
            addCriterion("ownerNickname =", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameNotEqualTo(String value) {
            addCriterion("ownerNickname <>", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameGreaterThan(String value) {
            addCriterion("ownerNickname >", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameGreaterThanOrEqualTo(String value) {
            addCriterion("ownerNickname >=", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameLessThan(String value) {
            addCriterion("ownerNickname <", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameLessThanOrEqualTo(String value) {
            addCriterion("ownerNickname <=", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameLike(String value) {
            addCriterion("ownerNickname like", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameNotLike(String value) {
            addCriterion("ownerNickname not like", value, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameIn(List<String> values) {
            addCriterion("ownerNickname in", values, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameNotIn(List<String> values) {
            addCriterion("ownerNickname not in", values, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameBetween(String value1, String value2) {
            addCriterion("ownerNickname between", value1, value2, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andOwnernicknameNotBetween(String value1, String value2) {
            addCriterion("ownerNickname not between", value1, value2, "ownernickname");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNull() {
            addCriterion("appType is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("appType is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(Short value) {
            addCriterion("appType =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(Short value) {
            addCriterion("appType <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(Short value) {
            addCriterion("appType >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(Short value) {
            addCriterion("appType >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(Short value) {
            addCriterion("appType <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(Short value) {
            addCriterion("appType <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<Short> values) {
            addCriterion("appType in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<Short> values) {
            addCriterion("appType not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(Short value1, Short value2) {
            addCriterion("appType between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(Short value1, Short value2) {
            addCriterion("appType not between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andSkinurlIsNull() {
            addCriterion("skinUrl is null");
            return (Criteria) this;
        }

        public Criteria andSkinurlIsNotNull() {
            addCriterion("skinUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSkinurlEqualTo(String value) {
            addCriterion("skinUrl =", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlNotEqualTo(String value) {
            addCriterion("skinUrl <>", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlGreaterThan(String value) {
            addCriterion("skinUrl >", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlGreaterThanOrEqualTo(String value) {
            addCriterion("skinUrl >=", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlLessThan(String value) {
            addCriterion("skinUrl <", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlLessThanOrEqualTo(String value) {
            addCriterion("skinUrl <=", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlLike(String value) {
            addCriterion("skinUrl like", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlNotLike(String value) {
            addCriterion("skinUrl not like", value, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlIn(List<String> values) {
            addCriterion("skinUrl in", values, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlNotIn(List<String> values) {
            addCriterion("skinUrl not in", values, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlBetween(String value1, String value2) {
            addCriterion("skinUrl between", value1, value2, "skinurl");
            return (Criteria) this;
        }

        public Criteria andSkinurlNotBetween(String value1, String value2) {
            addCriterion("skinUrl not between", value1, value2, "skinurl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_appskins
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table web_appskins
     *
     * @mbggenerated
     */
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