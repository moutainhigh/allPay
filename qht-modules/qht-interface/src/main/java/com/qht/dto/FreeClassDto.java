package com.qht.dto;

import java.io.Serializable;

/**
 * 免费课程
 */
public class FreeClassDto implements Serializable {
    //封面
    private String cover;
    //课程包id
    private String uid;
    //课程包名称
    private String pkg_name;
    //班级名称
    private String level_name;
    //播放类型
    private String play_type_id;

    public String getPlay_type_id() {
        return play_type_id;
    }

    @Override
    public String toString() {
        return "FreeClassDto{" +
                "cover='" + cover + '\'' +
                ", uid='" + uid + '\'' +
                ", pkg_name='" + pkg_name + '\'' +
                ", level_name='" + level_name + '\'' +
                ", play_type_id='" + play_type_id + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public void setPlay_type_id(String play_type_id) {
        this.play_type_id = play_type_id;
    }

    //老师名称
    private String nickname;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPkg_name() {
        return pkg_name;
    }

    public void setPkg_name(String pkg_name) {
        this.pkg_name = pkg_name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLevel_name() {
        return level_name;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

}

