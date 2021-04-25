package com.ck.dao;

import com.ck.entity.Config_major;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/19 14:37
 */
public interface IConfig_majorDao {

    //根据职位分类编号查询
    @Select("select * from t_Config_major where major_kind_id = #{cid}")
    @ResultMap("queConfigMajor")
    public List<Config_major> queConfigMajorAll(int cid);

    //根据职位分类编号查询
    @Select("select major_name from t_Config_major where major_id = #{kid}")
    @ResultMap("queConfigMajor")
    public Config_major majorqueryById(int kid);
}
