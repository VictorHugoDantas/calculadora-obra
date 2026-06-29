package com.obra.calculadora.model.dto;

import java.util.List;

public class TijoloRequestDTO {

    private List<Long> paredeIds;
    private double comprimentoTijolo; // em metros
    private double alturaTijolo;      // em metros
    private double larguraTijolo;     // em metros

    public List<Long> getParedeIds() { return paredeIds; }
    public void setParedeIds(List<Long> paredeIds) { this.paredeIds = paredeIds; }
    public double getComprimentoTijolo() { return comprimentoTijolo; }
    public void setComprimentoTijolo(double comprimentoTijolo) { this.comprimentoTijolo = comprimentoTijolo; }
    public double getAlturaTijolo() { return alturaTijolo; }
    public void setAlturaTijolo(double alturaTijolo) { this.alturaTijolo = alturaTijolo; }
    public double getLarguraTijolo() { return larguraTijolo; }
    public void setLarguraTijolo(double larguraTijolo) { this.larguraTijolo = larguraTijolo; }
}