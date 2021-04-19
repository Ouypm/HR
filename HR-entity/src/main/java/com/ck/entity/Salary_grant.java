package com.ck.entity;
//wl薪酬发放登记表
public class Salary_grant {
    private int sgr_id	;//	主键，自动增长列
    private int salary_grant_id	;//	薪酬发放编号
    private int salary_standard_id	;//	薪酬标准编号(外健：salary_standard_details表中standard_id)
    private int first_kind_id	;//	一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）
    private String first_kind_name;//	string	一级机构名称
    private int second_kind_id;//	二级机构编号(外健：Config_file_second_kind表中的second_kind_id)
    private String second_kind_name;//	二级机构名称
    private int third_kind_id;//	三级机构编号(外健：Config_file_third_kind表中的third_kind_id)
    private String third_kind_name;//	三级机构名称
    private int human_amount;//	总人数
    private double salary_standard_sum	;//	标准薪酬总金额
    private double salary_paid_sum	;//	实发总金额
    private String register	;//	登记人
    private String regist_time;//	date 	登记时间
    private String checker	;//string	复核人
    private String check_time;//	date	复核时间
    private int check_status;//	integer	复核状态(?????)

    public Salary_grant() {
    }

    public Salary_grant(int sgr_id, int salary_grant_id, int salary_standard_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, int human_amount, double salary_standard_sum, double salary_paid_sum, String register, String regist_time, String checker, String check_time, int check_status) {
        this.sgr_id = sgr_id;
        this.salary_grant_id = salary_grant_id;
        this.salary_standard_id = salary_standard_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.third_kind_id = third_kind_id;
        this.third_kind_name = third_kind_name;
        this.human_amount = human_amount;
        this.salary_standard_sum = salary_standard_sum;
        this.salary_paid_sum = salary_paid_sum;
        this.register = register;
        this.regist_time = regist_time;
        this.checker = checker;
        this.check_time = check_time;
        this.check_status = check_status;
    }

    public int getSgr_id() {
        return sgr_id;
    }

    public void setSgr_id(int sgr_id) {
        this.sgr_id = sgr_id;
    }

    public int getSalary_grant_id() {
        return salary_grant_id;
    }

    public void setSalary_grant_id(int salary_grant_id) {
        this.salary_grant_id = salary_grant_id;
    }

    public int getSalary_standard_id() {
        return salary_standard_id;
    }

    public void setSalary_standard_id(int salary_standard_id) {
        this.salary_standard_id = salary_standard_id;
    }

    public int getFirst_kind_id() {
        return first_kind_id;
    }

    public void setFirst_kind_id(int first_kind_id) {
        this.first_kind_id = first_kind_id;
    }

    public String getFirst_kind_name() {
        return first_kind_name;
    }

    public void setFirst_kind_name(String first_kind_name) {
        this.first_kind_name = first_kind_name;
    }

    public int getSecond_kind_id() {
        return second_kind_id;
    }

    public void setSecond_kind_id(int second_kind_id) {
        this.second_kind_id = second_kind_id;
    }

    public String getSecond_kind_name() {
        return second_kind_name;
    }

    public void setSecond_kind_name(String second_kind_name) {
        this.second_kind_name = second_kind_name;
    }

    public int getThird_kind_id() {
        return third_kind_id;
    }

    public void setThird_kind_id(int third_kind_id) {
        this.third_kind_id = third_kind_id;
    }

    public String getThird_kind_name() {
        return third_kind_name;
    }

    public void setThird_kind_name(String third_kind_name) {
        this.third_kind_name = third_kind_name;
    }

    public int getHuman_amount() {
        return human_amount;
    }

    public void setHuman_amount(int human_amount) {
        this.human_amount = human_amount;
    }

    public double getSalary_standard_sum() {
        return salary_standard_sum;
    }

    public void setSalary_standard_sum(double salary_standard_sum) {
        this.salary_standard_sum = salary_standard_sum;
    }

    public double getSalary_paid_sum() {
        return salary_paid_sum;
    }

    public void setSalary_paid_sum(double salary_paid_sum) {
        this.salary_paid_sum = salary_paid_sum;
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

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getCheck_time() {
        return check_time;
    }

    public void setCheck_time(String check_time) {
        this.check_time = check_time;
    }

    public int getCheck_status() {
        return check_status;
    }

    public void setCheck_status(int check_status) {
        this.check_status = check_status;
    }
}
