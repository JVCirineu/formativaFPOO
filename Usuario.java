package formativaFpoo;

public class Usuario {
	private int id;
	private String nome;
	private int password;
	private String permissao;
	private String usuario;
	
	public Usuario() {} //sem argumento
	
	public Usuario(int id, String nome, int password, String permissao, String usuario) { 
		this.id = id;
		this.nome = nome;
		this.password = password;							// com argumento
		this.permissao = permissao;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
}
