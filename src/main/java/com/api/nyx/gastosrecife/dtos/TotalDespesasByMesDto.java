package com.api.nyx.gastosrecife.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class TotalDespesasByMesDto {

    @Schema(description = "Ano da despesa", example = "2017")
    private int ano;
    @Schema(description = "Mês da despesa", example = "1")
    private int mes;
    @Schema(description = "Total de empenho", example = "858758413.92")
    private BigDecimal empenho;
    @Schema(description = "Total de liquidação", example = "170792698.04")
    private BigDecimal liquidacao;
    @Schema(description = "Total de pagamento", example = "146112193.79")
    private BigDecimal pagamento;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
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
}
