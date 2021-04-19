package com.ck.dao;

import com.ck.entity.Engage_major_release;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;


import java.util.List;

/**
 * @Author: 欧阳鹏明
 * @Date: 2021年04月14日 11:50
 * @Description:
 */
public interface IEngage_major_releaseDao {
    @Select("select * from t_Engage_major_release")
    @ResultMap("Engage_major_releaseMap")
    public List<Engage_major_release> QueryAll();
}
