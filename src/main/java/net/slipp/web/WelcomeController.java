package net.slipp.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
//	private int count = 0;
	
	@GetMapping("/helloworld")
	public String welcome(Model model) {
		List<MyModel> repo = Arrays.asList(new MyModel("javajigi"), new MyModel("sanjigi"));
		model.addAttribute("repo", repo);
		return "welcome";
	}
}
