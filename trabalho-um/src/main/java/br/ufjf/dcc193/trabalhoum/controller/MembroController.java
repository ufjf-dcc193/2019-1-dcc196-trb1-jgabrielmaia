package br.ufjf.dcc193.trabalhoum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalhoum.data.MembroRepository;
import br.ufjf.dcc193.trabalhoum.model.Membro;

@Controller
public class MembroController {
    
    @Autowired
    MembroRepository repo;

    @RequestMapping("/membro/criar")
    public String criar(){
        return "membro/criar";
    }

    @RequestMapping("/membro/editar")
    public String editar(){
        return "membro/editar";
    }

    @RequestMapping("/membro/excluir")
    public String excluir(){
        return "membro/excluir";
    }

    @RequestMapping("/membro/listar")
    public ModelAndView listar(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/membro/listar");

        List<Membro> membros = repo.findAll();
        mv.addObject("membros", membros);
        return mv;
    }
}