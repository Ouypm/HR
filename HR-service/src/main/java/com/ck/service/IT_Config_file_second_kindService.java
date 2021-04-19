package com.ck.service;

import com.ck.entity.T_Config_file_second_kind;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 11:05
 */
public interface IT_Config_file_second_kindService {
    /* 根据一级机构的编号查询二级机构的数据 */
    public List<T_Config_file_second_kind> FistIdQueryAll(int fid);
}
