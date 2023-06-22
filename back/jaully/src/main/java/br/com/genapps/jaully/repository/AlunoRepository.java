package br.com.genapps.jaully.repository;

import br.com.genapps.jaully.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
