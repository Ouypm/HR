package com.ck.entity;
//试卷详细信息
public class Engage_exam_details {
    private int exd_id	;//	主键，自动增长列
    private String exam_number;//	string	试卷编号
    private String first_kind_id;//	string	试题一级分类编号
    private String first_kind_name;//	string	试题一级分类名称
    private String second_kind_id;//	string	试题二级分类编号
    private String second_kind_name;//	string	试题二级分类名称
    private int question_amount	;//integer	出题数量

    public Engage_exam_details() {
    }

    public Engage_exam_details(int exd_id, String exam_number, String first_kind_id, String first_kind_name, String second_kind_id, String second_kind_name, int question_amount) {
        this.exd_id = exd_id;
        this.exam_number = exam_number;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.second_kind_id = second_kind_id;
        this.second_kind_name = second_kind_name;
        this.question_amount = question_amount;
    }

    public int getExd_id() {
        return exd_id;
    }

    public void setExd_id(int exd_id) {
        this.exd_id = exd_id;
    }

    public String getExam_number() {
        return exam_number;
    }

    public void setExam_number(String exam_number) {
        this.exam_number = exam_number;
    }

    public String getFirst_kind_id() {
        return first_kind_id;
    }

    public void setFirst_kind_id(String first_kind_id) {
        this.first_kind_id = first_kind_id;
    }

    public String getFirst_kind_name() {
        return first_kind_name;
    }

    public void setFirst_kind_name(String first_kind_name) {
        this.first_kind_name = first_kind_name;
    }

    public String getSecond_kind_id() {
        return second_kind_id;
    }

    public void setSecond_kind_id(String second_kind_id) {
        this.second_kind_id = second_kind_id;
    }

    public String getSecond_kind_name() {
        return second_kind_name;
    }

    public void setSecond_kind_name(String second_kind_name) {
        this.second_kind_name = second_kind_name;
    }

    public int getQuestion_amount() {
        return question_amount;
    }

    public void setQuestion_amount(int question_amount) {
        this.question_amount = question_amount;
    }
}
