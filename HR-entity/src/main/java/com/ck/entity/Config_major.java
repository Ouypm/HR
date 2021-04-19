package com.ck.entity;

/**
 * wl
 * 职位设置
 */


public class Config_major {
    private int  mak_id;//	integer	主键，自动增长列
    private int major_kind_id;//	integer	职位分类编号(外健：Config_major_kind 表中的：major_kind_id)
    private String major_kind_name;//	string	职位分类名称
    private int  major_id;//	integer	 职位编号
    private String major_name;//	string	职位名称
    private int test_amount;//	integer	题套数量



    public int getMak_id() {
        return mak_id;
    }

    public void setMak_id(int mak_id) {
        this.mak_id = mak_id;
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

    public int getTest_amount() {
        return test_amount;
    }

    public void setTest_amount(int test_amount) {
        this.test_amount = test_amount;
    }

    public Config_major() {
    }

    public Config_major(int mak_id, int major_kind_id, String major_kind_name, int major_id, String major_name, int test_amount) {
        this.mak_id = mak_id;
        this.major_kind_id = major_kind_id;
        this.major_kind_name = major_kind_name;
        this.major_id = major_id;
        this.major_name = major_name;
        this.test_amount = test_amount;
    }
}
