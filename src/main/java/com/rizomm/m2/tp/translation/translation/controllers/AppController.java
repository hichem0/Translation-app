package com.rizomm.m2.tp.translation.translation.controllers;

import com.rizomm.m2.tp.translation.translation.entities.Application;
import com.rizomm.m2.tp.translation.translation.services.imp.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/applications")

public class AppController {

    @Autowired
    private ApplicationService applicationService;

//    @GetMapping
//    public ResponseEntity getAllApp(){
//
//        return ResponseEntity.ok(applicationService.findAll());
//
//    }
    @PostMapping
    public ResponseEntity createApp(@RequestBody @Valid Application application){

        return new ResponseEntity<>(applicationService.createApp(application), HttpStatus.CREATED);
    }

}
