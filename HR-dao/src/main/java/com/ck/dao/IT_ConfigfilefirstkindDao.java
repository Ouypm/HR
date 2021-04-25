package com.ck.dao;

import com.ck.entity.T_Config_file_first_kind;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.faces.annotation.RequestMap;
import java.util.List;

/**
 * HR-
 * Description:
 * 一级机构表的dao
 * @Author 林先森
 * @Date 2021/4/14 9:31
 */
public interface IT_ConfigfilefirstkindDao {
    /* 查询所有一级机构数据 */
    @Select("SELECT * FROM t_Config_file_first_kind")
    @ResultMap("IT_Configfilefirstkind")
    public List<T_Config_file_first_kind> firstqueryAll();

    /* 根据id查询一级机构的一级名称 */
    @Select("select first_kind_name from t_Config_file_first_kind where first_kind_id=#{fid}")
    @ResultMap("IT_Configfilefirstkind")
    public T_Config_file_first_kind fistqueryById(int fid);
}
