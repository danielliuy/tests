package com.daniu.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class SynthesizeRecommendBookExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public SynthesizeRecommendBookExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
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
     * This method corresponds to the database table synthesize_recommend_book
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
     * This method corresponds to the database table synthesize_recommend_book
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table synthesize_recommend_book
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
     * This class corresponds to the database table synthesize_recommend_book
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Long value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Long value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Long value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Long value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Long value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Long value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Long> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Long> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Long value1, Long value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Long value1, Long value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNull() {
            addCriterion("recommend_id is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIsNotNull() {
            addCriterion("recommend_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendIdEqualTo(Long value) {
            addCriterion("recommend_id =", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotEqualTo(Long value) {
            addCriterion("recommend_id <>", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThan(Long value) {
            addCriterion("recommend_id >", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdGreaterThanOrEqualTo(Long value) {
            addCriterion("recommend_id >=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThan(Long value) {
            addCriterion("recommend_id <", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdLessThanOrEqualTo(Long value) {
            addCriterion("recommend_id <=", value, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdIn(List<Long> values) {
            addCriterion("recommend_id in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotIn(List<Long> values) {
            addCriterion("recommend_id not in", values, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdBetween(Long value1, Long value2) {
            addCriterion("recommend_id between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andRecommendIdNotBetween(Long value1, Long value2) {
            addCriterion("recommend_id not between", value1, value2, "recommendId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsIsNull() {
            addCriterion("recommend_words is null");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsIsNotNull() {
            addCriterion("recommend_words is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsEqualTo(String value) {
            addCriterion("recommend_words =", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsNotEqualTo(String value) {
            addCriterion("recommend_words <>", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsGreaterThan(String value) {
            addCriterion("recommend_words >", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsGreaterThanOrEqualTo(String value) {
            addCriterion("recommend_words >=", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsLessThan(String value) {
            addCriterion("recommend_words <", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsLessThanOrEqualTo(String value) {
            addCriterion("recommend_words <=", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsLike(String value) {
            addCriterion("recommend_words like", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsNotLike(String value) {
            addCriterion("recommend_words not like", value, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsIn(List<String> values) {
            addCriterion("recommend_words in", values, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsNotIn(List<String> values) {
            addCriterion("recommend_words not in", values, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsBetween(String value1, String value2) {
            addCriterion("recommend_words between", value1, value2, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRecommendWordsNotBetween(String value1, String value2) {
            addCriterion("recommend_words not between", value1, value2, "recommendWords");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andGroupCountIsNull() {
            addCriterion("group_count is null");
            return (Criteria) this;
        }

        public Criteria andGroupCountIsNotNull() {
            addCriterion("group_count is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCountEqualTo(Integer value) {
            addCriterion("group_count =", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotEqualTo(Integer value) {
            addCriterion("group_count <>", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountGreaterThan(Integer value) {
            addCriterion("group_count >", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_count >=", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountLessThan(Integer value) {
            addCriterion("group_count <", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountLessThanOrEqualTo(Integer value) {
            addCriterion("group_count <=", value, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountIn(List<Integer> values) {
            addCriterion("group_count in", values, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotIn(List<Integer> values) {
            addCriterion("group_count not in", values, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountBetween(Integer value1, Integer value2) {
            addCriterion("group_count between", value1, value2, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupCountNotBetween(Integer value1, Integer value2) {
            addCriterion("group_count not between", value1, value2, "groupCount");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionIsNull() {
            addCriterion("group_description is null");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionIsNotNull() {
            addCriterion("group_description is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionEqualTo(String value) {
            addCriterion("group_description =", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionNotEqualTo(String value) {
            addCriterion("group_description <>", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionGreaterThan(String value) {
            addCriterion("group_description >", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("group_description >=", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionLessThan(String value) {
            addCriterion("group_description <", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionLessThanOrEqualTo(String value) {
            addCriterion("group_description <=", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionLike(String value) {
            addCriterion("group_description like", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionNotLike(String value) {
            addCriterion("group_description not like", value, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionIn(List<String> values) {
            addCriterion("group_description in", values, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionNotIn(List<String> values) {
            addCriterion("group_description not in", values, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionBetween(String value1, String value2) {
            addCriterion("group_description between", value1, value2, "groupDescription");
            return (Criteria) this;
        }

        public Criteria andGroupDescriptionNotBetween(String value1, String value2) {
            addCriterion("group_description not between", value1, value2, "groupDescription");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table synthesize_recommend_book
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
     * This class corresponds to the database table synthesize_recommend_book
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