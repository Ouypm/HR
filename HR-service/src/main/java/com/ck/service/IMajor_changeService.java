package com.ck.service;

import com.ck.entity.Major_change;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * HR
 * Description:
 *
 * @Author 林先森
 * @Date 2021/4/20 15:43
 */
public interface IMajor_changeService {
    /* 添加Major_change表的数据 */
    public void majorAdd(Major_change majorChange);

    /* 查询Major_change表的所有未审核的数据 */
    public List<Major_change> Major_changequeryAll();

    /* 根据id查询Major_change表的所有数据 */
    public Major_change Major_changequeryById(int cid);

    /* 多条件查询 */
    public List<Major_change> Major_changeDquery(Map map);

    /* 根据id做修改 */
    public void MajorUpdate(Major_change majorChange);
}
