package com.obra.calculadora.controller;

import com.obra.calculadora.model.dto.TijoloRequestDTO;
import com.obra.calculadora.service.TijoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tijolos")
public class TijoloController {

    @Autowired
    private TijoloService tijoloService;

    @PostMapping("/calcular-tijolos")
    public long calcularTijolos(@RequestBody TijoloRequestDTO request) {
        return tijoloService.calcularTijolos(request);
    }
}