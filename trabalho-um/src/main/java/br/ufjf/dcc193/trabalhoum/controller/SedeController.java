package br.ufjf.dcc193.trabalhoum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.trabalhoum.data.SedeRepository;
import br.ufjf.dcc193.trabalhoum.model.Sede;

@Controller
public class SedeController {
    @Autowired
    SedeRepository repo;

    @RequestMapping("/sede/criar")
    public String criar() {
        return "sede/criar";
    }

    @RequestMapping("/sede/salvar")
    public RedirectView salvar(Sede sede) {

        repo.save(sede);

        return new RedirectView("/sede/listar");
    }

    @RequestMapping("/sede/editar/{id}")
    public String editar(@PathVariable Long id, Model modelSede) {
        Sede sede = repo.findById(id).orElse(null);

        modelSede.addAttribute("sede", sede);
        return "/sede/editar";
    }
    
    
    @RequestMapping("/sede/atualizar")
    public RedirectView atualizar(Sede sede) {

        repo.save(sede);

        return new RedirectView("/sede/listar");
    }

    @RequestMapping("/sede/excluir/{id}")
    public RedirectView excluir(@PathVariable String id) {
        repo.deleteById(Long.parseLong(id));

        return new RedirectView("/sede/listar");
    }

    @RequestMapping("/sede/listar")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/sede/listar");

        List<Sede> sedes = repo.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }
}