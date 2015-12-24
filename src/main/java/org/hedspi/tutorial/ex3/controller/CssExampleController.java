package org.hedspi.tutorial.ex3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CssExampleController {

	@RequestMapping(value = { "/css-text" }, method = RequestMethod.GET)
	public String paragraph(Model model) {
		return "CssTextPage"; // definition in tilesFtl-css.xml
	}

	@RequestMapping(value = { "/css-list" }, method = RequestMethod.GET)
	public String table(Model model) {
		return "CssListPage"; // definition in tilesFtl-css.xml
	}

	@RequestMapping(value = { "/css-table" }, method = RequestMethod.GET)
	public String image(Model model) {
		return "CssTablePage"; // definition in tilesFtl-css.xml
	}

	@RequestMapping(value = { "/css-image" }, method = RequestMethod.GET)
	public String iframe(Model model) {
		return "CssImagePage"; // definition in tilesFtl-css.xml
	}
}
