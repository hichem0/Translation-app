package com.rizomm.m2.tp.translation.translation.repositories;

import com.rizomm.m2.tp.translation.translation.entities.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends CrudRepository<Application, Integer> {
}



