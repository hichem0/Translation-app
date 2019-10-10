package com.rizomm.m2.tp.translation.translation.services;

import com.rizomm.m2.tp.translation.translation.entities.Translation;
import com.rizomm.m2.tp.translation.translation.repositories.TransRepository;
import com.rizomm.m2.tp.translation.translation.services.imp.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TranslationServiceImp implements TranslationService {

    @Autowired
    private TransRepository transRepository;

    @Override
    public Translation createTrans(Translation translation) {
        translation.setId(null);
        return  transRepository.save(translation);
    }

}
