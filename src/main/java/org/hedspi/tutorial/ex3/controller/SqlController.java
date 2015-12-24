package org.hedspi.tutorial.ex3.controller;

import org.hedspi.tutorial.ex3.dao.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SqlController {
	@Autowired
	private AccountDAO accountDAO;

	@RequestMapping(value = "/sql-ex1", method = RequestMethod.GET)
	public String ex1(Model model) {
		model.addAttribute("status", "");
		return "SqlEx1Page";
	}

	@RequestMapping(value = "/sql-ex1", method = RequestMethod.POST)
	public String ex1(@RequestParam String email, @RequestParam String password, Model model) {
		if (!email.equals(null) && !email.equals("") && !password.equals(null) && !equals("")) {
			accountDAO.insertAccount(email, password);
			model.addAttribute("status", "insert success");
		}else{
			model.addAttribute("status", "insert fail");
		}
		return "SqlEx1Page";
	}
}
