package com.grupo3.ImoveisTP.model.entity;

import lombok.*;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class Apartamento {
    private int qtdQuartos;
    private int qtdSuites;
    private int qtdSalas;
    private int qtdSalasDeEstar;
    private int qtdVagasGaragem;
    private double area;
    private boolean armarioEmbutido;
    private String descricao;
    private char andar;
    private double valorCondominio;
    private boolean portaria24h;
}
