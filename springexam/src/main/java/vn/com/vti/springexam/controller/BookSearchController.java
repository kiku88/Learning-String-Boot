package vn.com.vti.springexam.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vn.com.vti.springexam.entity.Book;
import vn.com.vti.springexam.mapper.BookMapper;

@Controller
@RequestMapping("/bookSearch")

public class BookSearchController {
	@Autowired
	private BookMapper bookMapper;
	@RequestMapping("/input")
	public String input() {
		return "book/bookSearchInput";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam String bookId, Model model){
		 Book book= bookMapper.selectByPrimaryKey(bookId);
		 model.addAttribute("book", book);
	return "book/bookSearchDetail";
	}
}
	