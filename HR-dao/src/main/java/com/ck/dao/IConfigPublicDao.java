package com.ck.dao;

import com.ck.entity.T_Config_public_char;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/14 19:15
 */
public interface IConfigPublicDao {

    //查询所有公共字段
    @Select("select * from t_Config_public_char")
    @ResultMap("queConfigPublic")
    public List<T_Config_public_char> query_Config_Public();
}
