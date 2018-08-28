package vipList.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vipList.model.entities.Convidado;
import vipList.model.repository.ConvidadoRepository;

@Controller
public class ConvidadosController {
	
	private static final String SLASH = "/";
	private static final String LISTA_CONVIDADOS = "listaConvidados";
	private static final String INDEX = "index";
	
	@Autowired
	private ConvidadoRepository aRepository;
	
	@RequestMapping(SLASH)
	public String getIndexPage() {
		return INDEX;
	}
	
	@RequestMapping(SLASH + LISTA_CONVIDADOS)
	public String getListaConvidados(Model pModel) {
		
		Iterable<Convidado> iterableConvidados = this.aRepository.findAll();
		pModel.addAttribute(iterableConvidados);
		
		return LISTA_CONVIDADOS;
	}
	
}