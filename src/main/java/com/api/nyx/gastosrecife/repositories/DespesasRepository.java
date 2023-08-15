package com.api.nyx.gastosrecife.repositories;

import com.api.nyx.gastosrecife.models.DespesasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DespesasRepository extends JpaRepository<DespesasModel, UUID> {

    @Query(value = "SELECT ?1 as ano, SUM(valor_empenhado) as empenhado, SUM(valor_liquidado) as liquidado, SUM(valor_pago) as pago FROM despesas WHERE ano_movimentacao = ?1",
            nativeQuery = true)
    List<Object[]> getTotalDespesasByAno(int ano);

    @Query(value = "select ?1 as ano, categoria_economica_codigo,  categoria_economica_nome , sum(valor_empenhado), sum(valor_liquidado),   sum(valor_pago) FROM despesas WHERE ano_movimentacao = ?1 group by categoria_economica_codigo, categoria_economica_nome",
            nativeQuery = true)
    List<Object[]> getTotalDespesasByAnoGroupByCategoriaEconomica(int ano);

    @Query(value = "select ?1 as ano, mes_movimentacao, sum(valor_empenhado), sum(valor_liquidado), sum(valor_pago) FROM despesas d WHERE ano_movimentacao = ?1 group by mes_movimentacao",
            nativeQuery = true)
    List<Object[]> getTotalDespesasByAnoGroupByMesMovimentacao(int ano);
    @Query(value = "select ?1 as ano, fonte_recurso_codigo, fonte_recurso_nome, sum(valor_empenhado), sum(valor_liquidado), sum(valor_pago) FROM despesas d WHERE ano_movimentacao = ?1 group by fonte_recurso_codigo, fonte_recurso_nome",
            nativeQuery = true)
    List<Object[]> getTotalDespesasByAnoGroupByFonteRecurso(int ano);

}
