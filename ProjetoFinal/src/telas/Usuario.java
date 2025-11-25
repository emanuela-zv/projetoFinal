package telas;

public class Usuario {
	
	private String usuario;
	private String senha;
	private String msg;
	
	//construtor
	
	public Usuario(String usuario,String senha ) {
		this.usuario = usuario;
		this.senha = senha;
		
	//	this.msg = "Bem Vinda (o)";
	}

	public String getUsuario() {
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getmsg() {
		return msg;
		
	}
	
	
	
	
}
