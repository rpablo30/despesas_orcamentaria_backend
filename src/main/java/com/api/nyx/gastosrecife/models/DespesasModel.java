package com.api.nyx.gastosrecife.models;



import com.api.nyx.gastosrecife.util.converter.BigDecimalConverter;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "DESPESAS")
public class DespesasModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(description = "Identificador único da despesa", example = "12345678-1234-1234-1234-123456789012")
    private UUID id;

    @Column(name = "ano_movimentacao", nullable = false, length = 4)
    @CsvBindByName(column = "ano_movimentacao")
    @Schema(description = "Ano da movimentação", example = "2017")
    private int anoMovimentacao;
    @Column(name = "mes_movimentacao", nullable = false, length = 2)
    @CsvBindByName(column = "mes_movimentacao")
    @Schema(description = "Mês da movimentação", example = "1")
    private int mesMovimentacao;
    @Column(name = "orgao_codigo", nullable = false, length = 3)
    @CsvBindByName(column = "orgao_codigo")
    @Schema(description = "Código do órgão", example = "10")
    private String orgaoCodigo;
    @Column(name = "orgao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "orgao_nome")
    @Schema(description = "Nome do órgão", example = "GABINETE DO PREFEITO")
    private String orgaoNome;
    @Column(name = "unidade_codigo", nullable = false, length = 6)
    @CsvBindByName(column = "unidade_codigo")
    @Schema(description = "Código da unidade", example = "101")
    private String unidadeCodigo;
    @Column(name = "unidade_nome", nullable = false, length = 150)
    @CsvBindByName(column = "unidade_nome")
    @Schema(description = "Nome da unidade", example = "GABINETE DO PREFEITO")
    private String unidadeNome;
    @Column(name = "categoria_economica_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "categoria_economica_codigo")
    @Schema(description = "Código da categoria econômica", example = "3")
    private String categoriaEconomicaCodigo;
    @Column(name = "categoria_economica_nome", nullable = false, length = 150)
    @CsvBindByName(column = "categoria_economica_nome")
    @Schema(description = "Nome da categoria econômica", example = "DESPESAS CORRENTES")
    private String categoriaEconomicaNome;
    @Column(name = "grupo_despesa_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "grupo_despesa_codigo")
    @Schema(description = "Código do grupo de despesa", example = "1")
    private String grupoDespesaCodigo;
    @Column(name = "grupo_despesa_nome", nullable = false, length = 150)
    @CsvBindByName(column = "grupo_despesa_nome")
    @Schema(description = "Nome do grupo de despesa", example = "PESSOAL E ENCARGOS SOCIAIS")
    private String grupoDespesaNome;
    @Column(name = "modalidade_aplicacao_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "modalidade_aplicacao_codigo")
    @Schema(description = "Código da modalidade de aplicação", example = "90")
    private String modalidadeAplicacaoCodigo;
    @Column(name = "modalidade_aplicacao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "modalidade_aplicacao_nome")
    @Schema(description = "Nome da modalidade de aplicação", example = "RESERVA DE CONTINGÊNCIA")
    private String modalidadeAplicacaoNome;
    @Column(name = "elemento_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "elemento_codigo")
    @Schema(description = "Código do elemento", example = "3")
    private String elementoCodigo;
    @Column(name = "elemento_nome", nullable = false, length = 150)
    @CsvBindByName(column = "elemento_nome")
    @Schema(description = "Nome do elemento", example = "OUTROS SERVIÇOS DE TERCEIROS - PESSOA JURÍDICA")
    private String elementoNome;
    @Column(name = "subelemento_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "subelemento_codigo")
    @Schema(description = "Código do subelemento", example = "4")
    private String subelementoCodigo;
    @Column(name = "subelemento_nome", nullable = false, length = 150)
    @CsvBindByName(column = "subelemento_nome")
    @Schema(description = "Nome do subelemento", example = "SERVIÇOS DE CONSULTORIA")
    private String subelementoNome;
    @Column(name = "funcao_codigo", nullable = false, length = 2)
    @CsvBindByName(column = "funcao_codigo")
    @Schema(description = "Código da função", example = "90")
    private String funcaoCodigo;
    @Column(name = "funcao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "funcao_nome")
    @Schema(description = "Nome da função", example = "RESERVA DE CONTINGÊNCIA")
    private String funcaoNome;
    @Column(name = "subfuncao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "subfuncao_codigo")
    @Schema(description = "Código da subfunção", example = "122")
    private String subfuncaoCodigo;
    @Column(name = "subfuncao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "subfuncao_nome")
    @Schema(description = "Nome da subfunção", example = "ADMINISTRAÇÃO GERAL")
    private String subfuncaoNome;
    @Column(name = "programa_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "programa_codigo")
    @Schema(description = "Código do programa", example = "122")
    private String programaCodigo;
    @Column(name = "programa_nome", nullable = false, length = 150)
    @CsvBindByName(column = "programa_nome")
    @Schema(description = "Nome do programa", example = "ADMINISTRAÇÃO GERAL")
    private String programaNome;
    @Column(name = "acao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "acao_codigo")
    @Schema(description = "Código da ação", example = "122")
    private String acaoCodigo;
    @Column(name = "acao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "acao_nome")
    @Schema(description = "Nome da ação", example = "ADMINISTRAÇÃO GERAL")
    private String acaoNome;
    @Column(name = "fonte_recurso_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "fonte_recurso_codigo")
    @Schema(description = "Código da fonte de recurso", example = "122")
    private String fonteRecursoCodigo;
    @Column(name = "fonte_recurso_nome", nullable = false, length = 150)
    @CsvBindByName(column = "fonte_recurso_nome")
    @Schema(description = "Nome da fonte de recurso", example = "ADMINISTRAÇÃO GERAL")
    private String fonteRecursoNome;
    @Column(name = "empenho_ano", nullable = false, length = 4)
    @CsvBindByName(column = "empenho_ano")
    @Schema(description = "Ano do empenho", example = "2017")
    private int empenhoAno;
    @Column(name = "empenho_modalidade_nome", nullable = false, length = 150)
    @CsvBindByName(column = "empenho_modalidade_nome")
    @Schema(description = "Nome da modalidade do empenho", example = "SEM TIPO INFORMADO")
    private String empenhoModalidadeNome;
    @Column(name = "empenho_modalidade_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "empenho_modalidade_codigo")
    @Schema(description = "Código da modalidade do empenho", example = "0")
    private String empenhoModalidadeCodigo;
    @Column(name = "empenho_numero", nullable = false, length = 6)
    @CsvBindByName(column = "empenho_numero")
    @Schema(description = "Número do empenho", example = "43")
    private String empenhoNumero;
    @Column(name = "subempenho", nullable = false, length = 6)
    @CsvBindByName(column = "subempenho")
    @Schema(description = "Número do Subempenho", example = "43")
    private String subempenho;
    @Column(name = "indicador_subempenho", nullable = false, length = 1)
    @CsvBindByName(column = "indicador_subempenho")
    @Schema(description = "Indicador de subempenho", example = "x")
    private String indicadorSubempenho;
    @Column(name = "credor_codigo", nullable = false, length = 8)
    @CsvBindByName(column = "credor_codigo")
    @Schema(description = "Código do credor", example = "1")
    private String credorCodigo;
    @Column(name = "credor_nome", nullable = false, length = 150)
    @CsvBindByName(column = "credor_nome")
    @Schema(description = "Nome do credor", example = "SEM NOME INFORMADO")
    private String credorNome;
    @Column(name = "modalidade_licitacao_codigo", nullable = false, length = 4)
    @CsvBindByName(column = "modalidade_licitacao_codigo")
    @Schema(description = "Código da modalidade da licitação", example = "0")
    private String modalidadeLicitacaoCodigo;
    @Column(name = "modalidade_licitacao_nome", nullable = false, length = 150)
    @CsvBindByName(column = "modalidade_licitacao_nome")
    @Schema(description = "Nome da modalidade da licitação", example = "SEM MODALIDADE INFORMADA")
    private String modalidadeLicitacaoNome;
    @Column(name = "valor_empenhado", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_empenhado", converter = BigDecimalConverter.class)
    @Schema(description = "Valor empenhado", example = "160613.59")
    private BigDecimal valorEmpenhado;
    @Column(name = "valor_liquidado", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_liquidado", converter = BigDecimalConverter.class)
    @Schema(description = "Valor liquidado", example = "160613.59")
    private BigDecimal valorLiquidado;
    @Column(name = "valor_pago", nullable = false, length = 20)
    @CsvCustomBindByName(column = "valor_pago", converter = BigDecimalConverter.class)
    @Schema(description = "Valor pago", example = "160613.59")
    private BigDecimal valorPago;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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
