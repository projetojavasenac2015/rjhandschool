package rj.handschool.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Perfil implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="IDPERFIL")
	private Integer idPerfil;
	
	@Column(name="NOME",length=50,nullable=false)
	private String nome;
	
	@Column(name="DESCRICAO",length=60,nullable=true)
	private String descricao;
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_HORA_CADASTRO")
	private Calendar dataHoraCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ATUALIZACAO")
	private Calendar dataUltimaAtualizacao;
	
	@OneToMany(mappedBy="perfil",fetch=FetchType.EAGER)
	private List<Acesso> acessos;
	
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	public Calendar getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Calendar dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	@Override
	public String toString() {
		return "Perfil [idPerfil=" + idPerfil + ", nome=" + nome
				+ ", descricao=" + descricao + ", ativo=" + ativo
				+ ", dataHoraCadastro=" + dataHoraCadastro
				+ ", dataUltimaAtualizacao=" + dataUltimaAtualizacao
				+ ", acessos=" + acessos + "]";
	}
	public List<Acesso> getAcessos() {
		return acessos;
	}
	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPerfil == null) ? 0 : idPerfil.hashCode());
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
		Perfil other = (Perfil) obj;
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		return true;
	}
	
	
}
