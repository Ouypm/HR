package com.ck.entity;

import java.util.List;

//20.职位发表登记表
public class Engage_major_release {
    private int mre_id	;//	主键，自动增长列
    private int first_kind_id	;//		一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）
    private String first_kind_name	;//	一级机构名称
    private int second_kind_id	;//		二级机构编号(外健：Config_file_second_kind表中的second_kind_id)
    private String second_kind_name	;//	二级机构名称
    private int third_kind_id	;//		三级机构编号(外健：Config_file_third_kind表中的third_kind_id)
    private String  third_kind_name;//	string	三级机构名称
    private int major_kind_id	;//		职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String major_kind_name;//	string	职位分类名称
    private int major_id	;//		职位编号(外健：Config_major 表中的major_id)
    private String  major_name;//	string	职位名称
    private int human_amount	;//		招聘人数
    private String  engage_type;//	string	招聘类型
    private String deadline;//	date	截至日期
    private String  register;//	string	登记人
    private String changer;//	string	变更人
    private String regist_time;//	date	登记时间
    private String change_time;//	date	变更时间
    private String major_describe;//	string	职位描述
    private String  engage_required;//	string	招聘要求
    private List<T_Config_file_first_kind> firstKindList;
    private List<T_Config_file_second_kind> secondKindList;
    private List<T_Config_file_third_kind> thirdKindList;
    


}
