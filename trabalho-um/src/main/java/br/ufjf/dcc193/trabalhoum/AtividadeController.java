package br.ufjf.dcc193.trabalhoum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AtividadeController {
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
    public String listar(){
        return "atividade/listar";
    }

    @RequestMapping("/atividade/somatorioPorSede")
    public String somatorioPorSede(){
        return "atividade/somatorioPorSede";
    }    
}