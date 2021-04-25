package com.ck.service;

import com.ck.entity.Config_major;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/19 14:41
 */
public interface IConfig_majorService {

    public List<Config_major> queConfigMajorAll(int cid);

    //根据职位分类编号查询
    public Config_major majorqueryById(int kid);

}
