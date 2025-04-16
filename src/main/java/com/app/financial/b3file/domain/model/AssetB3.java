package com.app.financial.b3file.domain.model;

import lombok.*;

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
    private String quantidade;
    private String quantidadeDisponivel;
    private String quantidadeIndisponivel;
    private String motivo;
    private String precoFechamento;
    private String valorAtualizado;

}
