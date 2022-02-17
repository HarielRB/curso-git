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

import com.br.TabernaDtodos.TabernaDtodos.repositorys.UsuarioRepository;


public class UsuarioController {

	@Autowired
	private UsuarioRepository ur;
}
