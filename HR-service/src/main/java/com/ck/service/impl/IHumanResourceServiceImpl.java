package com.ck.service.impl;

import com.ck.dao.IHumanResourceDao;
import com.ck.entity.T_Config_public_char;
import com.ck.entity.T_HumanFile_dig;
import com.ck.service.IHumanResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/9 11:04
 */
@Service
public class IHumanResourceServiceImpl implements IHumanResourceService {

    //自动注入人力资源dao
    @Autowired
    private IHumanResourceDao iHumanResourceDao;

    //查询所有
    public List<T_HumanFile_dig> query_HumanFile_dig() {
        return iHumanResourceDao.query_HumanFile_dig();
    }

    //根据id查询
    public T_HumanFile_dig queryById_HumanFile_dig(int hid) {
        return iHumanResourceDao.queryById_HumanFile_dig(hid);
    }

    //复核人力资源
    public void updateHumanResource(T_HumanFile_dig THumanFile_dig) {
        iHumanResourceDao.updateHumanResource(THumanFile_dig);
    }




}
