package com.ck.service.impl;

import com.ck.dao.IConfig_majorDao;
import com.ck.entity.Config_major;
import com.ck.service.IConfig_majorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/19 14:41
 */
@Service
public class IConfig_majorServiceImpl implements IConfig_majorService {

    //注入dao
    @Autowired
    private IConfig_majorDao iConfig_majorDao;

    //根据职位分类编号查询
    public List<Config_major> queConfigMajorAll(int cid) {
        return iConfig_majorDao.queConfigMajorAll(cid);
    }
}
