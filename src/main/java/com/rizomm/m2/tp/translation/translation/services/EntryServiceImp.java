package com.rizomm.m2.tp.translation.translation.services;

        import com.rizomm.m2.tp.translation.translation.entities.Entry;
        import com.rizomm.m2.tp.translation.translation.repositories.EntryRepository;
        import com.rizomm.m2.tp.translation.translation.services.imp.EntryService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.persistence.Id;
        import java.util.Optional;

@Service
public class EntryServiceImp implements EntryService {


    @Autowired
    private EntryRepository entryRepository;

    @Override
    public  Optional<Entry> getEntry(Integer id){
        return entryRepository.findById(id);

    }



    @Override
    public Entry putEntry(Entry entry) {
        return  entryRepository.save(entry);

    }

    @Override
    public void deleteEntry(Integer id) {

        entryRepository.deleteById(id);
    }



}
