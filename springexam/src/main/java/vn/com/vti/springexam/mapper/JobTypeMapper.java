package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.JobType;
import vn.com.vti.springexam.entity.JobTypeExample;

public interface JobTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    long countByExample(JobTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int deleteByExample(JobTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int deleteByPrimaryKey(String jobTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int insert(JobType row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int insertSelective(JobType row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    List<JobType> selectByExample(JobTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    JobType selectByPrimaryKey(String jobTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int updateByExampleSelective(@Param("row") JobType row, @Param("example") JobTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int updateByExample(@Param("row") JobType row, @Param("example") JobTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int updateByPrimaryKeySelective(JobType row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table job_type
     *
     * @mbg.generated Fri Sep 23 09:32:53 JST 2022
     */
    int updateByPrimaryKey(JobType row);
}