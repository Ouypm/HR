package com.ck.service.impl;

import com.ck.dao.IT_Config_file_second_kindDao;
import com.ck.entity.T_Config_file_second_kind;
import com.ck.service.IT_Config_file_second_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 20:20
 */
@Service
public class IT_Config_file_second_kindServiceImpl implements IT_Config_file_second_kindService {
    /* 自动注入二级机构表的dao */
    @Autowired
    private IT_Config_file_second_kindDao it_config_file_second_kindDao;

    /* 根据一级机构的编号查询二级机构的数据 */
    public List<T_Config_file_second_kind> FistIdQueryAll(int fid) {
        return it_config_file_second_kindDao.FistIdQueryAll(fid);
    }

    /* 根据二级机构的编号查询名字 */
    public T_Config_file_second_kind secondqeruyById(int sid){
        return it_config_file_second_kindDao.secondqeruyById(sid);
    };
}
