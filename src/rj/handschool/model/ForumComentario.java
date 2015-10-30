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
@Table(name="forum_comentario")
public class ForumComentario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="IDFORUM_COMENTARIO")
	private Integer idForumComentario;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="IDLOGIN",referencedColumnName="idLogin")
	private Login login;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="IDFORUM",referencedColumnName="idForum")
	private Forum forum;

	@Column(name="COMENTARIO",length=200,nullable=false)
	private String comentario;
	
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name="DATA_HORA_CADASTRO",nullable=false)
	private Calendar dataHoraCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ATUALIZACAO",nullable=false)
	private Calendar dataUltimaAtualizacao;
	
	@Column(name="ATIVO")
	private Boolean ativo;

	public Integer getIdForumComentario() {
		return idForumComentario;
	}

	public void setIdForumComentario(Integer idForumComentario) {
		this.idForumComentario = idForumComentario;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((idForumComentario == null) ? 0 : idForumComentario
						.hashCode());
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
		ForumComentario other = (ForumComentario) obj;
		if (idForumComentario == null) {
			if (other.idForumComentario != null)
				return false;
		} else if (!idForumComentario.equals(other.idForumComentario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ForumComentario [idForumComentario=" + idForumComentario
				+ ", login=" + login + ", forum=" + forum + ", comentario="
				+ comentario + ", dataHoraCadastro=" + dataHoraCadastro
				+ ", dataUltimaAtualizacao=" + dataUltimaAtualizacao
				+ ", ativo=" + ativo + "]";
	}

	
	
}
