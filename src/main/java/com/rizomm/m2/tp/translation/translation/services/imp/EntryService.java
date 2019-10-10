package com.rizomm.m2.tp.translation.translation.services.imp;


import com.rizomm.m2.tp.translation.translation.entities.Entry;
import java.util.Optional;


public interface EntryService {
    Optional<Entry> getEntry(Integer id);
    Entry putEntry(Entry entry);
    void deleteEntry(Integer id);
}
