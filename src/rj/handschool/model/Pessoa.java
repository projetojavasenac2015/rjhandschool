package rj.handschool.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IDPESSOA")
	private Integer idPessoa;
	
	@Column(name="CPF",length=11,nullable=false)
	private String cpf;
	
	@Column(name="NOME",length=50,nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASCIMENTO",nullable=false)
	private Calendar dataNascimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_HORA_CADASTRO",nullable=false)
	private Calendar dataHoraCadastro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ATUALIZACAO",nullable=false)
	private Calendar dataUltimaAtualizacao;
	
	@Column(name="EMAIL",length=70,nullable=false) 
	private String email;
	
	@Column(name="MATRICULA",length=30,nullable=false)
	private String matricula;
	
	@OneToMany(mappedBy="pessoa")
	private List<Login> logins;
	
	
	 public List<Login> getLogins() {
		return logins;
	}
	public void setLogins(List<Login> logins) {
		this.logins = logins;
	}
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Calendar getDataHoraCadastro() {
		return dataHoraCadastro;
	}
	public void setDataHoraCadastro(Calendar dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
	public Calendar getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Calendar dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPessoa == null) ? 0 : idPessoa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", cpf=" + cpf + ", nome="
				+ nome + ", dataNascimento=" + dataNascimento
				+ ", dataHoraCadastro=" + dataHoraCadastro
				+ ", dataUltimaAtualizacao=" + dataUltimaAtualizacao
				+ ", email=" + email + ", matricula=" + matricula + ", logins="
				+ logins + "]";
	}
	
	
	

}
