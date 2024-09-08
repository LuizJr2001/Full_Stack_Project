package com.grupo3.ImoveisTP.model.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ImovelNotFoundException extends RuntimeException {
    public ImovelNotFoundException() {
        super("Imóvel não encontrado");
    }
}
