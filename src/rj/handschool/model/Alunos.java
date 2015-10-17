package rj.handschool.model;

import java.util.List;

public class Alunos {
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private int telefone;
	private String nomePai;
	private String emailPai;
	private String nomeMae;
	private String emailMae;
	
	private List<Avaliacao> avaliacao;
	private String conceito;
	private Double media;
}
