package com.ck.dao;

import com.ck.entity.Major_change;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * HR
 * Description:
 * Major_change表的dao
 * @Author 林先森
 * @Date 2021/4/20 15:39
 */
public interface IMajor_changeDao {
    /* 添加Major_change表的数据 */
    @Select("INSERT INTO t_Major_change VALUES(0,#{first_kind_id},#{first_kind_name},#{second_kind_id},#{second_kind_name},#{third_kind_id},#{third_kind_name},#{major_kind_id}," +
            "#{major_kind_name},#{major_id},#{major_name},#{new_first_kind_id},#{new_first_kind_name},#{new_second_kind_id},#{new_second_kind_name},#{new_third_kind_id},#{new_third_kind_name}," +
            "#{new_major_kind_id},#{new_major_kind_name},#{new_major_id},#{new_major_name},#{human_id},#{human_name},#{salary_standard_id},#{salary_standard_name},#{salary_sum}," +
            "#{new_salary_standard_id},#{new_salary_standard_name},#{new_salary_sum},#{change_reason},#{check_reason},#{check_status},#{register},#{checker},#{regist_time},#{check_time});")
    public void majorAdd(Major_change majorChange);

    /* 查询Major_change表的所有未审核的数据 */
    @Select("SELECT * FROM t_Major_change where check_status=0")
    @ResultMap("majorchangeAll")
    public List<Major_change> Major_changequeryAll();

    /* 根据id查询Major_change表的所有数据 */
    @Select("SELECT * FROM t_Major_change where mch_id = #{cid}")
    @ResultMap("majorchangeAll")
    public Major_change Major_changequeryById(int cid);

    /* 多条件查询 */
    public List<Major_change> Major_changeDquery(Map map);

    /* 根据id做修改 */
    @Update("update t_Major_change set check_reason=#{check_reason},check_status=#{check_status},checker=#{checker},check_time=#{check_time} where mch_id=#{mch_id}")
    public void MajorUpdate(Major_change majorChange);
}
