package pl.coderslab.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Institution;
import pl.coderslab.repository.InstitutionRepository;
import pl.coderslab.service.InstitutionService;

import java.util.List;

@Service
public class InstitutionServiceImpl implements InstitutionService {

    @Autowired
    InstitutionRepository institutionRepository;

    @Override
    public List<Institution> findAll() {
        return institutionRepository.findAll();
    }
}
