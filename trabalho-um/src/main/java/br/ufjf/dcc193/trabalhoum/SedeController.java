package br.ufjf.dcc193.trabalhoum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SedeController {
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
    public String listar(){
        return "sede/listar";
    }
}