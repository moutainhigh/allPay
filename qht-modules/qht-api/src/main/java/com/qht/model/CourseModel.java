package com.qht.model;

import java.io.Serializable;

public class CourseModel implements Serializable {
    //课程包名称
    private String pkg_name;

    public String getPkg_name() {
        return pkg_name;
    }

    public void setPkg_name(String pkg_name) {
        this.pkg_name = pkg_name;
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "pkg_name='" + pkg_name + '\'' +
                '}';
    }


}
