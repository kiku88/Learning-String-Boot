package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.OrderHeader;
import vn.com.vti.springexam.entity.OrderHeaderExample;
import vn.com.vti.springexam.mapper.OrderHeaderMapper;

@Controller
@RequestMapping("/orderHeaderList")

public class OrderHeaderListController {

	@Autowired
	private OrderHeaderMapper orderHeaderMapper;
	
	@RequestMapping("/index")
	public String index(Model model) {
		OrderHeaderExample orderHeaderExample = new OrderHeaderExample();
		orderHeaderExample.setOrderByClause("order_no");
		List<OrderHeader> orderHeaderList = orderHeaderMapper.selectByExample(orderHeaderExample);
		
		model.addAttribute("orderHeaderList", orderHeaderList);
		return "orderHeader/orderHeaderList";
	}
	

}
