package com.rizomm.m2.tp.translation.translation.services;
import com.rizomm.m2.tp.translation.translation.entities.Application;
import com.rizomm.m2.tp.translation.translation.repositories.AppRepository;
import com.rizomm.m2.tp.translation.translation.services.imp.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationServiceImp implements ApplicationService {


    @Autowired
    private AppRepository appRepository;


    @Override
    public Application createApp(Application application) {
        application.setId(null);
        return  appRepository.save(application);
    }
}
