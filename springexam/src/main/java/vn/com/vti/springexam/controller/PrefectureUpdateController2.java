package vn.com.vti.springexam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;
import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureInfrastructure;
import vn.com.vti.springexam.entity.PrefectureInfrastructureExample;
import vn.com.vti.springexam.entity.Section3;
import vn.com.vti.springexam.entity.Section3Example;
import vn.com.vti.springexam.entity.Section8;
import vn.com.vti.springexam.entity.Section8Example;
import vn.com.vti.springexam.form.PrefectureForm2;
import vn.com.vti.springexam.mapper.InfrastructureMapper;
import vn.com.vti.springexam.mapper.PrefectureInfrastructureMapper;
import vn.com.vti.springexam.mapper.PrefectureMapper;
import vn.com.vti.springexam.mapper.Section3Mapper;
import vn.com.vti.springexam.mapper.Section8Mapper;

@Controller
@RequestMapping("prefectureUpdate2")
public class PrefectureUpdateController2 {
	@Autowired
	private PrefectureMapper prefectureMapper;
	@Autowired
	private PrefectureInfrastructureMapper prefectureInfrastructureMapper;
	@Autowired
	private Section3Mapper section3Mapper;
	@Autowired
	private Section8Mapper section8Mapper;
	@Autowired
	private InfrastructureMapper infrastructureMapper;

	public PrefectureForm2 createForm() {
		return new PrefectureForm2();
	}

	@RequestMapping("init")
	public String init(@RequestParam Integer prefectureId, PrefectureForm2 prefectureForm, Model model) {
		Prefecture prefecture = prefectureMapper.selectByPrimaryKey(prefectureId);
		prefectureForm.setId(prefecture.getId());
		prefectureForm.setName(prefecture.getName());
		prefectureForm.setPopulation(prefecture.getPopulation());
		prefectureForm.setSection3Id(prefecture.getSection3Id());
		prefectureForm.setSection8Id(prefecture.getSection8Id());
		
		PrefectureInfrastructureExample prefectureInfrastructureExample = new PrefectureInfrastructureExample();
		prefectureInfrastructureExample.createCriteria().andPrefectureIdEqualTo(prefectureForm.getId());
		List<PrefectureInfrastructure> prefectureInfrastructureList = prefectureInfrastructureMapper
				.selectByExample(prefectureInfrastructureExample);
		for (PrefectureInfrastructure prefectureInfrastructure : prefectureInfrastructureList) {
			prefectureForm.getInfrastructureIdList().add(prefectureInfrastructure.getInfrastructureId());
		}
		return input(prefectureForm, model);
	}

	@RequestMapping("input")
	public String input(PrefectureForm2 prefectureForm, Model model) {
		Section3Example section3Example = new Section3Example();
		section3Example.setOrderByClause("id");
		List<Section3> section3List = section3Mapper.selectByExample(section3Example);
		model.addAttribute("section3List", section3List);
		
		Section8Example section8Example = new Section8Example();
		section8Example.setOrderByClause("id");
		List<Section8> section8List = section8Mapper.selectByExample(section8Example);
		model.addAttribute("section8List", section8List);
		
		InfrastructureExample infrastructureExample = new InfrastructureExample();
		infrastructureExample.setOrderByClause("id");
		List<Infrastructure> infrastructureList = infrastructureMapper.selectByExample(infrastructureExample);
		model.addAttribute("infrastructureList", infrastructureList);
		return "prefecture/prefectureUpdateInput2";
	}

	@RequestMapping("confirm")
	public String confirm(PrefectureForm2 prefectureForm, Model model) {
		if (prefectureForm.getSection3Id() != null) {
			Section3 section3 = section3Mapper.selectByPrimaryKey(prefectureForm.getSection3Id());
			model.addAttribute("section3", section3);
		}
		if (prefectureForm.getSection8Id() != null) {
			Section8 section8 = section8Mapper.selectByPrimaryKey(prefectureForm.getSection8Id());
			model.addAttribute("section8", section8);
		}
		
		List<Infrastructure> infrastructureList = new ArrayList<>();
		List<Integer> infrastructureIdList = prefectureForm.getInfrastructureIdList();
		for (Integer infrastructureId : infrastructureIdList) {
			Infrastructure infrastructure = infrastructureMapper.selectByPrimaryKey(infrastructureId);
			infrastructureList.add(infrastructure);
		}
		model.addAttribute("infrastructureList", infrastructureList);
		return "prefecture/prefectureUpdateConfirm2";
	}

	@RequestMapping("update")
	public String update(PrefectureForm2 prefectureForm, Model model) {
		Prefecture prefecture = new Prefecture();
		prefecture.setId(prefectureForm.getId());
		prefecture.setName(prefectureForm.getName());
		prefecture.setPopulation(prefectureForm.getPopulation());
		prefecture.setSection3Id(prefectureForm.getSection3Id());
		prefecture.setSection8Id(prefectureForm.getSection8Id());
		prefectureMapper.updateByPrimaryKey(prefecture);
		PrefectureInfrastructureExample prefectureInfrastructureExample = new PrefectureInfrastructureExample();
		prefectureInfrastructureExample.createCriteria().andPrefectureIdEqualTo(prefectureForm.getId());
		prefectureInfrastructureMapper.deleteByExample(prefectureInfrastructureExample);
		List<Integer> infrastructureIdList = prefectureForm.getInfrastructureIdList();
		for (Integer infrastructureId : infrastructureIdList) {
			PrefectureInfrastructure prefectureInfrastructure = new PrefectureInfrastructure();
			prefectureInfrastructure.setPrefectureId(prefectureForm.getId());
			prefectureInfrastructure.setInfrastructureId(infrastructureId);
			prefectureInfrastructureMapper.insertSelective(prefectureInfrastructure);
		}
		return "redirect:../prefectureList/index";
	}
}
