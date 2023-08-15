package com.api.nyx.gastosrecife.services;

import com.api.nyx.gastosrecife.dtos.TotalDespesasByAnoDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByCategoriaDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByFonteDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByMesDto;
import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.repositories.DespesasRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DespesasService {

    final DespesasRepository despesasRepository;

    public DespesasService(DespesasRepository despesasRepository) {
        this.despesasRepository = despesasRepository;
    }

    @Transactional
    public DespesasModel save(DespesasModel despesaModel) {
        return despesasRepository.save(despesaModel);
    }

    public List<TotalDespesasByAnoDto> getTotalDespesasByAno(int ano){
        var query = despesasRepository.getTotalDespesasByAno(ano);
        List<TotalDespesasByAnoDto> despesas = new java.util.ArrayList<>();

        for(var info: query) {
            var despesa = new TotalDespesasByAnoDto();
            despesa.setAno((Integer) info[0]);
            despesa.setEmpenho((BigDecimal) info[1]);
            despesa.setLiquidacao((BigDecimal) info[2]);
            despesa.setPagamento((BigDecimal) info[3]);
            despesas.add(despesa);

        }
        return despesas;
    }

    public List<TotalDespesasByCategoriaDto> getTotalDespesasByAnoGroupByCategoriaEconomica(int ano){
        var query = despesasRepository.getTotalDespesasByAnoGroupByCategoriaEconomica(ano);

        List<TotalDespesasByCategoriaDto> despesas = new java.util.ArrayList<>();

        for(var info: query) {
            var despesa = new TotalDespesasByCategoriaDto();
            despesa.setAno((Integer) info[0]);
            despesa.setCategoriaCodigo((String) info[1]);
            despesa.setCategoriaNome((String) info[2]);
            despesa.setEmpenho((BigDecimal) info[3]);
            despesa.setLiquidacao((BigDecimal) info[4]);
            despesa.setPagamento((BigDecimal) info[5]);
            despesas.add(despesa);
        }
        return despesas;
    }

    public List<TotalDespesasByMesDto> getTotalDespesasByAnoGroupByMesMovimentacao(int ano){
        var query =  despesasRepository.getTotalDespesasByAnoGroupByMesMovimentacao(ano);
        List<TotalDespesasByMesDto> despesas = new java.util.ArrayList<>();

        for(var info: query) {
            var despesa = new TotalDespesasByMesDto();
            despesa.setAno((Integer) info[0]);
            despesa.setMes((Integer) info[1]);
            despesa.setEmpenho((BigDecimal) info[2]);
            despesa.setLiquidacao((BigDecimal) info[3]);
            despesa.setPagamento((BigDecimal) info[4]);
            despesas.add(despesa);
        }
        return despesas;
    }

    public List<TotalDespesasByFonteDto> getTotalDespesasByAnoGroupByFonteRecurso(int ano){
        var query =  despesasRepository.getTotalDespesasByAnoGroupByFonteRecurso(ano);
        List<TotalDespesasByFonteDto> despesas = new java.util.ArrayList<>();

        for(var info: query) {
            var despesa = new TotalDespesasByFonteDto();
            despesa.setAno((Integer) info[0]);
            despesa.setFonteCodigo((String) info[1]);
            despesa.setFonteNome((String) info[2]);
            despesa.setEmpenho((BigDecimal) info[3]);
            despesa.setLiquidacao((BigDecimal) info[4]);
            despesa.setPagamento((BigDecimal) info[5]);
            despesas.add(despesa);
        }
        return despesas;
    }
}
