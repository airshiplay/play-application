package com.airlenet.play.website.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WebsiteConfigExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_config
     *
     * @date
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_config
     *
     * @date
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table website_config
     *
     * @date
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public WebsiteConfigExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
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
     * This method corresponds to the database table website_config
     *
     * @date
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table website_config
     *
     * @date
     */
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

    /**
     *
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

        public Criteria andCreatedDateIsNull() {
            addCriterion("createdDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("createdDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("createdDate =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("createdDate <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("createdDate >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDate >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("createdDate <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("createdDate <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("createdDate in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("createdDate not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("createdDate between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("createdDate not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNull() {
            addCriterion("lastModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIsNotNull() {
            addCriterion("lastModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateEqualTo(Date value) {
            addCriterion("lastModifiedDate =", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotEqualTo(Date value) {
            addCriterion("lastModifiedDate <>", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThan(Date value) {
            addCriterion("lastModifiedDate >", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate >=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThan(Date value) {
            addCriterion("lastModifiedDate <", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("lastModifiedDate <=", value, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateIn(List<Date> values) {
            addCriterion("lastModifiedDate in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotIn(List<Date> values) {
            addCriterion("lastModifiedDate not in", values, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andLastModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("lastModifiedDate not between", value1, value2, "lastModifiedDate");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idIsNull() {
            addCriterion("createdBy_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idIsNotNull() {
            addCriterion("createdBy_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idEqualTo(Long value) {
            addCriterion("createdBy_id =", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idNotEqualTo(Long value) {
            addCriterion("createdBy_id <>", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idGreaterThan(Long value) {
            addCriterion("createdBy_id >", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idGreaterThanOrEqualTo(Long value) {
            addCriterion("createdBy_id >=", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idLessThan(Long value) {
            addCriterion("createdBy_id <", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idLessThanOrEqualTo(Long value) {
            addCriterion("createdBy_id <=", value, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idIn(List<Long> values) {
            addCriterion("createdBy_id in", values, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idNotIn(List<Long> values) {
            addCriterion("createdBy_id not in", values, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idBetween(Long value1, Long value2) {
            addCriterion("createdBy_id between", value1, value2, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andCreatedBy_idNotBetween(Long value1, Long value2) {
            addCriterion("createdBy_id not between", value1, value2, "createdBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idIsNull() {
            addCriterion("lastModifiedBy_id is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idIsNotNull() {
            addCriterion("lastModifiedBy_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idEqualTo(Long value) {
            addCriterion("lastModifiedBy_id =", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idNotEqualTo(Long value) {
            addCriterion("lastModifiedBy_id <>", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idGreaterThan(Long value) {
            addCriterion("lastModifiedBy_id >", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idGreaterThanOrEqualTo(Long value) {
            addCriterion("lastModifiedBy_id >=", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idLessThan(Long value) {
            addCriterion("lastModifiedBy_id <", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idLessThanOrEqualTo(Long value) {
            addCriterion("lastModifiedBy_id <=", value, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idIn(List<Long> values) {
            addCriterion("lastModifiedBy_id in", values, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idNotIn(List<Long> values) {
            addCriterion("lastModifiedBy_id not in", values, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idBetween(Long value1, Long value2) {
            addCriterion("lastModifiedBy_id between", value1, value2, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBy_idNotBetween(Long value1, Long value2) {
            addCriterion("lastModifiedBy_id not between", value1, value2, "lastModifiedBy_id");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNull() {
            addCriterion("seoDescription is null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIsNotNull() {
            addCriterion("seoDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionEqualTo(String value) {
            addCriterion("seoDescription =", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotEqualTo(String value) {
            addCriterion("seoDescription <>", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThan(String value) {
            addCriterion("seoDescription >", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seoDescription >=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThan(String value) {
            addCriterion("seoDescription <", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seoDescription <=", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionLike(String value) {
            addCriterion("seoDescription like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotLike(String value) {
            addCriterion("seoDescription not like", value, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionIn(List<String> values) {
            addCriterion("seoDescription in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotIn(List<String> values) {
            addCriterion("seoDescription not in", values, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionBetween(String value1, String value2) {
            addCriterion("seoDescription between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoDescriptionNotBetween(String value1, String value2) {
            addCriterion("seoDescription not between", value1, value2, "seoDescription");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNull() {
            addCriterion("seoKeywords is null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIsNotNull() {
            addCriterion("seoKeywords is not null");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsEqualTo(String value) {
            addCriterion("seoKeywords =", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotEqualTo(String value) {
            addCriterion("seoKeywords <>", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThan(String value) {
            addCriterion("seoKeywords >", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("seoKeywords >=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThan(String value) {
            addCriterion("seoKeywords <", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLessThanOrEqualTo(String value) {
            addCriterion("seoKeywords <=", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsLike(String value) {
            addCriterion("seoKeywords like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotLike(String value) {
            addCriterion("seoKeywords not like", value, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsIn(List<String> values) {
            addCriterion("seoKeywords in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotIn(List<String> values) {
            addCriterion("seoKeywords not in", values, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsBetween(String value1, String value2) {
            addCriterion("seoKeywords between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoKeywordsNotBetween(String value1, String value2) {
            addCriterion("seoKeywords not between", value1, value2, "seoKeywords");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("seoTitle is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("seoTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("seoTitle =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("seoTitle <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("seoTitle >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seoTitle >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("seoTitle <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("seoTitle <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("seoTitle like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("seoTitle not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("seoTitle in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("seoTitle not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("seoTitle between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("seoTitle not between", value1, value2, "seoTitle");
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

    /**
     *
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