package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.hello.model.Pessoa;

@Controller
@RequestMapping("/")

public class IndexController {

	@GetMapping
	public String index() {
		return "index";

	}

	@PostMapping
	public ModelAndView getPessoa(Pessoa pessoa) {
		ModelAndView mv = new ModelAndView("pessoa");
		mv.addObject(pessoa);
		return mv;

	}

}
