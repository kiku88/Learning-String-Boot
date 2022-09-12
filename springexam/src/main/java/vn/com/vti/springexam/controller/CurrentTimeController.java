package vn.com.vti.springexam.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/currentTime")
public class CurrentTimeController {
	
	@RequestMapping("/index")
	public String index(Model model) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateStr = dateFormat.format(date);
		
		model.addAttribute("dateAndTime", dateStr);
		return "currentTimeView";
	}
	
}
