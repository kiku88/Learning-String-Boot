package vn.com.vti.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import vn.com.vti.entity.Employee;
import vn.com.vti.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    @GetMapping("/")
	public String home() {
		return "home/index";
	}
    
	@GetMapping("/emp")
	public String list(Model model) {
		model.addAttribute("employees", employeeRepository.findAll());
		return "employee/index";
	}

	@GetMapping("/emp/employeeInput")
	public String createInput() {
		return "employee/employeeInput";
	}
/*
	
	@PostMapping("/emp/employeeConfirm")
	public String createConfirm(@RequestParam(value="empNo") Integer empNo, @RequestParam(value="name", required = true) String name, Model model, BindingResult result) {
		if (result.hasErrors()) {
	        return "redirect:/emp/createInput";
	    }
		model.addAttribute("empNo",empNo);
		model.addAttribute("name",name);
	
		return "employee/employeeConfirm";
		
	}
	*/
	

	@PostMapping("/emp/employeeConfirm")
	public String createConfirm(@RequestParam(value="empNo") Integer empNo, @RequestParam(value="name", required = true) String name, Model model) {
		
		model.addAttribute("empNo",empNo);
		model.addAttribute("name",name);
	
		return "employee/employeeConfirm";
		
	}
	
	@PostMapping("/emp/employeeInsert")
	public String insert(@RequestParam("empNo") String empNo, @RequestParam("name") String name) {
		Employee emp = new Employee();
		emp.setEmpNo(Integer.parseInt(empNo));
		emp.setName(name);
		employeeRepository.save(emp);
		return "redirect:../emp";
	}
	
	@GetMapping("/emp/employeeSearchJson")
	@ResponseBody
	public Optional<Employee> search(@RequestParam(value="empNo", required = true) String empNo) {
		return employeeRepository.findByEmpNo(Integer.parseInt(empNo));
	}
}
