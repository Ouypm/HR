package com.ck.entity;

/**
 * @Author: 欧阳鹏明
 * @Date: 2021年04月16日 16:29
 * @Description:
 */
public class Engage_interview {
    private int ein_id  ; //主键，自动增长列
    private String human_name	;//	姓名
    private int interview_amount	;//	面试次数
    private int human_major_kind_id	;//	职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String human_major_kind_name	;//	职位分类名称
    private int human_major_id	;//	职位编号(外健：Config_major 表中的major_id)
    private String human_major_name	;//	职位名称
    private int image_degree	;//	形象等级
    private int native_language_degree	;//	口才等级
    private int foreign_language_degree	;//	外语水平等级
    private int response_speed_degree	;//	应变能力 (???????)
    private int EQ_degree	;//	EQ等级
    private int IQ_degree	;//	IQ_等级
    private String multi_quality_degree	;//	综合素质
    private String register	;//	 面试人
    private String checker	;//	筛选人
    private String registe_time	;//	面试时间
    private String check_time	;//	筛选时间
    private int resume_id	;//	简历编号(外健：engage_resume表中res_id)
    private String result	;//	面试结果
    private String interview_comment	;//	面试评价
    private String check_comment	;//	筛选评价
    private int interview_status	;//	面试状态（）
    private int check_status	;//	筛选状态 (1.建议面试，2.建议笔试，3.建议录用，4删除简历。)
}
