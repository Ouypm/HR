package com.ck.entity;

/**
 * Description:
 * 公共字段设置
 * @Author SQB
 * @Date 2021/4/14 9:34
 */
public class T_Config_public_char {

            private int pbc_id;            //主键
            private String  attribute_kind;            //属性的种类
            private String attribute_name;         //属性的名称

    public int getPbc_id() {
        return pbc_id;
    }

    public void setPbc_id(int pbc_id) {
        this.pbc_id = pbc_id;
    }

    public String getAttribute_kind() {
        return attribute_kind;
    }

    public void setAttribute_kind(String attribute_kind) {
        this.attribute_kind = attribute_kind;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public T_Config_public_char() {
    }

    public T_Config_public_char(int pbc_id, String attribute_kind, String attribute_name) {
        this.pbc_id = pbc_id;
        this.attribute_kind = attribute_kind;
        this.attribute_name = attribute_name;
    }
}
