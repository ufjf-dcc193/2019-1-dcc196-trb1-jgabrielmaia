package br.ufjf.dcc193.trabalhoum;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.trabalhoum.data.*;
import br.ufjf.dcc193.trabalhoum.model.*;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);
		AtividadeRepository ativRepo = ctx.getBean(AtividadeRepository.class);		
		MembroRepository membroRepo = ctx.getBean(MembroRepository.class);		
		SedeRepository sedeRepo = ctx.getBean(SedeRepository.class);
		
		Sede s = new Sede("Sede1", "Estado1", "Cidade1", "Bairro1", "Telefone1", "Url");
		sedeRepo.save(s);

		Date date = new Date();
		Atividade a = new Atividade(s, "Atividade1", "Descricao1", date, date, 0, 0, 0, 0);
		Membro m = new Membro(s, "Nome1", "Funcao1", "email@email.com", date, date);

		ativRepo.save(a);
		membroRepo.save(m);

		s.addAtividade(a);
		s.addMembro(m);

		sedeRepo.save(s);		
	}

}
