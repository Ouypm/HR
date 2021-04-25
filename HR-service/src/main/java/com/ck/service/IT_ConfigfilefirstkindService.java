package com.ck.service;

import com.ck.entity.T_Config_file_first_kind;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 9:32
 */
public interface IT_ConfigfilefirstkindService {
    /* 查询所有一级机构数据 */
    public List<T_Config_file_first_kind> firstqueryAll();

    /* 根据id查询一级机构的一级名称 */
    public T_Config_file_first_kind fistqueryById(int fid);
}
