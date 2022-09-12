package vn.com.vti.springexam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.OrderHeader;
import vn.com.vti.springexam.mapper.OrderHeaderMapper;

@Controller
@RequestMapping("/orderHeaderSearch")

public class OrderHeaderSearchController {
	@Autowired
	private OrderHeaderMapper orderHeaderMapper;
	@RequestMapping("/input")
	public String input() {
		return "orderHeader/orderHeaderSearchInput";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam String orderNo, Model model){
		 OrderHeader orderHeader= orderHeaderMapper.selectByPrimaryKey(orderNo);
		 model.addAttribute("orderHeader", orderHeader);
	return "orderHeader/orderHeaderSearchDetail";
	}
}
	