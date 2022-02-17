package com.br.TabernaDtodos.TabernaDtodos.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.br.TabernaDtodos.TabernaDtodos.repositorys.MesaRepository;


@Controller //anotando que é um controller
public class MesaController {
	@Autowired
	private MesaRepository mr; //chamando o repository que tem os metodos de CRUD e códigos SQL
	
	@RequestMapping(value = "/home")
	public String form() {
		return "/homepage";
	}
	
	
}
