package com.ck.service;

import com.ck.entity.Config_major;
import com.ck.entity.Config_major_kind;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/19 14:34
 */
public interface IConfig_major_kindService {

    public List<Config_major_kind> queConfigMajorKindAll();

    /* 职业分类表根据id查询 */
    public Config_major_kind major_kindqueryById(int mid);

}
