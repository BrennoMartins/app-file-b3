package com.app.financial.b3file.domain.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssetB3 {
    private String produto;
    private String instituicao;
    private String conta;
    private String codigoNegociacao;
    private String cnpjFundo;
    private String codigoIsinDistribuicao;
    private String tipo;
    private String administrador;
    private BigDecimal quantidade;
    private BigDecimal quantidadeDisponivel;
    private BigDecimal quantidadeIndisponivel;
    private String motivo;
    private BigDecimal precoFechamento;
    private BigDecimal valorAtualizado;


}
