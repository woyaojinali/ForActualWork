package com.rainbow.test.model;

import java.util.Date;

public class Person {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.id
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.name
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.birthday
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    private Date birthday;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person.time
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    private Date time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.id
     *
     * @return the value of person.id
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.id
     *
     * @param id the value for person.id
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.name
     *
     * @return the value of person.name
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.name
     *
     * @param name the value for person.name
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.birthday
     *
     * @return the value of person.birthday
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.birthday
     *
     * @param birthday the value for person.birthday
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person.time
     *
     * @return the value of person.time
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person.time
     *
     * @param time the value for person.time
     *
     * @mbggenerated Wed Jun 05 18:10:58 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }
}