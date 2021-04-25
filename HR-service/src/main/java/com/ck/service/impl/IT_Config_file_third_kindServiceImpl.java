package com.ck.service.impl;

import com.ck.dao.IT_Config_file_third_kindDao;
import com.ck.entity.T_Config_file_third_kind;
import com.ck.service.IT_Config_file_third_kindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 20:24
 */
@Service
public class IT_Config_file_third_kindServiceImpl implements IT_Config_file_third_kindService {
    /* 自动注入三级机构表的dao */
    @Autowired
    private IT_Config_file_third_kindDao it_config_file_third_kindDao;

    /* 根据二级机构编号查询三级机构的数据 */
    public List<T_Config_file_third_kind> SecondIdQueryAll(int sid) {
        return it_config_file_third_kindDao.SecondIdQueryAll(sid);
    }

    /* 三级机构根据id查询名字 */
    public T_Config_file_third_kind thirdqueryById(int tid){
        return it_config_file_third_kindDao.thirdqueryById(tid);
    };
}
