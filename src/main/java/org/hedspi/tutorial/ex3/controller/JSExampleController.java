package org.hedspi.tutorial.ex3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JSExampleController {

	@RequestMapping(value = { "/js-validate" }, method = RequestMethod.GET)
	public String validate(Model model) {
		model.addAttribute("status", "input email");
		model.addAttribute("email", "");
		return "JsValidatePage"; // definition in tilesFtl-js.xml
	}
	@RequestMapping(value = { "/js-validate" }, method = RequestMethod.POST)
	public String validate(@RequestParam String email, Model model) {
		model.addAttribute("status", "email validated!");
		model.addAttribute("email", email);
		return "JsValidatePage"; // definition in tilesFtl-js.xml
	}
	
	@RequestMapping(value = { "/js-object" }, method = RequestMethod.GET)
	public String object(Model model) {
		return "JsObjectPage"; // definition in tilesFtl-js.xml
	}

	@RequestMapping(value = { "/js-cookie" }, method = RequestMethod.GET)
	public String date(Model model) {
		return "JsCookiePage"; // definition in tilesFtl-js.xml
	}

	@RequestMapping(value = { "/js-dom" }, method = RequestMethod.GET)
	public String dom(Model model) {
		return "JsDomPage"; // definition in tilesFtl-js.xml
	}
	@RequestMapping(value = { "/js-functions" }, method = RequestMethod.GET)
	public String functions(Model model) {
		return "JsFunctionsPage"; // definition in tilesFtl-js.xml
	}

}
