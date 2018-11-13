package com.qht.mapper;

import com.qht.dto.*;
import com.qht.entity.Student;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 学生
 * 
 * @author yangtonggan
 * @email 2466607841@qq.com
 * @date 2018-11-05 18:55:41
 * @Mapper
 */
@Repository
public interface StudentMapper extends Mapper<Student> {
    /**
     * 学生登陆
     * @param account
     * @param password
     * @return
     */
    StudentDto studentLogin(@Param("account") String account, @Param("password") String password);

    /**
     * 通过运营id查询首页banner
     * @param tenantId
     * @return
     */
    List<BannerDto> selectBanner(String tenantId,String type);

    /**
     * 通过运营id查询首页直播课程
     * @param tenantId
     * @return
     */
    List<LiveClassDto> selectLiveClass(String tenantId);

    /**
     * 通过pkg_subject_id，pkg_grade_id，tenantId查询首页免费课程
     * @return
     */
    List<FreeClassDto> selectFreeClass(FreeClassParameter data);

    /**
     * 通过运营id查询首页试听排行榜
     * @param tenantId
     * @return
     */
    List<ListeningClassRankingDto> selectListeningClassRanking(String tenantId);

    /**
     * 通过运营id查询首页试听列表
     * @param tenantId
     * @return
     */
    List<ListeningClassListDto> selectListeningClassList(String tenantId);

    /**
     * 通过运营id查询首页老师排行榜
     * @param tenantId
     * @return
     */
    List<TeacherRankingDto> selectTeacherRanking(String tenantId);

    /**
     * 通过运营id查询首页老师集合
     * @param tenantId
     * @return
     */
    List<TeacherListDto> selectTeacherList(String tenantId);

    /**
     * 查询学生课程详情-课程包简介
     * @param uid
     * @param tenantId
     * @return
     */
    CourseIntroDto selectCourseIntro(@Param("uid") String uid,@Param("tenantId") String tenantId);

    /**
     * 课程详情--课程包体系
     * @param uid
     * @param tenantId
     * @return
     */
    List<CourseChapterDto> selectCourseChapter(@Param("uid")String uid, @Param("tenantId")String tenantId);

    /**
     * 课程详情--课程包评论
     * @param uid
     * @param tenantId
     * @return
     */
    List<CourseEvaluationDto> selectCourseEvaluation(@Param("uid")String uid, @Param("tenantId")String tenantId);

    /**
     * 课程详情--教师信息
     * @param uid
     * @param tenantId
     * @return
     */
    TeacherInfoDto selectTeacherInfo(@Param("uid")String uid, @Param("tenantId")String tenantId);

    /**
     * 课程列表
     * @param data
     * @return
     */
    List<CourseListDto> selectCourseList(CourseListParameter data);

    /**
     * 名师列表
     * @param data
     * @return
     */
    List<TopTeacherListDto> selectTopTeacherList(TopTeacherListParameter data);

    /**
     * 名师详情--讲师简介
     * @param uid
     * @param tenantId
     * @return
     */
    List<TopTeacherInfoDto> selectTopTeacherInfo(@Param("uid") String uid, @Param("tenantId") String tenantId);

    /**
     * 名师详情--全部课程
     * @param uid
     * @param tenantId
     * @return
     */
    List<TeacherCourseDto> selectTeacherCourse(@Param("uid")String uid, @Param("tenantId") String tenantId);

    /**
     * 名师详情--评论列表
     * @param uid
     * @param tenantId
     * @return
     */
    List<TeacherEvaluationDto> selectTeacherEvaluation(@Param("uid")String uid, @Param("tenantId") String tenantId);

    /**
     * 运营商--学校介绍
     * @param tenantId
     * @return
     */
    TenantSchoolDto selectTenantSchool(String tenantId);

    /**
     * 运营商--画册
     * @param tenantId
     * @return
     */
    TenantAlbumDto selectTenantAlbum(String tenantId);

    /**
     * 学生端-个人中心--首页--我的课程详情介绍
     * @param uid
     * @param tenantId
     * @return
     */
    List<IndexCourseDetailsDto> selectIndexCourseDetails(@Param("uid") String uid, @Param("tenantId") String tenantId);

    /**
     * 学生端-个人中心--首页--我的课程列表
     * @param data
     * @return
     */
    List<MyIndexCourseDto> selectMyIndexCourse(MyIndexCourseParameter data);

    /**
     * 学生端-个人中心--首页--课程答疑
     * @param data
     * @return
     */
    List<MyIndexCourseAnswerDto> selectMyIndexCourseAnswer(MyIndexCourseAnswerParameter data);

    /**
     * 消息
     * @param uid
     * @param tid
     * @param isread
     * @return
     */
    List<MyIndexMessageDto> selectMyIndexMessage(String uid,String tid,String isread);

    /**
     * 刪除消息
     * @param uid
     * @return
     */
    Integer deleteMessage(String uid);

    /**
     * 查詢消息
     * @param uid
     * @return
     */
    MyIndexMessageDto selectMessageById(String uid);

    /**
     * 学生端-个人中心--首页--兑换记录
     * @param data
     * @return
     */
    List<MyIndexBuyRecordDto> selectMyIndexBuyRecord(MyIndexBuyRecordParameter data);
    /**
     * 查詢學生信息
     * @param uid
     * @param tid
     * @return
     */
    StudentInfoDto studentInfo(String uid,String tid);

    /**
     * 消费记录
     * @param parameter
     * @return
     */
    List<MyIndexMyintegralDetailDto> myIndexMyintegralDetail(MyIndexMyintegralDetailParameter parameter);

    /**
     * 近期合同
     * @param uid
     * @param tid
     * @return
     */
    List<IndexFutureCoruseDto> indexFutureCoruse(String uid,String tid);

    /**
     * 名师资源
     * @param tid
     * @return
     */
    List<IndexTeacherDto> indexTeacher(String tid);

    /**
     * 课程疑答
     * @param tid
     * @return
     */
    List<IndexAnswerDto> indexAnswer(String tid);
}
