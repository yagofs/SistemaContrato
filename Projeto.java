package SistemaContrato;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
    private String nome;
    private Date dt_inicio;
    private Date dt_termino;
    private List<Contratacao> contratacoes;

    public Projeto(String nome, Date dt_inicio, Date dt_termino) {
        this.nome = nome;
        this.dt_inicio = dt_inicio;
        this.dt_termino = dt_termino;
        this.contratacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_termino() {
        return dt_termino;
    }

    public void setDt_termino(Date dt_termino) {
        this.dt_termino = dt_termino;
    }

    public List<Contratacao> getContratacoes() {
        return contratacoes;
    }

    public void adicionarContratacao(Contratacao contratacao) {
        this.contratacoes.add(contratacao);
    }

    public void listarContratacoes() {
        System.out.println("Contratações do projeto " + nome + ":");
        for (Contratacao contratacao : contratacoes) {
            System.out.println(contratacao);
        }
    }
}
