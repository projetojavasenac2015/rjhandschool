package rj.handschool.model;

public class Users {
	
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public TipoUsers getTipoUser() {
		return tipoUser;
	}
	public void setTipoUser(TipoUsers tipoUser) {
		this.tipoUser = tipoUser;
	}
	private String usuario;
	private String senha;
	private TipoUsers tipoUser;	
}
