package com.ck.entity;
//试卷登记表
public class Engage_exam {
    private int exa_id ;//	integer	主键，自动增长列
    private String exam_number;//	string	试卷编号 (外健：Engage_exam_details表中exam_number)
    private int  major_kind_id;//	integer	职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String major_kind_name;//	string	职位分类名称
    private int  major_id;//	integer	职位编号(外健：Config_major 表中的major_id)
    private String major_name;//	string	职位名称
    private String register;//	string	登记人
    private String regist_time;//	date	登记时间
    private String limite_time;//	string	答题限时

    public Engage_exam() {
    }

    public Engage_exam(int exa_id, String exam_number, int major_kind_id, String major_kind_name, int major_id, String major_name, String register, String regist_time, String limite_time) {
        this.exa_id = exa_id;
        this.exam_number = exam_number;
        this.major_kind_id = major_kind_id;
        this.major_kind_name = major_kind_name;
        this.major_id = major_id;
        this.major_name = major_name;
        this.register = register;
        this.regist_time = regist_time;
        this.limite_time = limite_time;
    }

    public int getExa_id() {
        return exa_id;
    }

    public void setExa_id(int exa_id) {
        this.exa_id = exa_id;
    }

    public String getExam_number() {
        return exam_number;
    }

    public void setExam_number(String exam_number) {
        this.exam_number = exam_number;
    }

    public int getMajor_kind_id() {
        return major_kind_id;
    }

    public void setMajor_kind_id(int major_kind_id) {
        this.major_kind_id = major_kind_id;
    }

    public String getMajor_kind_name() {
        return major_kind_name;
    }

    public void setMajor_kind_name(String major_kind_name) {
        this.major_kind_name = major_kind_name;
    }

    public int getMajor_id() {
        return major_id;
    }

    public void setMajor_id(int major_id) {
        this.major_id = major_id;
    }

    public String getMajor_name() {
        return major_name;
    }

    public void setMajor_name(String major_name) {
        this.major_name = major_name;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getRegist_time() {
        return regist_time;
    }

    public void setRegist_time(String regist_time) {
        this.regist_time = regist_time;
    }

    public String getLimite_time() {
        return limite_time;
    }

    public void setLimite_time(String limite_time) {
        this.limite_time = limite_time;
    }
}
