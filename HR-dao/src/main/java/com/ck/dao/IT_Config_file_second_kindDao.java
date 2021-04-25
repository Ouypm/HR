package com.ck.dao;

import com.ck.entity.T_Config_file_second_kind;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * HR-
 * Description:
 * 二级机构表的dao
 * @Author 林先森
 * @Date 2021/4/14 10:09
 */
public interface IT_Config_file_second_kindDao {
    /* 根据一级机构的编号查询二级机构的数据 */
    @Select("SELECT second_kind_id,second_kind_name FROM t_Config_file_second_kind where first_kind_id = #{fid}")
    @ResultMap("file_second_kindDao")
    public List<T_Config_file_second_kind> FistIdQueryAll(@Param("fid") int fid);

    /* 根据二级机构的编号查询名字 */
    @Select("select second_kind_name from t_Config_file_second_kind where second_kind_id=#{sid}")
    @ResultMap("file_second_kindDao")
    public T_Config_file_second_kind secondqeruyById(int sid);
}
