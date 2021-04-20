package com.ck.service;

import com.ck.entity.T_Config_public_char;
import com.ck.entity.T_HumanFile_dig;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/9 11:04
 */
public interface IHumanResourceService {

    //查询所有
    public List<T_HumanFile_dig> query_HumanFile_dig();

    //根据id查询
    public T_HumanFile_dig queryById_HumanFile_dig(int hid);

    //复核人力资源
    public void updateHumanResource(T_HumanFile_dig THumanFile_dig);

    /* 多重查询   调动 */
    public List<T_HumanFile_dig> queHumanResourceMapperDuoch(Map map);



}
