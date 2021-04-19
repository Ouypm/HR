package com.ck.dao;

import com.ck.entity.T_HumanFile_dig;
import com.ck.entity.T_Config_public_char;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Description:
 *
 * @Author SQB
 * @Date 2021/4/9 10:58
 */
public interface IHumanResourceDao {

    //查询所有人力资源数据
    @Select("select * from t_HumanFile_dig")
    @ResultMap("queHumanResourceMapper")
    public List<T_HumanFile_dig>  query_HumanFile_dig();

    //根据id查询人力资源数据
    @Select("select * from t_HumanFile_dig where hfd_id = #{id}")
    @ResultMap("queHumanResourceMapper")
    public T_HumanFile_dig queryById_HumanFile_dig(int hid);

    //复核修改人力资源
    @Update("update t_HumanFile_dig set ")
    public void updateHumanResource(T_HumanFile_dig THumanFile_dig);

}
