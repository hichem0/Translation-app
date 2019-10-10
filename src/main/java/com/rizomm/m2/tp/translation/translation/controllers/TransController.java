package com.rizomm.m2.tp.translation.translation.controllers;

import com.rizomm.m2.tp.translation.translation.entities.Application;
import com.rizomm.m2.tp.translation.translation.entities.Translation;
import com.rizomm.m2.tp.translation.translation.services.imp.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/applications/{id}/translations")
public class TransController {
    @Autowired
    private TranslationService translationService;

    @PostMapping
    public ResponseEntity createTrans(@RequestBody @Valid Translation translation){

        return new ResponseEntity<>(translationService.createTrans(translation), HttpStatus.CREATED);

    }

}
