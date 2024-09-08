package com.grupo3.ImoveisTP.model.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Endereco {
    @NotNull
    private final Integer numero;
    @NotEmpty
    private final String rua;
    @NotEmpty
    private final String bairro;
    private final String descricao;
}
