package com.briup.cms.model;

import java.util.Date;

public class Title {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.author
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.clicktimes
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private Integer clicktimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.content
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.publishDate
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private Date publishdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.title
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_title.category_id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    private Long categoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.id
     *
     * @return the value of cms_title.id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.id
     *
     * @param id the value for cms_title.id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.author
     *
     * @return the value of cms_title.author
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.author
     *
     * @param author the value for cms_title.author
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.clicktimes
     *
     * @return the value of cms_title.clicktimes
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public Integer getClicktimes() {
        return clicktimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.clicktimes
     *
     * @param clicktimes the value for cms_title.clicktimes
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setClicktimes(Integer clicktimes) {
        this.clicktimes = clicktimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.content
     *
     * @return the value of cms_title.content
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.content
     *
     * @param content the value for cms_title.content
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.publishDate
     *
     * @return the value of cms_title.publishDate
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public Date getPublishdate() {
        return publishdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.publishDate
     *
     * @param publishdate the value for cms_title.publishDate
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.title
     *
     * @return the value of cms_title.title
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.title
     *
     * @param title the value for cms_title.title
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_title.category_id
     *
     * @return the value of cms_title.category_id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_title.category_id
     *
     * @param categoryId the value for cms_title.category_id
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}