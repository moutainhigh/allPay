package com.qht.dto;

import java.io.Serializable;

/**
 * 课程详情-课程包简介参数
 */
public class CourseIntroParameter implements Serializable {
    //课程包id
    private String  uid;
    //运营方id
    private String tenant_id;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    @Override
    public String toString() {
        return "CourseIntroParameter{" +
                "uid='" + uid + '\'' +
                ", tenant_id='" + tenant_id + '\'' +
                '}';
    }


}
