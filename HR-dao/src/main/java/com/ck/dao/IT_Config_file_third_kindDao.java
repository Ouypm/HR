package com.ck.dao;

import com.ck.entity.T_Config_file_third_kind;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * HR-
 * Description:
 * 三级机构表的dao
 * @Author 林先森
 * @Date 2021/4/14 15:21
 */
public interface IT_Config_file_third_kindDao {
    /* 根据二级机构编号查询三级机构的数据 */
    @Select("SELECT third_kind_id,third_kind_name FROM t_Config_file_third_kind where second_kind_id = #{sid}")
    @ResultMap("file_third_kindDao")
    public List<T_Config_file_third_kind> SecondIdQueryAll(@Param("sid") int sid);
}
