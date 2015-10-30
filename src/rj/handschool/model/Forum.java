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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="forum")
public class Forum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="IDFORUM")
	private Integer idForum;
	
	@Column(name="ASSUNTO",length=60,nullable=false)
	private String assunto;
	
	@Column(name="DESCRICAO",length=200,nullable=true)
	private String descricao;
	
	@Column(name="IDCURSO",length=30,nullable=true)
	private String idCurso;
	
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name="DATA_HORA_CADASTRO",nullable=false)
	private Calendar dataHoraCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ATUALIZACAO",nullable=false)
	private Calendar dataUltimaAtualizacao;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="IDLOGIN",referencedColumnName="idLogin")
	private Login login;

	public Integer getIdForum() {
		return idForum;
	}

	public void setIdForum(Integer idForum) {
		this.idForum = idForum;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idForum == null) ? 0 : idForum.hashCode());
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
		Forum other = (Forum) obj;
		if (idForum == null) {
			if (other.idForum != null)
				return false;
		} else if (!idForum.equals(other.idForum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Forum [idForum=" + idForum + ", assunto=" + assunto
				+ ", descricao=" + descricao + ", idCurso=" + idCurso
				+ ", dataHoraCadastro=" + dataHoraCadastro
				+ ", dataUltimaAtualizacao=" + dataUltimaAtualizacao
				+ ", login=" + login + "]";
	}

	
	
}
