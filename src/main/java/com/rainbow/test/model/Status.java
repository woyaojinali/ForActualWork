package com.rainbow.test.model;

public class Status {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATUS.ID
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATUS.STATUS_CODE
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    private String statusCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column STATUS.STATUS_NAME
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    private String statusName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATUS.ID
     *
     * @return the value of STATUS.ID
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATUS.ID
     *
     * @param id the value for STATUS.ID
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATUS.STATUS_CODE
     *
     * @return the value of STATUS.STATUS_CODE
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATUS.STATUS_CODE
     *
     * @param statusCode the value for STATUS.STATUS_CODE
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column STATUS.STATUS_NAME
     *
     * @return the value of STATUS.STATUS_NAME
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column STATUS.STATUS_NAME
     *
     * @param statusName the value for STATUS.STATUS_NAME
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }
}