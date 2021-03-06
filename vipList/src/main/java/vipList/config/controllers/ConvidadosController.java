package vipList.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vipList.config.model.entities.Convidado;
import vipList.config.model.repository.ConvidadoCrudRepository;

@Controller
public class ConvidadosController {
	
	private static final String SLASH = "/";
	private static final String LISTA_CONVIDADOS = "listaConvidados";
	private static final String INDEX = "index";
	
	@Autowired
	private ConvidadoCrudRepository aRepository;
	
	@RequestMapping(SLASH)
	public String getIndexPage() {
		return INDEX;
	}
	
	@RequestMapping(SLASH + LISTA_CONVIDADOS)
	public String getListaConvidados(Model pModel) {
		Iterable<Convidado> iterableConvidados = this.aRepository.findAll();
		pModel.addAttribute("convidados", iterableConvidados);
		
		return LISTA_CONVIDADOS;
	}
	
}