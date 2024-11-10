package com.app.raghu.service.caserepository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.raghu.entity.casecirculation.factscasefiles.FactsCaseFile;
import com.app.raghu.repository.caserepository.factscasefiles.FactsCaseFileRepository;
import com.app.raghu.service.caserepository.FactsCaseFileService;

import java.util.List;
import java.util.Optional;

@Service
public class FactsCaseFileServiceImpl implements FactsCaseFileService {
    @Autowired
    private FactsCaseFileRepository factsCaseFileRepository;

    @Override
    public List<FactsCaseFile> findAll() {
        return factsCaseFileRepository.findAll();
    }

    @Override
    public List<FactsCaseFile> findByCaseId(Long caseId) {
        return factsCaseFileRepository.findByCaseId(caseId);
    }

    @Override
    public List<FactsCaseFile> findByFileId(Long fileId) {
        return factsCaseFileRepository.findByFileId(fileId);
    }

    @Override
    public Optional<FactsCaseFile> findById(Long id) {
        return factsCaseFileRepository.findById(id);
    }

    @Override
    public FactsCaseFile create(FactsCaseFile factsCaseFile) {
        return factsCaseFileRepository.save(factsCaseFile);
    }

    @Override
    public FactsCaseFile update(FactsCaseFile factsCaseFile) {
        return factsCaseFileRepository.save(factsCaseFile);
    }

    @Override
    public void delete(Long id) {
        factsCaseFileRepository.deleteById(id);
    }
}
