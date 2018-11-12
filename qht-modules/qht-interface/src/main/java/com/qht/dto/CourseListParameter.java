package com.qht.dto;

import java.io.Serializable;

public class CourseListParameter implements Serializable {

    //1免费2试听
    private Integer pkt_tyepe_id;
    //课程包科目
    private String pkg_subject_id;
    //课程包年级
    private String pkg_grade_id;
    //1升2降
    private String newtime;
    //价格排序 1升2.降
    private String price;
    //播放类型 1直播 2录播
    private String play_type_id;
    //当前页
    private String page;
    //课程包类型id
    private String course_type_id;

    private String tenantId;
    @Override
    public String toString() {
        return "CourseListParameter{" +
                "pkt_tyepe_id=" + pkt_tyepe_id +
                ", pkg_subject_id='" + pkg_subject_id + '\'' +
                ", pkg_grade_id='" + pkg_grade_id + '\'' +
                ", newtime='" + newtime + '\'' +
                ", price='" + price + '\'' +
                ", play_type_id='" + play_type_id + '\'' +
                ", page='" + page + '\'' +
                ", course_type_id='" + course_type_id + '\'' +
                ", tenantId='" + tenantId + '\'' +
                '}';
    }



    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



    public Integer getPkt_tyepe_id() {
        return pkt_tyepe_id;
    }

    public void setPkt_tyepe_id(Integer pkt_tyepe_id) {
        this.pkt_tyepe_id = pkt_tyepe_id;
    }

    public String getPkg_subject_id() {
        return pkg_subject_id;
    }

    public void setPkg_subject_id(String pkg_subject_id) {
        this.pkg_subject_id = pkg_subject_id;
    }

    public String getPkg_grade_id() {
        return pkg_grade_id;
    }

    public void setPkg_grade_id(String pkg_grade_id) {
        this.pkg_grade_id = pkg_grade_id;
    }

    public String getNewtime() {
        return newtime;
    }

    public void setNewtime(String newtime) {
        this.newtime = newtime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPlay_type_id() {
        return play_type_id;
    }

    public void setPlay_type_id(String play_type_id) {
        this.play_type_id = play_type_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getCourse_type_id() {
        return course_type_id;
    }

    public void setCourse_type_id(String course_type_id) {
        this.course_type_id = course_type_id;
    }


}