package com.qht.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.qht.biz.CourseAskBiz;
import com.qht.entity.CourseAsk;
import com.qht.services.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("courseAsk")
public class CourseAskController extends APIBaseController<CourseAskBiz,CourseAsk>  {

}