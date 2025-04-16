package com.app.financial.b3file.controller;

import com.app.financial.b3file.domain.model.AssetB3;
import com.app.financial.b3file.domain.service.AssetB3Service;
import com.app.financial.b3file.usecase.AssetB3UseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("app/b3")
public class B3Controller {

    @Autowired
    private AssetB3UseCase assetB3UseCase;

    @GetMapping("assets")
    public ResponseEntity<List<AssetB3>> getAllAssetB3(){
        return ResponseEntity.ok(assetB3UseCase.getAllAssetB3());
    }
}
