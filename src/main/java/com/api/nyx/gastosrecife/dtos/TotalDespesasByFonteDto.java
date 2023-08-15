package com.api.nyx.gastosrecife.dtos;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;

public class TotalDespesasByFonteDto {

    @Schema(description = "Ano da despesa", example = "2017")
    private int ano;
    @Schema(description = "Total de empenho", example = "1893349432.43")
    private BigDecimal empenho;
    @Schema(description = "Total de liquidação", example = "1872677085.46")
    private BigDecimal liquidacao;
    @Schema(description = "Total de pagamento", example = "1895206352.25")
    private BigDecimal pagamento;
    @Schema(description = "Código da fonte", example = "100")
    private String fonteCodigo;
    @Schema(description = "Nome da fonte", example = "RECURSOS ORDINÁRIOS - NÃO VINCULADOS")
    private String fonteNome;

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

    public String getFonteCodigo() {
        return fonteCodigo;
    }

    public void setFonteCodigo(String fonteCodigo) {
        this.fonteCodigo = fonteCodigo;
    }

    public String getFonteNome() {
        return fonteNome;
    }

    public void setFonteNome(String fonteNome) {
        this.fonteNome = fonteNome;
    }
}
