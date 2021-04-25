package com.ck.dao;

import com.ck.entity.T_Config_file_third_kind;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

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

    /* 三级机构根据id查询名字 */
    @Select("select third_kind_name from t_Config_file_third_kind where third_kind_id=#{tid}")
    @ResultMap("file_third_kindDao")
    public T_Config_file_third_kind thirdqueryById(int tid);
}
