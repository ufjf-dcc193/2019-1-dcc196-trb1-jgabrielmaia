package br.ufjf.dcc193.trabalhoum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalhoum.data.SedeRepository;
import br.ufjf.dcc193.trabalhoum.model.Sede;

@Controller
public class SedeController {
    @Autowired
    SedeRepository repo;

    @RequestMapping("/sede/criar")
    public String criar(){
        return "sede/criar";
    }

    @RequestMapping("/sede/editar")
    public String editar(){
        return "sede/editar";
    }

    @RequestMapping("/sede/excluir")
    public String excluir(){
        return "sede/excluir";
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