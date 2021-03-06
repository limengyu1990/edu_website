package com.test;

import com.test.FreecmsTest;
import com.test.FreecmsTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FreecmsTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int countByExample(FreecmsTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int deleteByExample(FreecmsTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int insert(FreecmsTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int insertSelective(FreecmsTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    List<FreecmsTest> selectByExample(FreecmsTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    FreecmsTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int updateByExampleSelective(@Param("record") FreecmsTest record, @Param("example") FreecmsTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int updateByExample(@Param("record") FreecmsTest record, @Param("example") FreecmsTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int updateByPrimaryKeySelective(FreecmsTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table freecms_test
     *
     * @mbggenerated Mon Dec 02 17:37:45 CST 2013
     */
    int updateByPrimaryKey(FreecmsTest record);
}