package org.hedspi.tutorial.ex3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlExampleController {

	@RequestMapping(value = { "/html-paragraph" }, method = RequestMethod.GET,  produces = "text/plain;charset=UTF-8")
	public String paragraph(Model model) {
		return "ParagraphPage"; // definition in tilesFtl-html.xml
	}

	@RequestMapping(value = { "/html-table" }, method = RequestMethod.GET)
	public String table(Model model) {
		return "TablePage"; // definition in tilesFtl-html.xml
	}

	@RequestMapping(value = { "/html-image" }, method = RequestMethod.GET)
	public String image(Model model) {
		return "ImagePage"; // definition in tilesFtl-html.xml
	}

	@RequestMapping(value = { "/html-iframe" }, method = RequestMethod.GET)
	public String iframe(Model model) {
		return "IframePage"; // definition in tilesFtl-html.xml
	}

	@RequestMapping(value = { "/html-forms" }, method = RequestMethod.GET)
	public String forms(Model model) {
		model.addAttribute("status", "not login");
		model.addAttribute("email", "");
		model.addAttribute("password", "");
		return "FormsPage"; // definition in tilesFtl-html.xml
	}
	@RequestMapping(value = { "/html-forms" }, method = RequestMethod.POST)
	public String forms(@RequestParam String email, @RequestParam String password, Model model) {
		model.addAttribute("status", "login success");
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "FormsPage"; // definition in tilesFtl-html.xml
	}
}
