package br.com.unipac.alunosapi.model.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unipac.alunosapi.model.domain.Professor;
import br.com.unipac.alunosapi.model.repository.ProfessorRepository;
import br.com.unipac.alunosapi.model.service.ProfessorService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorRepository profRepository;

	@Override
	public Professor salvar(Professor aluno) {
		return profRepository.save(aluno);
	}

	@Override
	public Professor editar(Long id, Professor aluno) {
		aluno.setId(id);
		return profRepository.save(aluno);
	}

	@Override
	public List<Professor> list() {
		return profRepository.findAll();
	}

	@Override
	public Optional<Professor> findById(Long id) {
		return profRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		alunoRepository.deleteById(id);
	}
}
