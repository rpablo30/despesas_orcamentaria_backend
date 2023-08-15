package com.api.nyx.gastosrecife.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class TotalDespesasByCategoriaDto {

    @Schema(description = "Ano da despesa", example = "2017")
    private int ano;
    @Schema(description = "Total de empenho", example = "3982360085.04")
    private BigDecimal empenho;
    @Schema(description = "Total de liquidação", example = "3953188131.84")
    private BigDecimal liquidacao;
    @Schema(description = "Total de pagamento", example = "3928762667.21")
    private BigDecimal pagamento;
    @Schema(description = "Código da categoria", example = "3")
    private String categoriaCodigo;
    @Schema(description = "Nome da categoria", example = "DESPESAS CORRENTES")
    private String categoriaNome;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public BigDecimal getEmpenho() {
        return empenho;
    }

    public void setEmpenho(BigDecimal empenho) {
        this.empenho = empenho;
    }

    public BigDecimal getLiquidacao() {
        return liquidacao;
    }

    public void setLiquidacao(BigDecimal liquidacao) {
        this.liquidacao = liquidacao;
    }

    public BigDecimal getPagamento() {
        return pagamento;
    }

    public void setPagamento(BigDecimal pagamento) {
        this.pagamento = pagamento;
    }

    public String getCategoriaCodigo() {
        return categoriaCodigo;
    }

    public void setCategoriaCodigo(String categoriaCodigo) {
        this.categoriaCodigo = categoriaCodigo;
    }

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }
}
