package com.obra.calculadora.model.dto;

import java.util.List;

public class FundacaoRequestDTO {

    private List<Long> paredeIds;
    private double alturaViga;

    public List<Long> getParedeIds() { return paredeIds; }
    public void setParedeIds(List<Long> paredeIds) { this.paredeIds = paredeIds; }
    public double getAlturaViga() { return alturaViga; }
    public void setAlturaViga(double alturaViga) { this.alturaViga = alturaViga; }
}