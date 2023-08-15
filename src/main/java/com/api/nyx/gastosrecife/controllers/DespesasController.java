package com.api.nyx.gastosrecife.controllers;

import com.api.nyx.gastosrecife.dtos.*;
import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.services.DespesasService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/despesas")
@Tag(name = "Despesas", description = "API para listar as despesas de Recife")
public class DespesasController {

    final DespesasService despesasService;

    public DespesasController(DespesasService despesasService) {
        this.despesasService = despesasService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Permite o cadastro de um novo registro de despesa", method = "POST")
    public ResponseEntity<DespesasModel> saveDespesa(@RequestBody @Valid DespesasDto despesasDto) {
        var despesaModel = new DespesasModel();
        BeanUtils.copyProperties(despesasDto, despesaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(despesasService.save(despesaModel));
    }

    @GetMapping("/{ano}/total")
    @ResponseStatus(HttpStatus.OK)
    @Parameter(name = "ano", description = "Ano da despesa", required = true, example = "2017")
    @Operation(summary = "Retorna o total de despesas de um ano", method = "GET")
    public ResponseEntity<List<TotalDespesasByAnoDto>> getTotalDespesasByAno(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAno(ano));
    }

    @GetMapping("/{ano}/categoria")
    @ResponseStatus(HttpStatus.OK)
    @Parameter(name = "ano", description = "Ano da despesa", required = true, example = "2017")
    @Operation(summary = "Retorna o total de despesas de um ano agrupado por categoria", method = "GET")
    public ResponseEntity<List<TotalDespesasByCategoriaDto>> getTotalDespesasByAnoGroupByCategoriaEconomica(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByCategoriaEconomica(ano));
    }

    @GetMapping("/{ano}/mes")
    @ResponseStatus(HttpStatus.OK)
    @Parameter(name = "ano", description = "Ano da despesa", required = true, example = "2017")
    @Operation(summary = "Retorna o total de despesas de um ano agrupado por mês", method = "GET")
    public ResponseEntity<List<TotalDespesasByMesDto>> getTotalDespesasByAnoGroupByMesMovimentacao(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByMesMovimentacao(ano));
    }

    @GetMapping("/{ano}/fonte")
    @ResponseStatus(HttpStatus.OK)
    @Parameter(name = "ano", description = "Ano da despesa", required = true, example = "2017")
    @Operation(summary = "Retorna o total de despesas de um ano agrupado por fonte de recurso", method = "GET")
    public ResponseEntity<List<TotalDespesasByFonteDto>> getTotalDespesasByAnoGroupByFonteRecurso(@PathVariable int ano) {
        return ResponseEntity.status(HttpStatus.OK).body(despesasService.getTotalDespesasByAnoGroupByFonteRecurso(ano));
    }

}
