package com.obra.calculadora.model;

import jakarta.persistence.*;

@Entity
public class Parede {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;         // Ex: "a12"
    private double comprimento;  // Em metros
    private double largura;      // Espessura da parede
    private double altura;       // Altura da parede

    private boolean temJanela;
    private double alturaJanela;
    private double comprimentoJanela;

    private boolean temPorta;
    private double alturaPorta;
    private double comprimentoPorta;

    // Vértice de origem e destino (os pilares que a parede conecta)
    @ManyToOne
    private Vertice verticeOrigem;

    @ManyToOne
    private Vertice verticeDestino;

    // Gere todos os Getters e Setters aqui
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getComprimento() { return comprimento; }
    public void setComprimento(double comprimento) { this.comprimento = comprimento; }
    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    public boolean isTemJanela() { return temJanela; }
    public void setTemJanela(boolean temJanela) { this.temJanela = temJanela; }
    public double getAlturaJanela() { return alturaJanela; }
    public void setAlturaJanela(double alturaJanela) { this.alturaJanela = alturaJanela; }
    public double getComprimentoJanela() { return comprimentoJanela; }
    public void setComprimentoJanela(double comprimentoJanela) { this.comprimentoJanela = comprimentoJanela; }
    public boolean isTemPorta() { return temPorta; }
    public void setTemPorta(boolean temPorta) { this.temPorta = temPorta; }
    public double getAlturaPorta() { return alturaPorta; }
    public void setAlturaPorta(double alturaPorta) { this.alturaPorta = alturaPorta; }
    public double getComprimentoPorta() { return comprimentoPorta; }
    public void setComprimentoPorta(double comprimentoPorta) { this.comprimentoPorta = comprimentoPorta; }
    public Vertice getVerticeOrigem() { return verticeOrigem; }
    public void setVerticeOrigem(Vertice verticeOrigem) { this.verticeOrigem = verticeOrigem; }
    public Vertice getVerticeDestino() { return verticeDestino; }
    public void setVerticeDestino(Vertice verticeDestino) { this.verticeDestino = verticeDestino; }
}