package br.com.unipac.alunosapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unipac.alunosapi.model.domain.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
