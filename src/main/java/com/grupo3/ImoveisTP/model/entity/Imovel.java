package com.grupo3.ImoveisTP.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@AllArgsConstructor
@Data
public class Imovel {
    @NotNull
    private Integer id;
    @NotNull
    private TipoImovel tipoImovel;
    private Casa casa;
    private Apartamento apartamento;
    @NotNull
    private Endereco endereco;
    @Positive
    private double valorAluguel;

    public Imovel()
    {
        if(this.tipoImovel == TipoImovel.CASA)
        {
            this.apartamento = null;
        }
        else
        {
            this.casa = null;
        }
    }

}
