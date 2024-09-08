package com.grupo3.ImoveisTP.controller;

import com.grupo3.ImoveisTP.model.entity.Imovel;
import com.grupo3.ImoveisTP.model.service.ImovelService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/imoveis")
public class ImovelController {

    private final ImovelService imovelService;

    @GetMapping("")
    List<Imovel> findAll() {

        return imovelService.listarTodos();

    }

    @GetMapping("/{id}")
    Imovel findById(@PathVariable Integer id) {

        return imovelService.buscarPorId(id);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {

        imovelService.deletarImovel(id);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void save(@Valid @RequestBody Imovel imovel) {

        imovelService.salvarImovel(imovel);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @PathVariable Integer id, @RequestBody Imovel imovel) {

        imovelService.atualizarImovel(id, imovel);

    }
}
