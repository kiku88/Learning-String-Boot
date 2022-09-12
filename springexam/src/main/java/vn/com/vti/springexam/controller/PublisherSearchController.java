package vn.com.vti.springexam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Publisher;
import vn.com.vti.springexam.mapper.PublisherMapper;

@Controller
@RequestMapping("/publisherSearch")

public class PublisherSearchController {
	@Autowired
	private PublisherMapper publisherMapper;
	@RequestMapping("/input")
	public String input() {
		return "publisher/publisherSearchInput";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam String publisherId, Model model){
		 Publisher publisher = publisherMapper.selectByPrimaryKey(publisherId);
		 model.addAttribute("publisher", publisher);
	return "publisher/publisherSearchDetail";
	}
}
	