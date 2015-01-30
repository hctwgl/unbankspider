package com.unbank.robotspider.entity;

import java.util.ArrayList;
import java.util.List;

public class ArticleContentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public ArticleContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
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
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
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

        public Criteria andCrawlIdIsNull() {
            addCriterion("crawl_id is null");
            return (Criteria) this;
        }

        public Criteria andCrawlIdIsNotNull() {
            addCriterion("crawl_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlIdEqualTo(Integer value) {
            addCriterion("crawl_id =", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotEqualTo(Integer value) {
            addCriterion("crawl_id <>", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdGreaterThan(Integer value) {
            addCriterion("crawl_id >", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("crawl_id >=", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdLessThan(Integer value) {
            addCriterion("crawl_id <", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdLessThanOrEqualTo(Integer value) {
            addCriterion("crawl_id <=", value, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdIn(List<Integer> values) {
            addCriterion("crawl_id in", values, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotIn(List<Integer> values) {
            addCriterion("crawl_id not in", values, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdBetween(Integer value1, Integer value2) {
            addCriterion("crawl_id between", value1, value2, "crawlId");
            return (Criteria) this;
        }

        public Criteria andCrawlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("crawl_id not between", value1, value2, "crawlId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated do_not_delete_during_merge Fri Jul 04 09:31:01 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_text
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
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