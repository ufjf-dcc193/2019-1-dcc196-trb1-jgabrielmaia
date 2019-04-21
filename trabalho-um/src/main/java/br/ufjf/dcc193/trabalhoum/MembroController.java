package br.ufjf.dcc193.trabalhoum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MembroController {
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
    public String listar(){
        return "membro/listar";
    }
}