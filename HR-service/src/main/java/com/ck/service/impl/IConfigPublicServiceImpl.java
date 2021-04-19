package com.ck.service.impl;

import com.ck.dao.IConfigPublicDao;
import com.ck.entity.T_Config_public_char;
import com.ck.service.IConfigPublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/14 19:19
 */
@Service
public class IConfigPublicServiceImpl implements IConfigPublicService {

   //注入公共配置dao
    @Autowired
    private IConfigPublicDao iConfigPublicDao;

    //查询所有公共字段
    public List<T_Config_public_char> query_Config_Public() {
        return iConfigPublicDao.query_Config_Public();
    }
}
