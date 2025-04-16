package com.app.financial.b3file.domain.service;

import com.app.financial.b3file.adapter.dto.InputFileDTO;
import com.app.financial.b3file.domain.model.AssetB3;
import org.springframework.stereotype.Service;

@Service
public class AssetB3Service {

    public AssetB3 convertAssetB3(InputFileDTO inputFileDTO) {
        return AssetB3.builder()
                .produto(inputFileDTO.getProduto())
                .instituicao(inputFileDTO.getInstituicao())
                .conta(inputFileDTO.getConta())
                .codigoNegociacao(inputFileDTO.getCodigoNegociacao())
                .cnpjFundo(inputFileDTO.getCnpjFundo())
                .codigoIsinDistribuicao(inputFileDTO.getCodigoIsinDistribuicao())
                .tipo(inputFileDTO.getTipo())
                .administrador(inputFileDTO.getAdministrador())
                .quantidade(inputFileDTO.getQuantidade())
                .quantidadeDisponivel(inputFileDTO.getQuantidadeDisponivel())
                .quantidadeIndisponivel(inputFileDTO.getQuantidadeIndisponivel())
                .motivo(inputFileDTO.getMotivo())
                .precoFechamento(inputFileDTO.getPrecoFechamento())
                .valorAtualizado(inputFileDTO.getValorAtualizado())
                .build();
    }

}
