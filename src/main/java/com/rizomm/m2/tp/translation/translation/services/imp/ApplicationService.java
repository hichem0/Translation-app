package com.rizomm.m2.tp.translation.translation.services.imp;

import com.rizomm.m2.tp.translation.translation.entities.Application;
import org.springframework.stereotype.Service;

@Service
public interface ApplicationService {
    Application createApp (Application application);
}
