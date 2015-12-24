package org.hedspi.tutorial.ex3.controller;

import org.hedspi.tutorial.ex3.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@Autowired
    private AccountDAO accountDAO;

	@RequestMapping(value = { "/index", "/" }, method = RequestMethod.GET)
	public String index() {
		return "IndexPage"; // definition in tilesFtl.xml
	}
	
	@RequestMapping(value = { "/help" }, method = RequestMethod.GET)
	public String help(Model model) {
		model.addAttribute("email", "abc@gmail.com");
		model.addAttribute("address", "số 1 Đại Cồ Việt, Hà Nội");
		return "HelpPage"; // definition in tilesFtl.xml
	}
	
	@RequestMapping(value = { "/about" }, method = RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("status", "96");
		
		// test
//		accountDAO.insertAccount("tien123@gmail.com", "12345678");
		
		model.addAttribute("status", "insert done, check database");
		return "AboutPage"; // definition in tilesFtl.xml
	}
	
	@RequestMapping(value = { "/lesson-html" }, method = RequestMethod.GET)
	public String lessonHTML() {
		return "HtmlBase"; // definition in tilesFtl-html.xml
	}
	
	@RequestMapping(value = { "/lesson-css" }, method = RequestMethod.GET)
	public String lessonCssL() {
		return "CssBase"; // definition in tilesFtl-css.xml
	}
	
	@RequestMapping(value = { "/lesson-sql" }, method = RequestMethod.GET)
	public String lessonSql() {
		return "SqlBase"; // definition in tilesFtl-sql.xml
	}
	
	@RequestMapping(value = { "/lesson-js" }, method = RequestMethod.GET)
	public String lessonJS() {
		return "JsBase"; // definition in tilesFtl-js.xml
	}
	
	@RequestMapping(value = { "/lesson-jquery" }, method = RequestMethod.GET)
	public String lessonJQuery() {
		return "JQueryBase"; // definition in tilesFtl-js.xml
	}
	
}
