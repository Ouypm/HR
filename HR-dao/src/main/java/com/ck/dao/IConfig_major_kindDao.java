package com.ck.dao;

import com.ck.entity.Config_major_kind;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Description:
 * 职位分类设置
 * @Author SQB
 * @Date 2021/4/19 14:27
 */
public interface IConfig_major_kindDao {

    //查询所有分类
    @Select("select * from t_Config_major_kind")
    @ResultMap("queConfigMajorKind")
    public List<Config_major_kind> queConfigMajorKindAll();

}
