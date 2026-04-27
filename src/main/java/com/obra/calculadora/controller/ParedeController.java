package com.obra.calculadora.controller;

import com.obra.calculadora.model.Parede;
import com.obra.calculadora.repository.ParedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/paredes")
public class ParedeController {

    @Autowired
    private ParedeRepository paredeRepository;

    @PostMapping          // ← salvar uma parede
    public Parede salvar(@RequestBody Parede parede) {
        return paredeRepository.save(parede);
    }

    @GetMapping           // ← listar todas as paredes (essa linha que provavelmente falta!)
    public List<Parede> listar() {
        return paredeRepository.findAll();
    }
}