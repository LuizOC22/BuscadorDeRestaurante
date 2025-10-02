package com.example.BuscadorDeRestaurantes.model;

public class Restaurantes {

    private String nome;
    private double avaliacao;
    private String preco;
    private double distancia;

    public Restaurantes(){}

    public Restaurantes(String nome, double avaliacao, String preco, double distancia) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.preco = preco;
        this.distancia = distancia;
    }

    public String getNome() {return nome; }
    public void setNome(String nome) { this.nome = nome;}

    public double getAvaliacao() {return avaliacao;}
    public void setAvaliacao(double avaliacao) {this.avaliacao = avaliacao; }

    public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }

    public double getDistancia() { return distancia; }
    public void setDistancia(double distancia) { this.distancia = distancia; }
}
