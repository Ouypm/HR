package com.ck.entity;

//培训登记表
public class Training {
    private int tra_id	;//	主键，自动增长列
    private int major_kind_id;//	职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String major_kind_name;		//职位分类名称
    private int major_id;	//职位编号(外健：Config_major 表中的major_id)
    private String major_name;	//职位名称
    private int human_id;	//人力资源档案编号(外健：Human_file表中human_id)
    private String human_name;	//姓名
    private String training_item;	//培训项目
    private String training_time;	//培训时间
    private int training_degree;	//培训成绩等级
    private int training_hour;	//	培训课时
    private String register	;	//登记人
    private String checker	;	//复核人
    private String regist_time;	//登记时间
    private String check_time;	//复核时间
    private int checkstatus	;	//培训复核状态
    private String remark;	//备注

    public Training() {
    }

    public Training(int tra_id, int major_kind_id, String major_kind_name, int major_id, String major_name, int human_id, String human_name, String training_item, String training_time, int training_degree, int training_hour, String register, String checker, String regist_time, String check_time, int checkstatus, String remark) {
        this.tra_id = tra_id;
        this.major_kind_id = major_kind_id;
        this.major_kind_name = major_kind_name;
        this.major_id = major_id;
        this.major_name = major_name;
        this.human_id = human_id;
        this.human_name = human_name;
        this.training_item = training_item;
        this.training_time = training_time;
        this.training_degree = training_degree;
        this.training_hour = training_hour;
        this.register = register;
        this.checker = checker;
        this.regist_time = regist_time;
        this.check_time = check_time;
        this.checkstatus = checkstatus;
        this.remark = remark;
    }

    public int getTra_id() {
        return tra_id;
    }

    public void setTra_id(int tra_id) {
        this.tra_id = tra_id;
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

    public String getTraining_item() {
        return training_item;
    }

    public void setTraining_item(String training_item) {
        this.training_item = training_item;
    }

    public String getTraining_time() {
        return training_time;
    }

    public void setTraining_time(String training_time) {
        this.training_time = training_time;
    }

    public int getTraining_degree() {
        return training_degree;
    }

    public void setTraining_degree(int training_degree) {
        this.training_degree = training_degree;
    }

    public int getTraining_hour() {
        return training_hour;
    }

    public void setTraining_hour(int training_hour) {
        this.training_hour = training_hour;
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

    public int getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(int checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
