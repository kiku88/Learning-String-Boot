package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.springexam.entity.JobType;
import vn.com.vti.springexam.entity.JobTypeExample;
import vn.com.vti.springexam.mapper.JobTypeMapper;

@Controller
@RequestMapping("jobType")
public class JobTypeController {
	
	@Autowired
	private JobTypeMapper jobTypeMapper;
	
	@RequestMapping(value="list", produces = "text/plain")
	@ResponseBody
	public String list() {
		JobTypeExample jobTypeExample = new JobTypeExample();
		jobTypeExample.setOrderByClause("job_type_id");
		List<JobType> jobTypeList = jobTypeMapper.selectByExample(jobTypeExample);
		
		String result="";
		for(JobType jobType : jobTypeList) {
			result += jobType.getJobTypeId();
			result +=":";
			result+= jobType.getJobTypeName();
			result +="\r\n";
		}
		return result;
	}
	
}
