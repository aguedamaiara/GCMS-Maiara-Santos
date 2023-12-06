package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {

		return "Hello, World";
	}


	@RequestMapping("/maiara")
	public @ResponseBody String greetingMaiara() {
		//return "Hello, Maiara!";
		return "Hello, Maiara?";
		//comentario feito para quebrar o build
	}
	
}