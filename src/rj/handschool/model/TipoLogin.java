package rj.handschool.model;

public enum TipoLogin {
	ALUNO("Aluno"), PROFESSOR("Professor") , OWNER("Owner");
	
	private String conteudo;
	
	TipoLogin(String conteudo){
		this.conteudo = conteudo;
	}
	
	public String getConteudo(){
		return this.conteudo;
	}
}
