package com.obra.calculadora.service;

import com.obra.calculadora.model.Parede;
import com.obra.calculadora.model.dto.TijoloRequestDTO;
import com.obra.calculadora.repository.ParedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TijoloService {

    @Autowired
    private ParedeRepository paredeRepository;

    private static final double ESPESSURA_ARGAMASSA = 0.01; // 1cm

    public long calcularTijolos(TijoloRequestDTO request) {
        List<Parede> paredes = paredeRepository.findAllById(request.getParedeIds());

        double areaTotal = 0;

        for (Parede parede : paredes) {
            double areaBruta = parede.getComprimento() * parede.getAltura();

            double areaJanela = 0;
            if (parede.isTemJanela()) {
                areaJanela = parede.getComprimentoJanela() * parede.getAlturaJanela();
            }

            double areaPorta = 0;
            if (parede.isTemPorta()) {
                areaPorta = parede.getComprimentoPorta() * parede.getAlturaPorta();
            }

            double areaLiquida = areaBruta - areaJanela - areaPorta;
            areaTotal += areaLiquida;
        }

        double areaTijolo = (request.getComprimentoTijolo() + ESPESSURA_ARGAMASSA)
                * (request.getAlturaTijolo() + ESPESSURA_ARGAMASSA);

        return (long) Math.ceil(areaTotal / areaTijolo);
    }
}