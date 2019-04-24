package br.ufjf.dcc193.trabalhoum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalhoum.data.AtividadeRepository;
import br.ufjf.dcc193.trabalhoum.model.Atividade;

@Controller
public class AtividadeController {

    @Autowired
    AtividadeRepository repo;

    @RequestMapping("/atividade/criar")
    public String criar(){
        return "atividade/criar";
    }

    @RequestMapping("/atividade/editar")
    public String editar(){
        return "atividade/editar";
    }

    @RequestMapping("/atividade/excluir")
    public String excluir(){
        return "atividade/excluir";
    }

    @RequestMapping("/atividade/listar")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/atividade/listar");

        List<Atividade> atividades = repo.findAll();
        mv.addObject("atividades", atividades);
        return mv;
    }

    @RequestMapping("/atividade/somatorioPorSede")
    public String somatorioPorSede(){
        return "atividade/somatorioPorSede";
    }    
}