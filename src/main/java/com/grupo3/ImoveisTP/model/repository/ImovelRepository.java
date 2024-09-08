package com.grupo3.ImoveisTP.model.repository;

import com.grupo3.ImoveisTP.model.entity.Imovel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository {

    List<Imovel> findAll();

    Imovel findById(Integer id);

    void delete(Integer id);

    void update(Integer id, Imovel imovel);

    void save(Imovel imovel);

}
