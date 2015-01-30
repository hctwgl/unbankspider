package com.unbank.robotspider.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrawlTestExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public CrawlTestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
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
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
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

        public Criteria andWebsiteIdIsNull() {
            addCriterion("website_id is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdIsNotNull() {
            addCriterion("website_id is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdEqualTo(Integer value) {
            addCriterion("website_id =", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotEqualTo(Integer value) {
            addCriterion("website_id <>", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdGreaterThan(Integer value) {
            addCriterion("website_id >", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("website_id >=", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdLessThan(Integer value) {
            addCriterion("website_id <", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("website_id <=", value, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdIn(List<Integer> values) {
            addCriterion("website_id in", values, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotIn(List<Integer> values) {
            addCriterion("website_id not in", values, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("website_id between", value1, value2, "websiteId");
            return (Criteria) this;
        }

        public Criteria andWebsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("website_id not between", value1, value2, "websiteId");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleIsNull() {
            addCriterion("crawl_title is null");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleIsNotNull() {
            addCriterion("crawl_title is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleEqualTo(String value) {
            addCriterion("crawl_title =", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleNotEqualTo(String value) {
            addCriterion("crawl_title <>", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleGreaterThan(String value) {
            addCriterion("crawl_title >", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_title >=", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleLessThan(String value) {
            addCriterion("crawl_title <", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleLessThanOrEqualTo(String value) {
            addCriterion("crawl_title <=", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleLike(String value) {
            addCriterion("crawl_title like", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleNotLike(String value) {
            addCriterion("crawl_title not like", value, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleIn(List<String> values) {
            addCriterion("crawl_title in", values, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleNotIn(List<String> values) {
            addCriterion("crawl_title not in", values, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleBetween(String value1, String value2) {
            addCriterion("crawl_title between", value1, value2, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlTitleNotBetween(String value1, String value2) {
            addCriterion("crawl_title not between", value1, value2, "crawlTitle");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefIsNull() {
            addCriterion("crawl_brief is null");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefIsNotNull() {
            addCriterion("crawl_brief is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefEqualTo(String value) {
            addCriterion("crawl_brief =", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefNotEqualTo(String value) {
            addCriterion("crawl_brief <>", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefGreaterThan(String value) {
            addCriterion("crawl_brief >", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefGreaterThanOrEqualTo(String value) {
            addCriterion("crawl_brief >=", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefLessThan(String value) {
            addCriterion("crawl_brief <", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefLessThanOrEqualTo(String value) {
            addCriterion("crawl_brief <=", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefLike(String value) {
            addCriterion("crawl_brief like", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefNotLike(String value) {
            addCriterion("crawl_brief not like", value, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefIn(List<String> values) {
            addCriterion("crawl_brief in", values, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefNotIn(List<String> values) {
            addCriterion("crawl_brief not in", values, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefBetween(String value1, String value2) {
            addCriterion("crawl_brief between", value1, value2, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlBriefNotBetween(String value1, String value2) {
            addCriterion("crawl_brief not between", value1, value2, "crawlBrief");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsIsNull() {
            addCriterion("crawl_views is null");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsIsNotNull() {
            addCriterion("crawl_views is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsEqualTo(Integer value) {
            addCriterion("crawl_views =", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsNotEqualTo(Integer value) {
            addCriterion("crawl_views <>", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsGreaterThan(Integer value) {
            addCriterion("crawl_views >", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("crawl_views >=", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsLessThan(Integer value) {
            addCriterion("crawl_views <", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsLessThanOrEqualTo(Integer value) {
            addCriterion("crawl_views <=", value, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsIn(List<Integer> values) {
            addCriterion("crawl_views in", values, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsNotIn(List<Integer> values) {
            addCriterion("crawl_views not in", values, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsBetween(Integer value1, Integer value2) {
            addCriterion("crawl_views between", value1, value2, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andCrawlViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("crawl_views not between", value1, value2, "crawlViews");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNull() {
            addCriterion("web_name is null");
            return (Criteria) this;
        }

        public Criteria andWebNameIsNotNull() {
            addCriterion("web_name is not null");
            return (Criteria) this;
        }

        public Criteria andWebNameEqualTo(String value) {
            addCriterion("web_name =", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotEqualTo(String value) {
            addCriterion("web_name <>", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThan(String value) {
            addCriterion("web_name >", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameGreaterThanOrEqualTo(String value) {
            addCriterion("web_name >=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThan(String value) {
            addCriterion("web_name <", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLessThanOrEqualTo(String value) {
            addCriterion("web_name <=", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameLike(String value) {
            addCriterion("web_name like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotLike(String value) {
            addCriterion("web_name not like", value, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameIn(List<String> values) {
            addCriterion("web_name in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotIn(List<String> values) {
            addCriterion("web_name not in", values, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameBetween(String value1, String value2) {
            addCriterion("web_name between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andWebNameNotBetween(String value1, String value2) {
            addCriterion("web_name not between", value1, value2, "webName");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andFileIndexIsNull() {
            addCriterion("file_index is null");
            return (Criteria) this;
        }

        public Criteria andFileIndexIsNotNull() {
            addCriterion("file_index is not null");
            return (Criteria) this;
        }

        public Criteria andFileIndexEqualTo(Boolean value) {
            addCriterion("file_index =", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexNotEqualTo(Boolean value) {
            addCriterion("file_index <>", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexGreaterThan(Boolean value) {
            addCriterion("file_index >", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("file_index >=", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexLessThan(Boolean value) {
            addCriterion("file_index <", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexLessThanOrEqualTo(Boolean value) {
            addCriterion("file_index <=", value, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexIn(List<Boolean> values) {
            addCriterion("file_index in", values, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexNotIn(List<Boolean> values) {
            addCriterion("file_index not in", values, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexBetween(Boolean value1, Boolean value2) {
            addCriterion("file_index between", value1, value2, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andFileIndexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("file_index not between", value1, value2, "fileIndex");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIsNull() {
            addCriterion("crawl_time is null");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIsNotNull() {
            addCriterion("crawl_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeEqualTo(Date value) {
            addCriterion("crawl_time =", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotEqualTo(Date value) {
            addCriterion("crawl_time <>", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeGreaterThan(Date value) {
            addCriterion("crawl_time >", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crawl_time >=", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeLessThan(Date value) {
            addCriterion("crawl_time <", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeLessThanOrEqualTo(Date value) {
            addCriterion("crawl_time <=", value, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeIn(List<Date> values) {
            addCriterion("crawl_time in", values, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotIn(List<Date> values) {
            addCriterion("crawl_time not in", values, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeBetween(Date value1, Date value2) {
            addCriterion("crawl_time between", value1, value2, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andCrawlTimeNotBetween(Date value1, Date value2) {
            addCriterion("crawl_time not between", value1, value2, "crawlTime");
            return (Criteria) this;
        }

        public Criteria andTaskIsNull() {
            addCriterion("task is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsNotNull() {
            addCriterion("task is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEqualTo(Byte value) {
            addCriterion("task =", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotEqualTo(Byte value) {
            addCriterion("task <>", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThan(Byte value) {
            addCriterion("task >", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThanOrEqualTo(Byte value) {
            addCriterion("task >=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThan(Byte value) {
            addCriterion("task <", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThanOrEqualTo(Byte value) {
            addCriterion("task <=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskIn(List<Byte> values) {
            addCriterion("task in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotIn(List<Byte> values) {
            addCriterion("task not in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskBetween(Byte value1, Byte value2) {
            addCriterion("task between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotBetween(Byte value1, Byte value2) {
            addCriterion("task not between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andPassedIsNull() {
            addCriterion("passed is null");
            return (Criteria) this;
        }

        public Criteria andPassedIsNotNull() {
            addCriterion("passed is not null");
            return (Criteria) this;
        }

        public Criteria andPassedEqualTo(Byte value) {
            addCriterion("passed =", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotEqualTo(Byte value) {
            addCriterion("passed <>", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThan(Byte value) {
            addCriterion("passed >", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedGreaterThanOrEqualTo(Byte value) {
            addCriterion("passed >=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThan(Byte value) {
            addCriterion("passed <", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedLessThanOrEqualTo(Byte value) {
            addCriterion("passed <=", value, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedIn(List<Byte> values) {
            addCriterion("passed in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotIn(List<Byte> values) {
            addCriterion("passed not in", values, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedBetween(Byte value1, Byte value2) {
            addCriterion("passed between", value1, value2, "passed");
            return (Criteria) this;
        }

        public Criteria andPassedNotBetween(Byte value1, Byte value2) {
            addCriterion("passed not between", value1, value2, "passed");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 20 09:57:02 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ptf_crawl_test
     *
     * @mbggenerated Tue Jan 20 09:57:02 CST 2015
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