package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.Section8;
import vn.com.vti.springexam.entity.Section8Example;

public interface Section8Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    long countByExample(Section8Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int deleteByExample(Section8Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int insert(Section8 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int insertSelective(Section8 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    List<Section8> selectByExample(Section8Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    Section8 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int updateByExampleSelective(@Param("row") Section8 row, @Param("example") Section8Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int updateByExample(@Param("row") Section8 row, @Param("example") Section8Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int updateByPrimaryKeySelective(Section8 row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section8
     *
     * @mbg.generated Thu Sep 22 17:23:35 JST 2022
     */
    int updateByPrimaryKey(Section8 row);
}