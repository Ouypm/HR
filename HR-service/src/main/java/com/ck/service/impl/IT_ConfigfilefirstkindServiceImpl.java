package com.ck.service.impl;

import com.ck.dao.IT_ConfigfilefirstkindDao;
import com.ck.entity.T_Config_file_first_kind;
import com.ck.service.IT_ConfigfilefirstkindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 20:23
 */
@Service
public class IT_ConfigfilefirstkindServiceImpl implements IT_ConfigfilefirstkindService {
    /* 自动注入一级机构表的dao */
    @Autowired
    private IT_ConfigfilefirstkindDao it_configfilefirstkindDao;

    /* 查询所有一级机构数据 */
    public List<T_Config_file_first_kind> firstqueryAll() {
        return it_configfilefirstkindDao.firstqueryAll();
    }

    /* 根据id查询一级机构的一级名称 */
    public T_Config_file_first_kind fistqueryById(int fid){
        return it_configfilefirstkindDao.fistqueryById(fid);
    };
}
