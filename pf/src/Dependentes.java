
public class Dependentes {
	private String idDependente;
	private String nomeCompletoDependente;
	private String idadeDependente;
	private String genero;
	private String deficiencia;
	private String dependencia;
	
	public Dependentes() {
		super();
	}

	public Dependentes(String idDependente, String nomeCompletoDependente, String idadeDependente, String genero,
			String deficiencia, String dependencia) {
		super();
		this.idDependente = idDependente;
		this.nomeCompletoDependente = nomeCompletoDependente;
		this.idadeDependente = idadeDependente;
		this.genero = genero;
		this.deficiencia = deficiencia;
		this.dependencia = dependencia;
	}

	public String getIdDependente() {
		return idDependente;
	}

	public void setIdDependente(String idDependente) {
		this.idDependente = idDependente;
	}

	public String getNomeCompletoDependente() {
		return nomeCompletoDependente;
	}

	public void setNomeCompletoDependente(String nomeCompletoDependente) {
		this.nomeCompletoDependente = nomeCompletoDependente;
	}

	public String getIdadeDependente() {
		return idadeDependente;
	}

	public void setIdadeDependente(String idadeDependente) {
		this.idadeDependente = idadeDependente;
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

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
}
