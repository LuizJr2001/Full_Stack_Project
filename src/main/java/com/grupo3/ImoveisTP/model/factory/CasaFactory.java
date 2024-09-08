package com.grupo3.ImoveisTP.model.factory;

import com.grupo3.ImoveisTP.model.entity.Casa;

public class CasaFactory {
    public static Casa criarCasa(
            int qtdQuartos,
            int qtdSuites,
            int qtdSalas,
            int qtdSalasDeEstar,
            int qtdVagasGaragem,
            double area,
            boolean armarioEmbutido,
            String descricao) {
        return Casa.builder()
                .qtdQuartos(qtdQuartos)
                .qtdSuites(qtdSuites)
                .qtdSalas(qtdSalas)
                .qtdSalasDeEstar(qtdSalasDeEstar)
                .qtdVagasGaragem(qtdVagasGaragem)
                .area(area)
                .armarioEmbutido(armarioEmbutido)
                .descricao(descricao)
                .build();
    }
}
