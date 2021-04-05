package br.com.unipac.alunosapi.model.service;

import java.util.List;
import java.util.Optional;

import br.com.unipac.alunosapi.model.domain.Professor;

public interface ProfessorService {
    Professor salvar(Professor aluno);
    Professor editar(Long id, Professor aluno);
    List<Professor> list();
    Optional<Professor> findById(Long id);
    void delete(Long id);
}
