package br.ufjf.dcc193.trabalhoum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public RedirectView salvar(@RequestParam String Nome, @RequestParam String EstadoFederacao,
            @RequestParam String Cidade, @RequestParam String Bairro, @RequestParam String Telefone,
            @RequestParam String Url) {

        Sede sede = new Sede();
        sede.setBairro(Bairro);
        sede.setCidade(Cidade);
        sede.setEstadoFederacao(EstadoFederacao);
        sede.setNome(Nome);
        sede.setTelefone(Telefone);
        sede.setUrl(Url);

        repo.save(sede);

        return new RedirectView("/sede/listar");
    }

    @RequestMapping("/sede/editar/{id}")
    public String editar(@PathVariable String id, Model modelSede) {
        Sede sede = repo.findById(Long.parseLong(id)).orElse(null);
        
        modelSede.addAttribute("sede", sede);
        return "/sede/editar";
    }
    
    @RequestMapping("/sede/atualizar")
    public RedirectView atualizar(
            @RequestParam String Id, 
            @RequestParam String Nome, 
            @RequestParam String EstadoFederacao,
            @RequestParam String Cidade,
            @RequestParam String Bairro, 
            @RequestParam String Telefone,
            @RequestParam String Url) {
        
        Sede sede = repo.findById(Long.parseLong(Id)).orElse(null);

        if (sede == null)
            return new RedirectView("/error");

        sede.setBairro(Bairro);
        sede.setCidade(Cidade);
        sede.setEstadoFederacao(EstadoFederacao);
        sede.setNome(Nome);
        sede.setTelefone(Telefone);
        sede.setUrl(Url);
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