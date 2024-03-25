package SistemaContrato;

public class Funcionario {
    private String nome;
    private TipoDeDocumento documento;
    private String numeroDocumento;
	public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
		super();
		this.nome = nome;
		this.documento = documento;
		this.numeroDocumento = numeroDocumento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoDeDocumento getDocumento() {
		return documento;
	}
	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}
