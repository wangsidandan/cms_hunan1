package com.briup.cms.mapper;

import com.briup.cms.model.Link;
import com.briup.cms.model.LinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    long countByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int deleteByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int insert(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int insertSelective(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    List<Link> selectByExample(LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    Link selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int updateByExampleSelective(@Param("record") Link record, @Param("example") LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int updateByExample(@Param("record") Link record, @Param("example") LinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int updateByPrimaryKeySelective(Link record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_link
     *
     * @mbg.generated Tue Feb 25 23:39:18 CST 2020
     */
    int updateByPrimaryKey(Link record);
}