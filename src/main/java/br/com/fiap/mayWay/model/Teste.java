package br.com.fiap.mayWay.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "tbl_myWay")
public class Teste {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_TBL_GAMES"
    )
    @SequenceGenerator(
            name = "SEQ_TBL_GAMES",
            sequenceName = "SEQ_TBL_GAMES",
            allocationSize = 1
    )
    private Long id;


    private String titulo;
    private Double valor;
    private String Produtora;
    private  Boolean finalizado;

    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;



    public Teste() {}

    public Teste(Long id, String titulo, Double valor, String produtora, Boolean finalizado, LocalDate dataLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        Produtora = produtora;
        this.finalizado = finalizado;
        this.dataLancamento = dataLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getProdutora() {
        return Produtora;
    }

    public void setProdutora(String produtora) {
        Produtora = produtora;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
