public class ClientesEDependentes {
	private String id;
	private String nomeCompleto;
	private String idade;
	private String genero;
	private String deficiencia;
	
	public ClientesEDependentes() {
		super();
	}

	public ClientesEDependentes(String id, String nomeCompleto, String idade, String genero, String deficiencia) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.genero = genero;
		this.deficiencia = deficiencia;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDeficiencia() {
		return deficiencia;
	}

	public void setDeficiencia(String deficiencia) {
		this.deficiencia = deficiencia;
	}
}
