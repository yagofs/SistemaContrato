package SistemaContrato;

public enum TipoDeDocumento {
    RG("Registro Geral"),
    CPF("Cadastro de Pessoa Física"),
    CNPJ("Cadastro Nacional da Pessoa Jurídica");

    private String descricao;

    TipoDeDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
