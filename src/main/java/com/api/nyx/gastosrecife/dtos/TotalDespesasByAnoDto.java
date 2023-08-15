package com.api.nyx.gastosrecife.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class TotalDespesasByAnoDto {

    @Schema(description = "Ano da despesa", example = "2017")
    private int ano;
    @Schema(description = "Total de empenho", example = "4244799021.93")
    private BigDecimal empenho;
    @Schema(description = "Total de liquidação", example = "4216154745.82")
    private BigDecimal liquidacao;
    @Schema(description = "Total de pagamento", example = "4189772038.26")
    private BigDecimal pagamento;

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
}
