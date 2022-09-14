package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.OrderHeaderForm;

@Controller
@RequestMapping ("/orderHeaderRegister")
public class OrderHeaderRegisterController {
	
	@ModelAttribute
	public OrderHeaderForm createForm() {
		return new OrderHeaderForm();
	}
	
	@RequestMapping("/input")
	public String input(OrderHeaderForm orderHeaderForm) {
		return "orderHeader/orderHeaderRegisterInput";
	}
	@RequestMapping("/confirm")
	public String input(OrderHeaderForm orderHeaderForm, Model model) {
		return "orderHeader/orderHeaderRegisterConfirm";
	}
}
