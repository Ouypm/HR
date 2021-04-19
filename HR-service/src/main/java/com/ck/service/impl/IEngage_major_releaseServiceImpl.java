package com.ck.service.impl;

import com.ck.dao.IEngage_major_releaseDao;
import com.ck.entity.Engage_major_release;
import com.ck.service.IEngage_major_releaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 欧阳鹏明
 * @Date: 2021年04月16日 14:39
 * @Description:
 */
@Service
public class IEngage_major_releaseServiceImpl implements IEngage_major_releaseService {
    @Autowired
    private IEngage_major_releaseDao dao;

    @Override
    public List<Engage_major_release> QueryAll() {
        return dao.QueryAll();
    }
}
