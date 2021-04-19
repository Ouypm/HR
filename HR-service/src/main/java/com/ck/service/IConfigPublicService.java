package com.ck.service;

import com.ck.entity.T_Config_public_char;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/14 19:18
 */
public interface IConfigPublicService {

    //查询公共字段
    public List<T_Config_public_char> query_Config_Public();

}
