package com.grupo3.ImoveisTP.model.service;

import com.grupo3.ImoveisTP.model.Exception.ImovelNotFoundException;
import com.grupo3.ImoveisTP.model.entity.Endereco;
import com.grupo3.ImoveisTP.model.entity.Imovel;
import com.grupo3.ImoveisTP.model.entity.TipoImovel;
import com.grupo3.ImoveisTP.model.factory.CasaFactory;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImovelService {

    private final List<Imovel> imoveis = new ArrayList<>();

    private final ImovelRepository imovelRepository;

    public List<Imovel> listarTodos() {

        if(imoveis.isEmpty()) {
            throw new ImovelNotFoundException();
        }
        else
            return imovelRepository.findAll();

    }

    public Imovel buscarPorId(Integer id) {

        return imoveis.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst()
                .orElseThrow(ImovelNotFoundException::new);

    }

    public void salvarImovel(@RequestBody Imovel imovel) {
        imoveis.add(imovel);
    }

    public void deletarImovel(Integer id) {
        Imovel imovel = buscarPorId(id);
        imoveis.remove(imovel);
    }

    public void atualizarImovel(Integer id, @RequestBody Imovel imovel) {
        Imovel imovelExistente = buscarPorId(id);
        imoveis.set(imoveis.indexOf(imovelExistente), imovel);

    }

    @PostConstruct
    private void init() {
        imoveis.add(Imovel.builder()
                .id(1)
                .tipoImovel(TipoImovel.CASA)
                .casa(CasaFactory.criarCasa(3, 2, 2, 1, 2, 100.0, true, "Casa com armários embutidos"))
                .endereco(Endereco.builder()
                        .numero(1)
                        .rua("Rua 1")
                        .bairro("Bairro 1")
                        .build())
                .valorAluguel(1000.0)
                .build());

        imoveis.add(Imovel.builder()
                .id(2)
                .tipoImovel(TipoImovel.CASA)
                .casa(CasaFactory.criarCasa(2, 1, 1, 1, 1, 50.0, false, "Casa simples"))
                .endereco(Endereco.builder()
                        .numero(2)
                        .rua("Rua 2")
                        .bairro("Bairro 2")
                        .build())
                .valorAluguel(500.0)
                .build());
    }

}
