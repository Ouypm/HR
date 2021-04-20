package com.ck.service.impl;

import com.ck.dao.IConfig_major_kindDao;
import com.ck.entity.Config_major_kind;
import com.ck.service.IConfig_major_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/19 14:35
 */
@Service
public class IConfig_major_kindServiceImpl implements IConfig_major_kindService {

    //注入dao
    @Autowired
    private IConfig_major_kindDao iConfig_major_kindDao;

    //查询职位分类所有表
    public List<Config_major_kind> queConfigMajorKindAll() {
        return iConfig_major_kindDao.queConfigMajorKindAll();
    }
}
