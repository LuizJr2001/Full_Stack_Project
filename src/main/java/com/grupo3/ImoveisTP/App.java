package com.grupo3.ImoveisTP;

import com.grupo3.ImoveisTP.model.entity.Endereco;
import com.grupo3.ImoveisTP.model.entity.Imovel;
import com.grupo3.ImoveisTP.model.entity.TipoImovel;
import com.grupo3.ImoveisTP.model.factory.CasaFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        log.info("Aplicação iniciada com sucesso!");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.info("Imóvel: {}", Imovel.builder()
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
        };

    }


}
