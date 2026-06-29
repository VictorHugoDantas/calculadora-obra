package com.obra.calculadora.service;

import com.obra.calculadora.model.Parede;
import com.obra.calculadora.model.dto.FundacaoRequestDTO;
import com.obra.calculadora.repository.ParedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundacaoService {

    @Autowired
    private ParedeRepository paredeRepository;

    public double calcularVolumeConcreto(FundacaoRequestDTO request) {
        List<Parede> paredes = paredeRepository.findAllById(request.getParedeIds());

        double volumeTotal = 0;

        for (Parede parede : paredes) {
            double volume = parede.getLargura()
                    * request.getAlturaViga()
                    * parede.getComprimento();
            volumeTotal += volume;
        }

        return volumeTotal;
    }
}