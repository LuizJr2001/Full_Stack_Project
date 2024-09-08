package com.grupo3.ImoveisTP.model.service;

import com.grupo3.ImoveisTP.model.entity.Imovel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ImovelRepository {

    private final JdbcClient jdbcClient;

    //private static final String INSERT = "INSERT INTO imovel (tipo_imovel, casa, apartamento, endereco, valor_aluguel) VALUES (?, ?, ?, ?, ?)";

    List<Imovel> findAll()
    {
        return jdbcClient.sql("SELECT * FROM imovel")
                .query(Imovel.class)
                .list();
    }
}
