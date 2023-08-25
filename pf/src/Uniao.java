
public class Uniao {

	private String nomeCompletoUniao;
	private String cpfUniao;
	private String rua;
	private String bairro;
	private String cidade;
	private String telefone;
	
	public Uniao() {
		super();
	}

	public Uniao(String nomeCompletoUniao, String cpfUniao, String rua, String bairro, String cidade, String telefone) {
		super();
		this.nomeCompletoUniao = nomeCompletoUniao;
		this.cpfUniao = cpfUniao;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	public String getNomeCompletoUniao() {
		return nomeCompletoUniao;
	}

	public void setNomeCompletoUniao(String nomeCompletoUniao) {
		this.nomeCompletoUniao = nomeCompletoUniao;
	}

	public String getCpfUniao() {
		return cpfUniao;
	}

	public void setCpfUniao(String cpfUniao) {
		this.cpfUniao = cpfUniao;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
