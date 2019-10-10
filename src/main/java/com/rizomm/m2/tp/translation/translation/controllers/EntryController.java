package com.rizomm.m2.tp.translation.translation.controllers;
import com.rizomm.m2.tp.translation.translation.entities.Entry;
import com.rizomm.m2.tp.translation.translation.entities.Translation;
import com.rizomm.m2.tp.translation.translation.services.imp.EntryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/applications/{id}/translations/{id}/entries")
public class EntryController {
//    public static final Logger logger = LoggerFactory.getLogger();

    @Autowired
    EntryService entryService;


    @GetMapping(path="/{id}")
    public ResponseEntity getEntity(@PathVariable Integer id )
    {
        Optional<Entry> entry = entryService.getEntry(id);
        if(entry.isPresent()){

            return ResponseEntity.ok(entry.get());

        }

        return ResponseEntity.notFound().build();

    }

    @PutMapping(path="/{id}")
    public ResponseEntity putEntity(@RequestBody @Valid Entry entry , @PathVariable Integer id){
        Optional<Entry> getEntry = entryService.getEntry(id);
        if(getEntry.isPresent()){
            entry.setId(id);
//            return new ResponseEntity<>(entryService.putEntry(entry), HttpStatus.CREATED);
            return ResponseEntity.ok(entryService.putEntry(entry));
        }
        return null;
    }


    @DeleteMapping(path="/{id}")
    public ResponseEntity deleteEntry(@PathVariable Integer id){

        Optional<Entry> getEntry = entryService.getEntry(id);
        if (!getEntry.isPresent()){

            return new ResponseEntity(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);



    }
}
