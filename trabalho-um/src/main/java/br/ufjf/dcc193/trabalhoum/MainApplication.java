package br.ufjf.dcc193.trabalhoum;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.trabalhoum.data.AtividadeRepository;
import br.ufjf.dcc193.trabalhoum.data.MembroRepository;
import br.ufjf.dcc193.trabalhoum.data.SedeRepository;
import br.ufjf.dcc193.trabalhoum.model.*;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MainApplication.class, args);

		Date date = new Date();

		AtividadeRepository ativRepo = ctx.getBean(AtividadeRepository.class);		
		MembroRepository membroRepo = ctx.getBean(MembroRepository.class);		
		SedeRepository sedeRepo = ctx.getBean(SedeRepository.class);
		
		Sede sedeObj = new Sede("Sede1", "Cidade1", "Bairro1", "Telefone1", "Url");
		sedeRepo.deleteAll();
		sedeRepo.save(sedeObj);
		ativRepo.save(new Atividade(sedeObj, "Atividade1", "Descricao1", date, date, 0, 0, 0, 0));
		membroRepo.save(new Membro(sedeObj, "Nome1", "Funcao1", "email@email.com", date, date));

		System.out.println(ativRepo.findAll().toString());
		System.out.println();	
		System.out.println(membroRepo.findAll().toString());		
		System.out.println();			
		System.out.println(sedeRepo.findAll().toString());
	}

}
