package rj.handschool.model;

import java.util.List;

public class Turma {
	private Long id;
	private String descricao;
	private Professor professor;
	private Disciplina disciplina;
	private List<Alunos> alunosList;
	
	private List<Avaliacao> avaliacao;
	private String conceitoMedioTurma;
	private Double mediaTurma;
}
