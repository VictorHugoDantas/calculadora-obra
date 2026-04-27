package com.obra.calculadora.controller;

import com.obra.calculadora.model.dto.FundacaoRequestDTO;
import com.obra.calculadora.service.FundacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fundacao")
public class FundacaoController {

    @Autowired
    private FundacaoService fundacaoService;

    @PostMapping("/calcular-concreto")
    public double calcularConcreto(@RequestBody FundacaoRequestDTO request) {
        return fundacaoService.calcularVolumeConcreto(request);
    }
}