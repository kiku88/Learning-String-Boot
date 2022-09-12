package vn.com.vti.springexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/wordLength")
public class WordLengthController {
	@RequestMapping("/input")
	
	public String input() {
		return "wordLength/wordLengthInput";
	}
	@RequestMapping("/result")
	public String result(@RequestParam String str, Model model) {
		int length = str.length();
		model.addAttribute("length",length);
		return "wordLength/wordLengthResult";
	}
	
	
	
}
