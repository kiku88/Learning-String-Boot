package vn.com.vti.springexam.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String confirm(@Valid InfraForm infraForm, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			return input(infraForm);
		}
		
		return "infra/infraConfirm";
	}
	
}
