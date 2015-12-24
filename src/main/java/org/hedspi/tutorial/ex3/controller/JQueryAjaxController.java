package org.hedspi.tutorial.ex3.controller;

import org.hedspi.tutorial.ex3.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JQueryAjaxController {
	@RequestMapping(value = { "/lesson-jquery-getjson" }, method = RequestMethod.GET)
	public String getJson(Model model) {
		return "AjaxGetJsonPage"; 
	}

	@RequestMapping(value = "/result.json", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Account getPerson() {
		Account account = new Account(1, "admin@gmail.com", "1234");
		return account;
	}
	
	@RequestMapping(value = { "/post-param" }, method = RequestMethod.POST)
	public @ResponseBody String getAccountParam(@RequestParam ("name") String name) {
		return name + "@gmail.com"; 
	}
	
	@RequestMapping(value = { "/lesson-jquery-ajaxpost" }, method = RequestMethod.GET)
	public String ajaxPost(Model model) {
		return "AjaxPostPage"; 
	}
	
	@RequestMapping(value = { "/lesson-jquery-animate" }, method = RequestMethod.GET)
	public String animate() {
		return "JQueryAnimatePage"; 
	}


}
