
public class Admins {
	private String nome_admin;
	private String cpf_admin;
	private String email_admin;
	private String senha_admin;
	private String telefone_admin;
	private String cargo_admin;
	
	public Admins(String nome_admin, String cpf_admin, String email_admin, String senha_admin, String telefone_admin, String cargo_admin) {
		super();
		this.nome_admin = nome_admin;
		this.cpf_admin = cpf_admin;
		this.email_admin = email_admin;
		this.senha_admin = senha_admin;
		this.telefone_admin = telefone_admin;
		this.cargo_admin = cargo_admin;
	}

	public String getNome_admin() {
		return nome_admin;
	}

	public void setNome_admin(String nome_admin) {
		this.nome_admin = nome_admin;
	}

	public String getCpf_admin() {
		return cpf_admin;
	}

	public void setCpf_admin(String cpf_admin) {
		this.cpf_admin = cpf_admin;
	}

	public String getEmail_admin() {
		return email_admin;
	}

	public void setEmail_admin(String email_admin) {
		this.email_admin = email_admin;
	}

	public String getSenha_admin() {
		return senha_admin;
	}

	public void setSenha_admin(String senha_admin) {
		this.senha_admin = senha_admin;
	}

	public String getTelefone_admin() {
		return telefone_admin;
	}

	public void setTelefone_admin(String telefone_admin) {
		this.telefone_admin = telefone_admin;
	}

	public String getCargo_admin() {
		return cargo_admin;
	}

	public void setCargo_admin(String cargo_admin) {
		this.cargo_admin = cargo_admin;
	}
}
