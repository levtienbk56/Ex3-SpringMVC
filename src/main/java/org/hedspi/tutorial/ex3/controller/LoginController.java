package org.hedspi.tutorial.ex3.controller;

import java.util.List;
import java.util.Map;

import org.hedspi.tutorial.ex3.dao.AccountDAO;
import org.hedspi.tutorial.ex3.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@Autowired
	private AccountDAO accountDAO;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String forms(Model model) {
		model.addAttribute("status", "not login");
		return "LoginPage"; // definition in tilesFtl.xml
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String forms(@RequestParam String email, @RequestParam String password, Model model) {
		List<Map<String, Object>> accs = accountDAO.getAccount(email, password);
		if (accs != null && accs.size() == 1) {
			model.addAttribute("status", "login success");
		} else {
			model.addAttribute("status", "login fail");
		}

		return "LoginPage"; // definition in tilesFtl.xml
	}
}
