package com.ck.entity;

/**
 * Description:
 * 记录人力资源档案所做的任何更改
 * @Author
 * @Date 2021/4/7 11:40
 */
public class T_HumanFile_dig {

    private int hfd_id;	                    //主键，自动增长列
    private int human_id;	                //档案编号
    private int first_kind_id;	            //一级机构编号（外健：Config_file_first_kind 表中的：first_kind_id）
    private String  first_kind_name;		            //一级机构名称
    private int second_kind_id;		            //二级机构编号(外健：Config_file_second_kind表中的second_kind_id)
    private String   second_kind_name;		            //二级机构名称
    private int third_kind_id;		            //三级机构编号(外健：Config_file_third_kind表中的third_kind_id)
    private String  third_kind_name;		            //三级机构名称
    private String human_name;		             //姓名
    private String  human_address;		            //地址
    private int human_postcode;	                 //	邮政编码
    private String  human_pro_designation;	     	            //  职称
    private int human_major_kind_id;		            //职位分类编号(外健：Config_major_kind表中的major_kind_id)
    private String  human_major_kind_name;		            //职位分类名称
    private int human_major_id;		            //职位编号(外健：Config_major 表中的major_id)
    private String human_major_name;		            //职位名称
    private String human_telephone;	 	            //电话
    private String  human_mobilephone;		            //手机号码
    private String  human_bank;	               //开户银行
    private String  human_account;		            //银行帐号
    private int human_qq;		                 //QQ号码
    private String  human_email;		            //电子邮件
    private String  human_hobby;		            //爱好
    private String  human_speciality;		            //特长
    private char human_sex;		                 //性别
    private String  human_religion;		            //宗教信仰
    private String  human_party;		            //政治面貌
    private String  human_nationality;		            //国籍
    private String  human_race;		              //民族
    private String  human_birthday;		            //出生日期
    private String   human_birthplace;		            //出生地
    private int human_age;		                   //年龄
    private String   human_educated_degree;		            //学历
    private double human_educated_years;		            //教育年限
    private String  human_educated_major;		            //学历专业
    private int human_society_security_id;		            //社会保障号
    private String  human_id_card;		            //身份证号
    private String  remark;		                    //备注
    private int  salary_standard_id;		            //薪酬标准编号(外健：salary_standard_details表中standard_id)
    private String   salary_standard_name;		            //薪酬标准名称
    private double salary_sum;		              //基本薪酬总额
    private double demand_salaray_sum;		            //应发薪酬总额
    private double paid_salary_sum;		            //实发薪酬总额
    private int major_change_amount;		            //调动次数
    private int  bonus_amount;		               //激励累计次数
    private int  training_amount;		            //培训累计次数
    private String  human_histroy_records;    	   //  简历
    private String  human_family_membership;		            //家庭关系
    private String  human_picture;		            //相片
    private String  attachment_name;	            //附件名称
    private int check_status;		            //复核状态(1：通过复核 2：未通过复核)
    private String  register;		            //档案登记人
    private String checker;		                //档案复核人
    private String  changer;		            //档案变更人
    private String  regist_time;		            //档案登记时间
    private String  check_time;		             //档案复核时间
    private String  change_time;		            //档案变更时间
    private String  lastly_change_time;		            //档案最近更改时间
    private String  delete_time;		            //档案删除时间
    private String recovery_time;		            //档案恢复时间
    private int  human_file_status;    	            //	档案状态 (1：待复核 2：正常 3：已删除)

    public int getHfd_id() {
        return hfd_id;
    }

    public void setHfd_id(int hfd_id) {
        this.hfd_id = hfd_id;
    }

    public int getHuman_id() {
        return human_id;
    }

    public void setHuman_id(int human_id) {
        this.human_id = human_id;
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

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public String getHuman_address() {
        return human_address;
    }

    public void setHuman_address(String human_address) {
        this.human_address = human_address;
    }

    public int getHuman_postcode() {
        return human_postcode;
    }

    public void setHuman_postcode(int human_postcode) {
        this.human_postcode = human_postcode;
    }

    public String getHuman_pro_designation() {
        return human_pro_designation;
    }

    public void setHuman_pro_designation(String human_pro_designation) {
        this.human_pro_designation = human_pro_designation;
    }

    public int getHuman_major_kind_id() {
        return human_major_kind_id;
    }

    public void setHuman_major_kind_id(int human_major_kind_id) {
        this.human_major_kind_id = human_major_kind_id;
    }

    public String getHuman_major_kind_name() {
        return human_major_kind_name;
    }

    public void setHuman_major_kind_name(String human_major_kind_name) {
        this.human_major_kind_name = human_major_kind_name;
    }

    public int getHuman_major_id() {
        return human_major_id;
    }

    public void setHuman_major_id(int human_major_id) {
        this.human_major_id = human_major_id;
    }

    public String getHuman_major_name() {
        return human_major_name;
    }

    public void setHuman_major_name(String human_major_name) {
        this.human_major_name = human_major_name;
    }

    public String getHuman_telephone() {
        return human_telephone;
    }

    public void setHuman_telephone(String human_telephone) {
        this.human_telephone = human_telephone;
    }

    public String getHuman_mobilephone() {
        return human_mobilephone;
    }

    public void setHuman_mobilephone(String human_mobilephone) {
        this.human_mobilephone = human_mobilephone;
    }

    public String getHuman_bank() {
        return human_bank;
    }

    public void setHuman_bank(String human_bank) {
        this.human_bank = human_bank;
    }

    public String getHuman_account() {
        return human_account;
    }

    public void setHuman_account(String human_account) {
        this.human_account = human_account;
    }

    public int getHuman_qq() {
        return human_qq;
    }

    public void setHuman_qq(int human_qq) {
        this.human_qq = human_qq;
    }

    public String getHuman_email() {
        return human_email;
    }

    public void setHuman_email(String human_email) {
        this.human_email = human_email;
    }

    public String getHuman_hobby() {
        return human_hobby;
    }

    public void setHuman_hobby(String human_hobby) {
        this.human_hobby = human_hobby;
    }

    public String getHuman_speciality() {
        return human_speciality;
    }

    public void setHuman_speciality(String human_speciality) {
        this.human_speciality = human_speciality;
    }

    public char getHuman_sex() {
        return human_sex;
    }

    public void setHuman_sex(char human_sex) {
        this.human_sex = human_sex;
    }

    public String getHuman_religion() {
        return human_religion;
    }

    public void setHuman_religion(String human_religion) {
        this.human_religion = human_religion;
    }

    public String getHuman_party() {
        return human_party;
    }

    public void setHuman_party(String human_party) {
        this.human_party = human_party;
    }

    public String getHuman_nationality() {
        return human_nationality;
    }

    public void setHuman_nationality(String human_nationality) {
        this.human_nationality = human_nationality;
    }

    public String getHuman_race() {
        return human_race;
    }

    public void setHuman_race(String human_race) {
        this.human_race = human_race;
    }

    public String getHuman_birthday() {
        return human_birthday;
    }

    public void setHuman_birthday(String human_birthday) {
        this.human_birthday = human_birthday;
    }

    public String getHuman_birthplace() {
        return human_birthplace;
    }

    public void setHuman_birthplace(String human_birthplace) {
        this.human_birthplace = human_birthplace;
    }

    public int getHuman_age() {
        return human_age;
    }

    public void setHuman_age(int human_age) {
        this.human_age = human_age;
    }

    public String getHuman_educated_degree() {
        return human_educated_degree;
    }

    public void setHuman_educated_degree(String human_educated_degree) {
        this.human_educated_degree = human_educated_degree;
    }

    public double getHuman_educated_years() {
        return human_educated_years;
    }

    public void setHuman_educated_years(double human_educated_years) {
        this.human_educated_years = human_educated_years;
    }

    public String getHuman_educated_major() {
        return human_educated_major;
    }

    public void setHuman_educated_major(String human_educated_major) {
        this.human_educated_major = human_educated_major;
    }

    public int getHuman_society_security_id() {
        return human_society_security_id;
    }

    public void setHuman_society_security_id(int human_society_security_id) {
        this.human_society_security_id = human_society_security_id;
    }

    public String getHuman_id_card() {
        return human_id_card;
    }

    public void setHuman_id_card(String human_id_card) {
        this.human_id_card = human_id_card;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public double getSalary_sum() {
        return salary_sum;
    }

    public void setSalary_sum(double salary_sum) {
        this.salary_sum = salary_sum;
    }

    public double getDemand_salaray_sum() {
        return demand_salaray_sum;
    }

    public void setDemand_salaray_sum(double demand_salaray_sum) {
        this.demand_salaray_sum = demand_salaray_sum;
    }

    public double getPaid_salary_sum() {
        return paid_salary_sum;
    }

    public void setPaid_salary_sum(double paid_salary_sum) {
        this.paid_salary_sum = paid_salary_sum;
    }

    public int getMajor_change_amount() {
        return major_change_amount;
    }

    public void setMajor_change_amount(int major_change_amount) {
        this.major_change_amount = major_change_amount;
    }

    public int getBonus_amount() {
        return bonus_amount;
    }

    public void setBonus_amount(int bonus_amount) {
        this.bonus_amount = bonus_amount;
    }

    public int getTraining_amount() {
        return training_amount;
    }

    public void setTraining_amount(int training_amount) {
        this.training_amount = training_amount;
    }

    public String getHuman_histroy_records() {
        return human_histroy_records;
    }

    public void setHuman_histroy_records(String human_histroy_records) {
        this.human_histroy_records = human_histroy_records;
    }

    public String getHuman_family_membership() {
        return human_family_membership;
    }

    public void setHuman_family_membership(String human_family_membership) {
        this.human_family_membership = human_family_membership;
    }

    public String getHuman_picture() {
        return human_picture;
    }

    public void setHuman_picture(String human_picture) {
        this.human_picture = human_picture;
    }

    public String getAttachment_name() {
        return attachment_name;
    }

    public void setAttachment_name(String attachment_name) {
        this.attachment_name = attachment_name;
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

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
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

    public String getChange_time() {
        return change_time;
    }

    public void setChange_time(String change_time) {
        this.change_time = change_time;
    }

    public String getLastly_change_time() {
        return lastly_change_time;
    }

    public void setLastly_change_time(String lastly_change_time) {
        this.lastly_change_time = lastly_change_time;
    }

    public String getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(String delete_time) {
        this.delete_time = delete_time;
    }

    public String getRecovery_time() {
        return recovery_time;
    }

    public void setRecovery_time(String recovery_time) {
        this.recovery_time = recovery_time;
    }

    public int getHuman_file_status() {
        return human_file_status;
    }

    public void setHuman_file_status(int human_file_status) {
        this.human_file_status = human_file_status;
    }

    public T_HumanFile_dig() {
    }

    public T_HumanFile_dig(int hfd_id, int human_id, int first_kind_id, String first_kind_name, int second_kind_id, String second_kind_name, int third_kind_id, String third_kind_name, String human_name, String human_address, int human_postcode, String human_pro_designation, int human_major_kind_id, String human_major_kind_name, int human_major_id, String human_major_name, String human_telephone, String human_mobilephone, String human_bank, String human_account, int human_qq, String human_email, String human_hobby, String human_speciality, char human_sex, String human_religion, String human_party, String human_nationality, String human_race, String human_birthday, String human_birthplace, int human_age, String human_educated_degree, double human_educated_years, String human_educated_major, int human_society_security_id, String human_id_card, String remark, int salary_standard_id, String salary_standard_name, double salary_sum, double demand_salaray_sum, double paid_salary_sum, int major_change_amount, int bonus_amount, int training_amount, String human_histroy_records, String human_family_membership, String human_picture, String attachment_name, int check_status, String register, String checker, String changer, String regist_time, String check_time, String change_time, String lastly_change_time, String delete_time, String recovery_time, int human_file_status) {
        this.hfd_id = hfd_id;
        this.human_id = human_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.third_kind_id = third_kind_id;
        this.third_kind_name = third_kind_name;
        this.human_name = human_name;
        this.human_address = human_address;
        this.human_postcode = human_postcode;
        this.human_pro_designation = human_pro_designation;
        this.human_major_kind_id = human_major_kind_id;
        this.human_major_kind_name = human_major_kind_name;
        this.human_major_id = human_major_id;
        this.human_major_name = human_major_name;
        this.human_telephone = human_telephone;
        this.human_mobilephone = human_mobilephone;
        this.human_bank = human_bank;
        this.human_account = human_account;
        this.human_qq = human_qq;
        this.human_email = human_email;
        this.human_hobby = human_hobby;
        this.human_speciality = human_speciality;
        this.human_sex = human_sex;
        this.human_religion = human_religion;
        this.human_party = human_party;
        this.human_nationality = human_nationality;
        this.human_race = human_race;
        this.human_birthday = human_birthday;
        this.human_birthplace = human_birthplace;
        this.human_age = human_age;
        this.human_educated_degree = human_educated_degree;
        this.human_educated_years = human_educated_years;
        this.human_educated_major = human_educated_major;
        this.human_society_security_id = human_society_security_id;
        this.human_id_card = human_id_card;
        this.remark = remark;
        this.salary_standard_id = salary_standard_id;
        this.salary_standard_name = salary_standard_name;
        this.salary_sum = salary_sum;
        this.demand_salaray_sum = demand_salaray_sum;
        this.paid_salary_sum = paid_salary_sum;
        this.major_change_amount = major_change_amount;
        this.bonus_amount = bonus_amount;
        this.training_amount = training_amount;
        this.human_histroy_records = human_histroy_records;
        this.human_family_membership = human_family_membership;
        this.human_picture = human_picture;
        this.attachment_name = attachment_name;
        this.check_status = check_status;
        this.register = register;
        this.checker = checker;
        this.changer = changer;
        this.regist_time = regist_time;
        this.check_time = check_time;
        this.change_time = change_time;
        this.lastly_change_time = lastly_change_time;
        this.delete_time = delete_time;
        this.recovery_time = recovery_time;
        this.human_file_status = human_file_status;
    }

    @Override
    public String toString() {
        return "HumanFile_dig{" +
                "hfd_id=" + hfd_id +
                ", human_id=" + human_id +
                ", first_kind_id=" + first_kind_id +
                ", first_kind_name='" + first_kind_name + '\'' +
                ", second_kind_id=" + second_kind_id +
                ", second_kind_name='" + second_kind_name + '\'' +
                ", third_kind_id=" + third_kind_id +
                ", third_kind_name='" + third_kind_name + '\'' +
                ", human_name='" + human_name + '\'' +
                ", human_address='" + human_address + '\'' +
                ", human_postcode=" + human_postcode +
                ", human_pro_designation='" + human_pro_designation + '\'' +
                ", human_major_kind_id=" + human_major_kind_id +
                ", human_major_kind_name='" + human_major_kind_name + '\'' +
                ", human_major_id=" + human_major_id +
                ", human_major_name='" + human_major_name + '\'' +
                ", human_telephone='" + human_telephone + '\'' +
                ", human_mobilephone='" + human_mobilephone + '\'' +
                ", human_bank='" + human_bank + '\'' +
                ", human_account='" + human_account + '\'' +
                ", human_qq=" + human_qq +
                ", human_email='" + human_email + '\'' +
                ", human_hobby='" + human_hobby + '\'' +
                ", human_speciality='" + human_speciality + '\'' +
                ", human_sex=" + human_sex +
                ", human_religion='" + human_religion + '\'' +
                ", human_party='" + human_party + '\'' +
                ", human_nationality='" + human_nationality + '\'' +
                ", human_race='" + human_race + '\'' +
                ", human_birthday='" + human_birthday + '\'' +
                ", human_birthplace='" + human_birthplace + '\'' +
                ", human_age=" + human_age +
                ", human_educated_degree='" + human_educated_degree + '\'' +
                ", human_educated_years=" + human_educated_years +
                ", human_educated_major='" + human_educated_major + '\'' +
                ", human_society_security_id=" + human_society_security_id +
                ", human_id_card='" + human_id_card + '\'' +
                ", remark='" + remark + '\'' +
                ", salary_standard_id=" + salary_standard_id +
                ", salary_standard_name='" + salary_standard_name + '\'' +
                ", salary_sum=" + salary_sum +
                ", demand_salaray_sum=" + demand_salaray_sum +
                ", paid_salary_sum=" + paid_salary_sum +
                ", major_change_amount=" + major_change_amount +
                ", bonus_amount=" + bonus_amount +
                ", training_amount=" + training_amount +
                ", human_histroy_records='" + human_histroy_records + '\'' +
                ", human_family_membership='" + human_family_membership + '\'' +
                ", human_picture='" + human_picture + '\'' +
                ", attachment_name='" + attachment_name + '\'' +
                ", check_status=" + check_status +
                ", register='" + register + '\'' +
                ", checker='" + checker + '\'' +
                ", changer='" + changer + '\'' +
                ", regist_time='" + regist_time + '\'' +
                ", check_time='" + check_time + '\'' +
                ", change_time='" + change_time + '\'' +
                ", lastly_change_time='" + lastly_change_time + '\'' +
                ", delete_time='" + delete_time + '\'' +
                ", recovery_time='" + recovery_time + '\'' +
                ", human_file_status=" + human_file_status +
                '}';
    }
}
