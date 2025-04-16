package com.app.financial.b3file.domain.service;

import com.app.financial.b3file.adapter.dto.InputFileDTO;
import com.app.financial.b3file.domain.model.AssetB3;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AssetB3Service {

    public AssetB3 convertAssetB3(InputFileDTO inputFileDTO) {

        return AssetB3.builder()
                .produto(inputFileDTO.getProduto().trim())
                .instituicao(inputFileDTO.getInstituicao())
                .conta(inputFileDTO.getConta())
                .codigoNegociacao(inputFileDTO.getCodigoNegociacao())
                .cnpjFundo(inputFileDTO.getCnpjFundo())
                .codigoIsinDistribuicao(inputFileDTO.getCodigoIsinDistribuicao())
                .tipo(inputFileDTO.getTipo())
                .administrador(inputFileDTO.getAdministrador())
                .quantidade(new BigDecimal(inputFileDTO.getQuantidade()))
                .quantidadeDisponivel(new BigDecimal(inputFileDTO.getQuantidadeDisponivel()))
                //.quantidadeIndisponivel(new BigDecimal(inputFileDTO.getQuantidadeIndisponivel().replace("-","")))
                .quantidadeIndisponivel(new BigDecimal(0))
                .motivo(inputFileDTO.getMotivo())
                .precoFechamento(new BigDecimal(inputFileDTO.getPrecoFechamento()))
                .valorAtualizado(new BigDecimal(inputFileDTO.getValorAtualizado()))
                .build();
    }

}
