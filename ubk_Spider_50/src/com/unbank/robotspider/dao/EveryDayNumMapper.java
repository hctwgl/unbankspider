package com.unbank.robotspider.dao;

import com.unbank.robotspider.entity.EveryDayNum;
import com.unbank.robotspider.entity.EveryDayNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EveryDayNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int countByExample(EveryDayNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int deleteByExample(EveryDayNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int deleteByPrimaryKey(Integer numId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int insert(EveryDayNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int insertSelective(EveryDayNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    List<EveryDayNum> selectByExample(EveryDayNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    EveryDayNum selectByPrimaryKey(Integer numId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByExampleSelective(@Param("record") EveryDayNum record, @Param("example") EveryDayNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByExample(@Param("record") EveryDayNum record, @Param("example") EveryDayNumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByPrimaryKeySelective(EveryDayNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ptf_day_num
     *
     * @mbggenerated Fri Jul 04 09:31:01 CST 2014
     */
    int updateByPrimaryKey(EveryDayNum record);
}