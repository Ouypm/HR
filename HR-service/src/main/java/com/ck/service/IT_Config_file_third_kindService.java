package com.ck.service;

import com.ck.entity.T_Config_file_third_kind;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * HR-
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/14 15:30
 */
public interface IT_Config_file_third_kindService {
    /* 根据二级机构编号查询三级机构的数据 */
    public List<T_Config_file_third_kind> SecondIdQueryAll(int sid);

    /* 三级机构根据id查询名字 */
    public T_Config_file_third_kind thirdqueryById(int tid);
}
