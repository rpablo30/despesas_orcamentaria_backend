package com.api.nyx.gastosrecife.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class DespesasDto {

    @Schema(description = "Ano da Movimentação", example = "2017")
    private int anoMovimentacao;
    @Schema(description = "Mês da Movimentação", example = "1")
    private int mesMovimentacao;
    @NotBlank
    @Size(max = 3)
    @Schema(description = "Código do Orgão", example = "10")
    private String orgaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do órgão", example = "GABINETE DO PREFEITO")
    private String orgaoNome;
    @NotBlank
    @Size(max = 6)
    @Schema(description = "Código da unidade", example = "101")
    private String unidadeCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da unidade", example = "GABINETE DO PREFEITO")
    private String unidadeNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código da categoria econômica", example = "3")
    private String categoriaEconomicaCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da categoria econômica", example = "DESPESAS CORRENTES")
    private String categoriaEconomicaNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código do Grupo da despesa", example = "1")
    private String grupoDespesaCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do Grupo da despesa", example = "PESSOAL E ENCARGOS SOCIAIS")
    private String grupoDespesaNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código da modalidade da despesa", example = "90")
    private String modalidadeAplicacaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da modalidade da despesa", example = "RESERVA DE CONTINGÊNCIA")
    private String modalidadeAplicacaoNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código do elemento da despesa", example = "3")
    private String elementoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do elemento da despesa", example = "OUTROS SERVIÇOS DE TERCEIROS - PESSOA JURÍDICA")
    private String elementoNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código do subelemento da despesa", example = "4")
    private String subelementoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do subelemento da despesa", example = "SERVIÇOS DE CONSULTORIA")
    private String subelementoNome;
    @NotBlank
    @Size(max = 2)
    @Schema(description = "Código da modalidade de aplicação", example = "90")
    private String funcaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da modalidade de aplicação", example = "RESERVA DE CONTINGÊNCIA")
    private String funcaoNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "Código da subfunção", example = "122")
    private String subfuncaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da subfunção", example = "ADMINISTRAÇÃO GERAL")
    private String subfuncaoNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "Código do programa", example = "122")
    private String programaCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do programa", example = "ADMINISTRAÇÃO GERAL")
    private String programaNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "Código da ação", example = "122")
    private String acaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome da ação", example = "ADMINISTRAÇÃO GERAL")
    private String acaoNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "Código do programa de governo", example = "122")
    private String fonteRecursoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do programa de governo", example = "ADMINISTRAÇÃO GERAL")
    private String fonteRecursoNome;

    @Schema(description = "Código do empenho", example = "2017")
    private int empenhoAno;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "Nome do empenho", example = "SEM TIPO INFORMADO")
    private String empenhoModalidadeNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "Código da modalidade do empenho", example = "0")
    private String empenhoModalidadeCodigo;
    @NotBlank
    @Size(max = 6)
    @Schema(description = "Código do empenho", example = "43")
    private String empenhoNumero;
    @NotBlank
    @Size(max = 6)
    @Schema(description = "Código do empenho", example = "43")
    private String subempenho;
    @NotBlank
    @Size(max = 1)
    @Schema(description = "Indicador do Subempenho", example = "x")
    private String indicadorSubempenho;
    @NotBlank
    @Size(max = 8)
    @Schema(description = "Código do Credor", example = "1")
    private String credorCodigo;
    @NotBlank
    @Size(max =  150)
    @Schema(description = "Nome do Credor", example = "SEM NOME INFORMADO")
    private String credorNome;
    @NotBlank
    @Size(max = 4)
    @Schema(description = "modalidade da licitação", example = "0")
    private String modalidadeLicitacaoCodigo;
    @NotBlank
    @Size(max = 150)
    @Schema(description = "modalidade da licitação", example = "SEM MODALIDADE INFORMADA")
    private String modalidadeLicitacaoNome;

    @Schema(description = "Valor do Empenho", example = "160613.59")
    private BigDecimal valorEmpenhado;

    @Schema(description = "Valor da Liquidação", example = "160613.59")
    private BigDecimal valorLiquidado;

    @Schema(description = "Valor do Pagamento", example = "160613.59")
    private BigDecimal valorPago;

    public int getAnoMovimentacao() {
        return anoMovimentacao;
    }

    public void setAnoMovimentacao(int anoMovimentacao) {
        this.anoMovimentacao = anoMovimentacao;
    }

    public int getMesMovimentacao() {
        return mesMovimentacao;
    }

    public void setMesMovimentacao(int mesMovimentacao) {
        this.mesMovimentacao = mesMovimentacao;
    }

    public String getOrgaoCodigo() {
        return orgaoCodigo;
    }

    public void setOrgaoCodigo(String orgaoCodigo) {
        this.orgaoCodigo = orgaoCodigo;
    }

    public String getOrgaoNome() {
        return orgaoNome;
    }

    public void setOrgaoNome(String orgaoNome) {
        this.orgaoNome = orgaoNome;
    }

    public String getUnidadeCodigo() {
        return unidadeCodigo;
    }

    public void setUnidadeCodigo(String unidadeCodigo) {
        this.unidadeCodigo = unidadeCodigo;
    }

    public String getUnidadeNome() {
        return unidadeNome;
    }

    public void setUnidadeNome(String unidadeNome) {
        this.unidadeNome = unidadeNome;
    }

    public String getCategoriaEconomicaCodigo() {
        return categoriaEconomicaCodigo;
    }

    public void setCategoriaEconomicaCodigo(String categoriaEconomicaCodigo) {
        this.categoriaEconomicaCodigo = categoriaEconomicaCodigo;
    }

    public String getCategoriaEconomicaNome() {
        return categoriaEconomicaNome;
    }

    public void setCategoriaEconomicaNome(String categoriaEconomicaNome) {
        this.categoriaEconomicaNome = categoriaEconomicaNome;
    }

    public String getGrupoDespesaCodigo() {
        return grupoDespesaCodigo;
    }

    public void setGrupoDespesaCodigo(String grupoDespesaCodigo) {
        this.grupoDespesaCodigo = grupoDespesaCodigo;
    }

    public String getGrupoDespesaNome() {
        return grupoDespesaNome;
    }

    public void setGrupoDespesaNome(String grupoDespesaNome) {
        this.grupoDespesaNome = grupoDespesaNome;
    }

    public String getModalidadeAplicacaoCodigo() {
        return modalidadeAplicacaoCodigo;
    }

    public void setModalidadeAplicacaoCodigo(String modalidadeAplicacaoCodigo) {
        this.modalidadeAplicacaoCodigo = modalidadeAplicacaoCodigo;
    }

    public String getModalidadeAplicacaoNome() {
        return modalidadeAplicacaoNome;
    }

    public void setModalidadeAplicacaoNome(String modalidadeAplicacaoNome) {
        this.modalidadeAplicacaoNome = modalidadeAplicacaoNome;
    }

    public String getElementoCodigo() {
        return elementoCodigo;
    }

    public void setElementoCodigo(String elementoCodigo) {
        this.elementoCodigo = elementoCodigo;
    }

    public String getElementoNome() {
        return elementoNome;
    }

    public void setElementoNome(String elementoNome) {
        this.elementoNome = elementoNome;
    }

    public String getSubelementoCodigo() {
        return subelementoCodigo;
    }

    public void setSubelementoCodigo(String subelementoCodigo) {
        this.subelementoCodigo = subelementoCodigo;
    }

    public String getSubelementoNome() {
        return subelementoNome;
    }

    public void setSubelementoNome(String subelementoNome) {
        this.subelementoNome = subelementoNome;
    }

    public String getFuncaoCodigo() {
        return funcaoCodigo;
    }

    public void setFuncaoCodigo(String funcaoCodigo) {
        this.funcaoCodigo = funcaoCodigo;
    }

    public String getFuncaoNome() {
        return funcaoNome;
    }

    public void setFuncaoNome(String funcaoNome) {
        this.funcaoNome = funcaoNome;
    }

    public String getSubfuncaoCodigo() {
        return subfuncaoCodigo;
    }

    public void setSubfuncaoCodigo(String subfuncaoCodigo) {
        this.subfuncaoCodigo = subfuncaoCodigo;
    }

    public String getSubfuncaoNome() {
        return subfuncaoNome;
    }

    public void setSubfuncaoNome(String subfuncaoNome) {
        this.subfuncaoNome = subfuncaoNome;
    }

    public String getProgramaCodigo() {
        return programaCodigo;
    }

    public void setProgramaCodigo(String programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    public String getProgramaNome() {
        return programaNome;
    }

    public void setProgramaNome(String programaNome) {
        this.programaNome = programaNome;
    }

    public String getAcaoCodigo() {
        return acaoCodigo;
    }

    public void setAcaoCodigo(String acaoCodigo) {
        this.acaoCodigo = acaoCodigo;
    }

    public String getAcaoNome() {
        return acaoNome;
    }

    public void setAcaoNome(String acaoNome) {
        this.acaoNome = acaoNome;
    }

    public String getFonteRecursoCodigo() {
        return fonteRecursoCodigo;
    }

    public void setFonteRecursoCodigo(String fonteRecursoCodigo) {
        this.fonteRecursoCodigo = fonteRecursoCodigo;
    }

    public String getFonteRecursoNome() {
        return fonteRecursoNome;
    }

    public void setFonteRecursoNome(String fonteRecursoNome) {
        this.fonteRecursoNome = fonteRecursoNome;
    }

    public int getEmpenhoAno() {
        return empenhoAno;
    }

    public void setEmpenhoAno(int empenhoAno) {
        this.empenhoAno = empenhoAno;
    }

    public String getEmpenhoModalidadeNome() {
        return empenhoModalidadeNome;
    }

    public void setEmpenhoModalidadeNome(String empenhoModalidadeNome) {
        this.empenhoModalidadeNome = empenhoModalidadeNome;
    }

    public String getEmpenhoModalidadeCodigo() {
        return empenhoModalidadeCodigo;
    }

    public void setEmpenhoModalidadeCodigo(String empenhoModalidadeCodigo) {
        this.empenhoModalidadeCodigo = empenhoModalidadeCodigo;
    }

    public String getEmpenhoNumero() {
        return empenhoNumero;
    }

    public void setEmpenhoNumero(String empenhoNumero) {
        this.empenhoNumero = empenhoNumero;
    }

    public String getSubempenho() {
        return subempenho;
    }

    public void setSubempenho(String subempenho) {
        this.subempenho = subempenho;
    }

    public String getIndicadorSubempenho() {
        return indicadorSubempenho;
    }

    public void setIndicadorSubempenho(String indicadorSubempenho) {
        this.indicadorSubempenho = indicadorSubempenho;
    }

    public String getCredorCodigo() {
        return credorCodigo;
    }

    public void setCredorCodigo(String credorCodigo) {
        this.credorCodigo = credorCodigo;
    }

    public String getCredorNome() {
        return credorNome;
    }

    public void setCredorNome(String credorNome) {
        this.credorNome = credorNome;
    }

    public String getModalidadeLicitacaoCodigo() {
        return modalidadeLicitacaoCodigo;
    }

    public void setModalidadeLicitacaoCodigo(String modalidadeLicitacaoCodigo) {
        this.modalidadeLicitacaoCodigo = modalidadeLicitacaoCodigo;
    }

    public String getModalidadeLicitacaoNome() {
        return modalidadeLicitacaoNome;
    }

    public void setModalidadeLicitacaoNome(String modalidadeLicitacaoNome) {
        this.modalidadeLicitacaoNome = modalidadeLicitacaoNome;
    }

    public BigDecimal getValorEmpenhado() {
        return valorEmpenhado;
    }

    public void setValorEmpenhado(BigDecimal valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public BigDecimal getValorLiquidado() {
        return valorLiquidado;
    }

    public void setValorLiquidado(BigDecimal valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }
}
