package br.ufjf.dcc193.trabalhoum.data;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufjf.dcc193.trabalhoum.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long>{

}