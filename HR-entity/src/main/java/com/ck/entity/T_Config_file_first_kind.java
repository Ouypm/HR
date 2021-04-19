package com.ck.entity;

/**
 * HR-
 * Description:
 * 一级机构设置
 * @Author 林先森
 * @Date 2021/4/12 21:01
 */
public class T_Config_file_first_kind {
    private int ffk_id;	     	// 主键，自动增长列
    private int first_kind_id; 	// 一级机构编号
    private String first_kind_name; 	// 一级机构名称
    private int first_kind_salary_id;		// 一级机构薪酬发放责任人编号
    private int first_kind_sale_id; 		// 一级机构销售责任人编号

    public T_Config_file_first_kind() {
    }

    public T_Config_file_first_kind(int ffk_id, int first_kind_id, String first_kind_name, int first_kind_salary_id, int first_kind_sale_id) {
        this.ffk_id = ffk_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.first_kind_salary_id = first_kind_salary_id;
        this.first_kind_sale_id = first_kind_sale_id;
    }

    public int getFfk_id() {
        return ffk_id;
    }

    public void setFfk_id(int ffk_id) {
        this.ffk_id = ffk_id;
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

    public int getFirst_kind_salary_id() {
        return first_kind_salary_id;
    }

    public void setFirst_kind_salary_id(int first_kind_salary_id) {
        this.first_kind_salary_id = first_kind_salary_id;
    }

    public int getFirst_kind_sale_id() {
        return first_kind_sale_id;
    }

    public void setFirst_kind_sale_id(int first_kind_sale_id) {
        this.first_kind_sale_id = first_kind_sale_id;
    }
}
