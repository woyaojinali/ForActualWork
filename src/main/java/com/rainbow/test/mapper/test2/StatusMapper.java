package com.rainbow.test.mapper.test2;

import com.rainbow.test.model.Status;
import com.rainbow.test.model.StatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int countByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int deleteByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int insert(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int insertSelective(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    List<Status> selectByExample(StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    Status selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Status record, @Param("example") StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int updateByPrimaryKeySelective(Status record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATUS
     *
     * @mbggenerated Thu Jun 06 17:07:25 CST 2019
     */
    int updateByPrimaryKey(Status record);
}