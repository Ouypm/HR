package com.ck.dao;

import com.ck.entity.T_HumanFile_dig;
import com.ck.entity.T_Config_public_char;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

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

    //复核修改人力资源
    @Update("update t_HumanFile_dig set human_pro_designation = " +
            "#{human_pro_designation},human_name=#{human_name}," +
            "human_sex=#{human_sex},human_postcode=#{human_postcode}," +
            "human_telephone=#{human_telephone},human_qq=#{human_qq}," +
            "human_mobilephone=#{human_mobilephone},human_nationality=#{human_nationality}," +
            "human_address=#{human_address},human_email=#{human_email}," +
            "human_birthplace=#{human_birthplace},human_race=#{human_race}," +
            "human_religion=#{human_religion},human_society_security_id=#{human_society_security_id}," +
            "human_party=#{human_party},human_id_card=#{human_id_card}," +
            "human_age=#{human_age},human_educated_degree=#{human_educated_degree}," +
            "human_educated_years=#{human_educated_years},human_educated_major=#{human_educated_major}," +
            "salary_standard_name=#{salary_standard_name},human_name=#{human_name}," +
            "human_bank=#{human_bank},human_account=#{human_account}," +
            "human_speciality=#{human_speciality},human_hobby=#{human_hobby}," +
            "human_family_membership=#{human_family_membership},human_histroy_records=#{human_histroy_records}," +
            "human_picture=#{human_picture},attachment_name=#{attachment_name}," +
            "remark=#{remark},check_time=#{check_time}" +
            " where hfd_id = #{hfd_id} ")
    public void updateHumanResource(T_HumanFile_dig THumanFile_dig);

    /* 多重查询   调动 */
    public List<T_HumanFile_dig> queHumanResourceMapperDuoch(Map map);

}
