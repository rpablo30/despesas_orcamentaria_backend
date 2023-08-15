package com.api.nyx.gastosrecife;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.api.nyx.gastosrecife.controllers.DespesasController;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByAnoDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByCategoriaDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByFonteDto;
import com.api.nyx.gastosrecife.dtos.TotalDespesasByMesDto;
import com.api.nyx.gastosrecife.models.DespesasModel;
import com.api.nyx.gastosrecife.repositories.DespesasRepository;
import com.api.nyx.gastosrecife.services.DespesasService;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class DespesasControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private DespesasService service;


    @Test
    public void postDeveCadastrarDespesa() throws Exception {

        DespesasModel despesasModel = new DespesasModel();
        despesasModel.setAcaoCodigo("10");
        despesasModel.setAcaoNome("GABINETE DO PREFEITO");
        when(service.save(Mockito.any())).thenReturn(despesasModel);
        this.mockMvc.perform(post("/despesas")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                        {
                        "anoMovimentacao":2018,
                        "mesMovimentacao":3,
                        "orgaoCodigo":"10",
                        "orgaoNome":"GABINETE DO PREFEITO",
                        "unidadeCodigo":"10.01",
                        "unidadeNome":"GABINETE DO PREFEITO - ADMINISTRAÇÃO DIRETA",
                        "categoriaEconomicaCodigo":"3",
                        "categoriaEconomicaNome":"DESPESAS CORRENTES",
                        "grupoDespesaCodigo":"1",
                        "grupoDespesaNome":"PESSOAL E ENCARGOS SOCIAIS",
                        "modalidadeAplicacaoCodigo":"90",
                        "modalidadeAplicacaoNome":"APLICAÇÕES DIRETAS",
                        "elementoCodigo":"11",
                        "elementoNome": "VENCIMENTOS E VANTAGENS FIXAS - PESSOAL CIVIL",
                        "subelementoCodigo": "1",
                        "subelementoNome": "VENCIMENTOS E SALÁRIOS",
                        "funcaoCodigo": "4",
                        "funcaoNome": "ADMINISTRAÇÃO",
                        "subfuncaoCodigo": "122",
                        "subfuncaoNome": "ADMINISTRAÇÃO GERAL",
                        "programaCodigo": "2160",
                        "programaNome": "GESTÃO DAS POLÍTICAS MUNICIPAIS",
                        "acaoCodigo": "2064",
                        "acaoNome": "ASSESSORAMENTO GOVERNAMENTAL",
                        "fonteRecursoCodigo": "100",
                        "fonteRecursoNome": "RECURSOS ORDINÁRIOS - NÃO VINCULADOS",
                        "empenhoAno": 2018,
                        "empenhoModalidadeNome": "SEM TIPO INFORMADO",
                        "empenhoModalidadeCodigo": "0",
                        "empenhoNumero": "43",
                        "subempenho": "83",
                        "indicadorSubempenho": "x",
                        "credorCodigo": "0",
                        "credorNome": "CREDOR NÃO INFORMADO",
                        "modalidadeLicitacaoCodigo": "0",
                        "modalidadeLicitacaoNome": "NÃO INFORMADA",
                        "valorEmpenhado":160613.59,
                        "valorLiquidado":160613.59,
                        "valorPago":160613.59
                        }
                        """))
                .andDo(print()).andExpect(status().isCreated())
                .andExpect(content().string(containsString("\"id\":")));
    }
    @Test
    public void postDeveFalharComDadosInvalidos() throws Exception {

        when(service.save(Mockito.any())).thenReturn(new DespesasModel());
        this.mockMvc.perform(post("/despesas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}"))
                .andDo(print()).andExpect(status().isBadRequest());
    }
    @Test
    public void getTotalDespesasByAnoDeveRetornar() throws Exception {

        List<TotalDespesasByAnoDto> retorno = List.of(new TotalDespesasByAnoDto());
        when(service.getTotalDespesasByAno(2017)).thenReturn(retorno);
        this.mockMvc.perform(get("/despesas/2017/total")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"ano\":0,\"empenho\":null,\"liquidacao\":null,\"pagamento\":null}]")));

    }
    @Test
    public void getTotalDespesasByAnoGroupByFonteRecursoDeveRetornar() throws Exception {

        List<TotalDespesasByFonteDto> retorno = List.of(new TotalDespesasByFonteDto());
        when(service.getTotalDespesasByAnoGroupByFonteRecurso(2017)).thenReturn(retorno);
        this.mockMvc.perform(get("/despesas/2017/fonte")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"ano\":0,\"empenho\":null,\"liquidacao\":null,\"pagamento\":null,\"fonteCodigo\":null,\"fonteNome\":null}]")));

    }
    @Test
    public void getTotalDespesasByAnoGroupByCategoriaEconomicaDeveRetornar() throws Exception {

        List<TotalDespesasByCategoriaDto> retorno = List.of(new TotalDespesasByCategoriaDto());
        when(service.getTotalDespesasByAnoGroupByCategoriaEconomica(2017)).thenReturn(retorno);
        this.mockMvc.perform(get("/despesas/2017/categoria")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"ano\":0,\"empenho\":null,\"liquidacao\":null,\"pagamento\":null,\"categoriaCodigo\":null,\"categoriaNome\":null}]")));

    }
    @Test
    public void getTotalDespesasByAnoGroupByMesMovimentacaoDeveRetornar() throws Exception {

        List<TotalDespesasByMesDto> retorno = List.of(new TotalDespesasByMesDto());
        when(service.getTotalDespesasByAnoGroupByMesMovimentacao(2017)).thenReturn(retorno);
        this.mockMvc.perform(get("/despesas/2017/mes")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("[{\"ano\":0,\"mes\":0,\"empenho\":null,\"liquidacao\":null,\"pagamento\":null}]")));

    }
}
