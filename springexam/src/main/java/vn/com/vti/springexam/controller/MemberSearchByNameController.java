package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.MemberCustom;
import vn.com.vti.springexam.mapper.MemberCustomMapper;

@Controller
@RequestMapping("member")
public class MemberSearchByNameController {
	@Autowired
	private MemberCustomMapper memberCustomMapper;
	
	@RequestMapping("input")
	public String input() {
		return "member/memberSearchInput";
	}
	
	@RequestMapping("searchByName")
	public String searchByName(@RequestParam String memberName, Model model ) {
		List<MemberCustom> members =  memberCustomMapper.selectMemberByName("%" + memberName + "%");
		model.addAttribute("members", members);
		return "member/memberSearchResult";
	}
	
	
	
	
}
