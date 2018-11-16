package com.qht.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qht.RequestObject;
import com.qht.ResultObject;
import com.qht.biz.CoursePkgBiz;
import com.qht.biz.PkgGradeBiz;
import com.qht.biz.PkgSubjectBiz;
import com.qht.dto.AppMyStudentGuardianDto;
import com.qht.dto.CoursePkgListDto;
import com.qht.dto.GradetListDto;
import com.qht.dto.PkgSubjectListDto;
import com.qht.services.CommonService;

@Controller
@RequestMapping("/common")
public class CommonController implements CommonService {
	@Autowired
	private PkgSubjectBiz pkgSubjectBiz;
	@Autowired
	private PkgGradeBiz pkgGradeBiz;
	@Autowired
	private CoursePkgBiz coursePkgBiz;

	@Override
	@PostMapping("/common/subjectList")
    @ResponseBody
	public ResultObject<List<PkgSubjectListDto>> subjectList(@RequestBody  RequestObject<Void> requestObject) {
		 List<PkgSubjectListDto> dto=pkgSubjectBiz.subjectList();
	        ResultObject< List<PkgSubjectListDto>> resultObj=new ResultObject<>();
	        resultObj.setCode("0");
	        resultObj.setMsg("成功");
	        resultObj.setData(dto);
	        return resultObj;
	}

	@Override
	@PostMapping("/common/gradetList")
    @ResponseBody
	public ResultObject<List<GradetListDto>> gradetList(@RequestBody RequestObject<Void> requestObject) {
		 List<GradetListDto> dto=pkgGradeBiz.gradetList();
	        ResultObject< List<GradetListDto>> resultObj=new ResultObject<>();
	        resultObj.setCode("0");
	        resultObj.setMsg("成功");
	        resultObj.setData(dto);
	        return resultObj;
	}

	@Override
	@PostMapping("/common/courseTypeList")
    @ResponseBody
	public ResultObject<List<CoursePkgListDto>> courseTypeList(@RequestBody RequestObject<Void> requestObject) {
		 List<CoursePkgListDto> dto=coursePkgBiz.courseTypeList();
	        ResultObject< List<CoursePkgListDto>> resultObj=new ResultObject<>();
	        resultObj.setCode("0");
	        resultObj.setMsg("成功");
	        resultObj.setData(dto);
	        return resultObj;
	}
	

}
