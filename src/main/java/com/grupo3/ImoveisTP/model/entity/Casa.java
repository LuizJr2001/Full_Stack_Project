package com.grupo3.ImoveisTP.model.entity;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Casa {
    private int qtdQuartos;
    private int qtdSuites;
    private int qtdSalas;
    private int qtdSalasDeEstar;
    private int qtdVagasGaragem;
    private double area;
    private boolean armarioEmbutido;
    private String descricao;
}
