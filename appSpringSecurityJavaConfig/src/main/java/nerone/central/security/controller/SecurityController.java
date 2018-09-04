package nerone.central.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/showMessage", method=RequestMethod.GET)
	public String showMessage(Model model) {
		model.addAttribute("message", "Hello world Spring Security");
		return "showMessage";
	}

}
