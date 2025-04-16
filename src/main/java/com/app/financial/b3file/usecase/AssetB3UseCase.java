package com.app.financial.b3file.usecase;

import com.app.financial.b3file.adapter.InputFileDataB3;
import com.app.financial.b3file.domain.model.AssetB3;
import com.app.financial.b3file.domain.service.AssetB3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssetB3UseCase {

    @Autowired
    private AssetB3Service assetB3Service;

    public List<AssetB3> getAllAssetB3(){
        List<AssetB3> lisAssetB3 = new ArrayList<>();

        new InputFileDataB3().readFileDataB3()
                .forEach(a -> {
                    lisAssetB3.add(assetB3Service.convertAssetB3(a));
                });

        return lisAssetB3;
    }

}
