package com.grupo3.ImoveisTP.model.factory;

import com.grupo3.ImoveisTP.model.entity.Apartamento;

public class ApartamentoFactory {
    public Apartamento criarApartamento(
            int qtdQuartos,
            int qtdSuites,
            int qtdSalas,
            int qtdVagasGaragem,
            double area,
            boolean armarioEmbutido,
            String descricao) {
        return Apartamento.builder()
                .qtdQuartos(qtdQuartos)
                .qtdSuites(qtdSuites)
                .qtdSalas(qtdSalas)
                .qtdVagasGaragem(qtdVagasGaragem)
                .area(area)
                .armarioEmbutido(armarioEmbutido)
                .descricao(descricao)
                .build();
    }
}
