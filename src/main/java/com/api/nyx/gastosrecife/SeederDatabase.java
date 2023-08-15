package com.api.nyx.gastosrecife;

import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.repositories.DespesasRepository;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class SeederDatabase {
    final DespesasRepository despesasRepository;

    public SeederDatabase(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }

    @PostConstruct
    public void seedDespesas() {

        long qtd = despesasRepository.count();

        if (qtd != 0) return;
        System.out.println("Iniciando a carga de dados...");

        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/despesas.csv"))) {
            List<DespesasModel> despesasList = new CsvToBeanBuilder<DespesasModel>(reader)
                    .withType(DespesasModel.class)
                    .withSkipLines(10) // pula a linha de cabeçalho, se houver
                    .build()
                    .parse();

            despesasRepository.saveAll(despesasList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
