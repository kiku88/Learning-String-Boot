package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {

	@RequestMapping("/fortune")
	public String index(Model model) {
		Random rnd = new Random();
		int value = rnd.nextInt(3);  
		String text = "";
		switch (value){
			case 0:
				text = "Lucky";
				break;
			case 1:
				text = "Normal";
				break;
			case 2:
				text = "Bad";
				break;
		}
		model.addAttribute("fortuneRandom", text);
		return "fortune";
	}
	
	
}
