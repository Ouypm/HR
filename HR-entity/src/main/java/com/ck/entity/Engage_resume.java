package com.ck.entity;

/**
 * @Author: 欧阳鹏明
 * @Date: 2021年04月16日 16:35
 * @Description:
 */
public class Engage_resume {
    private int res_id	;//	主键，自动增长列
    private String human_name	;// 	姓名
    private String engage_type	;// 	招聘类型
    private String human_address	;//	地址
    private int human_postcode	;// 	邮编
    private int human_major_kind_id	;//	职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String human_major_kind_name	;//	职位分类名称
    private int human_major_id	;//	职位编号(外健：Config_major 表中的major_id)
    private String human_major_name	;//	职位名称
    private String human_telephone	;//	电话号码
    private String human_homephone	;//	家庭电话
    private String human_mobilephone	;//	 手机
    private String human_email	;//	 Email
    private String human_hobby	;//	兴趣爱好
    private String human_specility	;// 	特长
    private char human_sex	;// 	性别
    private String human_religion	;//	宗教信仰
    private String human_party	;//	政治面貌
    private String human_nationality	;//	国籍
    private String human_race	;//	民族
    private String human_birthday	;//	生日
    private int human_age	;//	年龄
    private String human_educated_degree	;//	教育程度
    private double human_educated_years	;//	教育年限
    private String human_educated_major	;//	 专业
    private String human_college	;//	毕业院校
    private String human_idcard	;//	身份证号
    private String human_birthplace	;//	出生地
    private String demand_salary_standard	;//	薪酬标准
    private String human_history_records	;//	个人履历
    private String remark	;//	备注
    private String recomandation	;//	推荐意见
    private String human_picture	;//	照片
    private String attachment_name	;//	档案附件
    private int check_status	;//	复核状态（????）
    private String register	;// 	 登记人
    private String regist_time	;//	登记时间
    private String checker	;// 	复核人姓名
    private String check_time	;//	复核时间
    private int interview_status	;//	面试状态（(1.可以面试。2.不可以面试)）
    private double total_points	;//	 总分
    private int test_amount	;//	考试次数
    private String test_checker	;//	测试复核人
    private String test_check_time	;//	测试复核时间
    private String pass_register	;//	通过登记人姓名
    private String pass_regist_time	;//	通过登记时间
    private String pass_checker	;//	通过复核人姓名
    private String pass_check_time	;//	通过复核时间
    private int pass_check_status	;//	通过的复核状态（？？？？）
    private String pass_checkComment	;//	录用申请审核意见
    private String pass_passComment	;//	录用申请审批意见
}
