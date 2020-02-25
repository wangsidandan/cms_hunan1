package com.briup.cms.mapper;

import com.briup.cms.model.Category;
import com.briup.cms.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    long countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    Category selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_category
     *
     * @mbg.generated Tue Feb 25 23:37:36 CST 2020
     */
    int updateByPrimaryKey(Category record);
}