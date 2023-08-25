public class ResumoDia {
	int refeicoesVendidas;
	int clientesCadastrados;
	String data;
	
	public ResumoDia() {
		super();
	}

	public ResumoDia(int refeicoesVendidas, int clientesCadastrados, String data) {
		super();
		this.refeicoesVendidas = refeicoesVendidas;
		this.clientesCadastrados = clientesCadastrados;
		this.data = data;
	}

	public int getRefeicoesVendidas() {
		return refeicoesVendidas;
	}

	public void setRefeicoesVendidas(int refeicoesVendidas) {
		this.refeicoesVendidas = refeicoesVendidas;
	}

	public int getClientesCadastrados() {
		return clientesCadastrados;
	}

	public void setClientesCadastrados(int clientesCadastrados) {
		this.clientesCadastrados = clientesCadastrados;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
