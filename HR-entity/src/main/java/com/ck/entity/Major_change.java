package com.ck.entity;


//wl17.职位调动表
public class Major_change {

   private int  mch_id;//	主键，自动增长列
    private int  first_kind_id;//		一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）
    private String first_kind_name;//		一级机构名称
    private int  second_kind_id	;//	二级机构编号(外健：Config_file_second_kind表中的second_kind_id)
    private String second_kind_name	;//	二级机构名称
    private int  third_kind_id;//		三级机构编号(外健：Config_file_third_kind表中的third_kind_id)
    private String third_kind_name	;//	三级机构名称
    private int  major_kind_id;//		职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String major_kind_name	;//	职位分类名称
    private int  major_id	;//		职位编号(外健：Config_major 表中的major_id)
    private String major_name	;//	职位名称
    private int  new_first_kind_id	;//		新一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）
    private String new_first_kind_name	;//	新一级机构名称
    private int   new_second_kind_id	;//		新二级机构编号(外健：Config_file_second_kind表中的second_kind_id)
    private String new_second_kind_name	;//	新二级机构名称
    private int  new_third_kind_id	;//	新三级机构编号(外健：Config_file_third_kind表中的third_kind_id)
    private String new_third_kind_name;// 	新三级机构名称
    private int  new_major_kind_id;//		新职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String new_major_kind_name;//	新职位分类名称
    private int  new_major_id;//	integer	新职位编号(外健：Config_major 表中的major_id)
    private String new_major_name;//	新职位名称
    private int  human_id;//	integer	人力资源档案编号(外健：Human_file表中human_id)
    private String human_name;//	姓名
    private int  salary_standard_id	;//	薪酬标准编号(外健：salary_standard_details表中standard_id)
    private String salary_standard_name	;//	薪酬标准名称
    private int salary_sum	;//	薪酬总额
    private int  new_salary_standard_id	;//	新薪酬标准编号(外健：salary_standard_details表中standard_id)
    private String new_salary_standard_name	;//	新薪酬标准名称
    private double new_salary_sum	;//	新薪酬总额
    private String change_reason;//	string	调动原因
    private String check_reason;//	审核通过意见
    private int  check_status	;//	复核通过状态
    private String register;//		登记人
    private String checker;//		复核人
    private String regist_time;//	date	登记时间
    private String check_time;//	date	复核时间

 public Major_change() {
 }

 public int getMch_id() {
  return mch_id;
 }

 public void setMch_id(int mch_id) {
  this.mch_id = mch_id;
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

 public int getNew_first_kind_id() {
  return new_first_kind_id;
 }

 public void setNew_first_kind_id(int new_first_kind_id) {
  this.new_first_kind_id = new_first_kind_id;
 }

 public String getNew_first_kind_name() {
  return new_first_kind_name;
 }

 public void setNew_first_kind_name(String new_first_kind_name) {
  this.new_first_kind_name = new_first_kind_name;
 }

 public int getNew_second_kind_id() {
  return new_second_kind_id;
 }

 public void setNew_second_kind_id(int new_second_kind_id) {
  this.new_second_kind_id = new_second_kind_id;
 }

 public String getNew_second_kind_name() {
  return new_second_kind_name;
 }

 public void setNew_second_kind_name(String new_second_kind_name) {
  this.new_second_kind_name = new_second_kind_name;
 }

 public int getNew_third_kind_id() {
  return new_third_kind_id;
 }

 public void setNew_third_kind_id(int new_third_kind_id) {
  this.new_third_kind_id = new_third_kind_id;
 }

 public String getNew_third_kind_name() {
  return new_third_kind_name;
 }

 public void setNew_third_kind_name(String new_third_kind_name) {
  this.new_third_kind_name = new_third_kind_name;
 }

 public int getNew_major_kind_id() {
  return new_major_kind_id;
 }

 public void setNew_major_kind_id(int new_major_kind_id) {
  this.new_major_kind_id = new_major_kind_id;
 }

 public String getNew_major_kind_name() {
  return new_major_kind_name;
 }

 public void setNew_major_kind_name(String new_major_kind_name) {
  this.new_major_kind_name = new_major_kind_name;
 }

 public int getNew_major_id() {
  return new_major_id;
 }

 public void setNew_major_id(int new_major_id) {
  this.new_major_id = new_major_id;
 }

 public String getNew_major_name() {
  return new_major_name;
 }

 public void setNew_major_name(String new_major_name) {
  this.new_major_name = new_major_name;
 }

 public int getHuman_id() {
  return human_id;
 }

 public void setHuman_id(int human_id) {
  this.human_id = human_id;
 }

 public String getHuman_name() {
  return human_name;
 }

 public void setHuman_name(String human_name) {
  this.human_name = human_name;
 }

 public int getSalary_standard_id() {
  return salary_standard_id;
 }

 public void setSalary_standard_id(int salary_standard_id) {
  this.salary_standard_id = salary_standard_id;
 }

 public String getSalary_standard_name() {
  return salary_standard_name;
 }

 public void setSalary_standard_name(String salary_standard_name) {
  this.salary_standard_name = salary_standard_name;
 }

 public int getSalary_sum() {
  return salary_sum;
 }

 public void setSalary_sum(int salary_sum) {
  this.salary_sum = salary_sum;
 }

 public int getNew_salary_standard_id() {
  return new_salary_standard_id;
 }

 public void setNew_salary_standard_id(int new_salary_standard_id) {
  this.new_salary_standard_id = new_salary_standard_id;
 }

 public String getNew_salary_standard_name() {
  return new_salary_standard_name;
 }

 public void setNew_salary_standard_name(String new_salary_standard_name) {
  this.new_salary_standard_name = new_salary_standard_name;
 }

 public double getNew_salary_sum() {
  return new_salary_sum;
 }

 public void setNew_salary_sum(double new_salary_sum) {
  this.new_salary_sum = new_salary_sum;
 }

 public String getChange_reason() {
  return change_reason;
 }

 public void setChange_reason(String change_reason) {
  this.change_reason = change_reason;
 }

 public String getCheck_reason() {
  return check_reason;
 }

 public void setCheck_reason(String check_reason) {
  this.check_reason = check_reason;
 }

 public int getCheck_status() {
  return check_status;
 }

 public void setCheck_status(int check_status) {
  this.check_status = check_status;
 }

 public String getRegister() {
  return register;
 }

 public void setRegister(String register) {
  this.register = register;
 }

 public String getChecker() {
  return checker;
 }

 public void setChecker(String checker) {
  this.checker = checker;
 }

 public String getRegist_time() {
  return regist_time;
 }

 public void setRegist_time(String regist_time) {
  this.regist_time = regist_time;
 }

 public String getCheck_time() {
  return check_time;
 }

 public void setCheck_time(String check_time) {
  this.check_time = check_time;
 }

 public Major_change(int mch_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, int major_kind_id, String major_kind_name, int major_id, String major_name, int new_first_kind_id, String new_first_kind_name, int new_second_kind_id, String new_second_kind_name, int new_third_kind_id, String new_third_kind_name, int new_major_kind_id, String new_major_kind_name, int new_major_id, String new_major_name, int human_id, String human_name, int salary_standard_id, String salary_standard_name, int salary_sum, int new_salary_standard_id, String new_salary_standard_name, double new_salary_sum, String change_reason, String check_reason, int check_status, String register, String checker, String regist_time, String check_time) {
  this.mch_id = mch_id;
  this.first_kind_id = first_kind_id;
  this.first_kind_name = first_kind_name;
  this.second_kind_id = second_kind_id;
  this.second_kind_name = second_kind_name;
  this.third_kind_id = third_kind_id;
  this.third_kind_name = third_kind_name;
  this.major_kind_id = major_kind_id;
  this.major_kind_name = major_kind_name;
  this.major_id = major_id;
  this.major_name = major_name;
  this.new_first_kind_id = new_first_kind_id;
  this.new_first_kind_name = new_first_kind_name;
  this.new_second_kind_id = new_second_kind_id;
  this.new_second_kind_name = new_second_kind_name;
  this.new_third_kind_id = new_third_kind_id;
  this.new_third_kind_name = new_third_kind_name;
  this.new_major_kind_id = new_major_kind_id;
  this.new_major_kind_name = new_major_kind_name;
  this.new_major_id = new_major_id;
  this.new_major_name = new_major_name;
  this.human_id = human_id;
  this.human_name = human_name;
  this.salary_standard_id = salary_standard_id;
  this.salary_standard_name = salary_standard_name;
  this.salary_sum = salary_sum;
  this.new_salary_standard_id = new_salary_standard_id;
  this.new_salary_standard_name = new_salary_standard_name;
  this.new_salary_sum = new_salary_sum;
  this.change_reason = change_reason;
  this.check_reason = check_reason;
  this.check_status = check_status;
  this.register = register;
  this.checker = checker;
  this.regist_time = regist_time;
  this.check_time = check_time;
 }
}
