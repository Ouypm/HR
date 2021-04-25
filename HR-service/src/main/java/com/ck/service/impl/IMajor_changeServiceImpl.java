package com.ck.service.impl;

import com.ck.dao.IMajor_changeDao;
import com.ck.entity.Major_change;
import com.ck.service.IMajor_changeService;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * HR
 * Description:
 * Major_change的service
 * @Author 林先森
 * @Date 2021/4/20 15:44
 */
@Service
public class IMajor_changeServiceImpl implements IMajor_changeService {
    /* 自动注入Major_change的dao */
    @Autowired
    private IMajor_changeDao iMajor_changeDao;

    /* 添加Major_change表的数据 */
    public void majorAdd(Major_change majorChange) {
        iMajor_changeDao.majorAdd(majorChange);
    }

    /* 查询Major_change表的所有未审核的数据 */
    public List<Major_change> Major_changequeryAll(){
        List<Major_change> major_changes
                = iMajor_changeDao.Major_changequeryAll();
        return major_changes;
    };

    /* 根据id查询Major_change表的所有数据 */
    public Major_change Major_changequeryById(int cid){
        Major_change major_change
                = iMajor_changeDao.Major_changequeryById(cid);
        return major_change;
    };

    /* 多条件查询 */
    public List<Major_change> Major_changeDquery(Map map){
        List<Major_change> major_changes
                = iMajor_changeDao.Major_changeDquery(map);
        return major_changes;
    };


    /* 根据id做修改 */
    public void MajorUpdate(Major_change majorChange){
        iMajor_changeDao.MajorUpdate(majorChange);
    };
}
