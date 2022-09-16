package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.form.InfraForm;

@Controller
@RequestMapping("/infraInsert")
public class InfraInsertController {

	@ModelAttribute
	public InfraForm createForm() {
		return new InfraForm();
	}
	@RequestMapping("/input")
	public String input(InfraForm infraForm) {
		return "infra/infraInput";	
	}
	
	@RequestMapping("/confirm")
	public String confirm(InfraForm infraForm, Model model) {
		return "infra/infraConfirm";
	}
	
}
