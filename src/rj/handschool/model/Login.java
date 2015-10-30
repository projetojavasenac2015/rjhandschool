package rj.handschool.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Login implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="IDLOGIN")
	private Integer idLogin;
	
	@Column(name="EMAIL",length=30,nullable=false)
	private String email;
	
	@Column(name="ATIVO",nullable=false)
	private Boolean ativo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_HORA_CADASTRO",nullable=false)
	private Calendar dataHoraCadastro;
	
	@Column(name="SENHA",length=32,nullable=false)
	private String senha;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ATUALIZACAO",nullable=false)
	private Calendar dataUltimaAtualizacao;

	@OneToOne
	@JoinColumn(name="IDPERFIL",referencedColumnName="idPerfil")
	private Perfil perfil;

	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="IDPESSOA",referencedColumnName="idPessoa")
	private Pessoa pessoa;
	
	public Integer getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}
	public String getMatricula() {
		return email;
	}
	public void setMatricula(String matricula) {
		this.email = matricula;
	}
	public Boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public Calendar getDataHoraCadastro() {
		return dataHoraCadastro;
	}
	public void setDataHoraCadastro(Calendar dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Calendar getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Calendar dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLogin == null) ? 0 : idLogin.hashCode());
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
		Login other = (Login) obj;
		if (idLogin == null) {
			if (other.idLogin != null)
				return false;
		} else if (!idLogin.equals(other.idLogin))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Login [idLogin=" + idLogin + ", email=" + email
				+ ", ativo=" + ativo + ", dataHoraCadastro=" + dataHoraCadastro
				+ ", senha=" + senha + ", dataUltimaAtualizacao="
				+ dataUltimaAtualizacao + ", perfil=" + perfil + ", pessoa="
				+ pessoa + "]";
	}
	
	


	
}
