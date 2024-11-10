package com.app.raghu.service.caserepository;

import com.app.raghu.entity.casecirculation.factscasefiles.FactsCaseFile;

import java.util.List;
import java.util.Optional;


public interface FactsCaseFileService {
    List<FactsCaseFile> findAll();

    List<FactsCaseFile> findByCaseId(Long caseId);

    List<FactsCaseFile> findByFileId(Long fileId);

    Optional<FactsCaseFile> findById(Long id);

    FactsCaseFile create(FactsCaseFile factsCaseFile);

    FactsCaseFile update(FactsCaseFile factsCaseFile);

    void delete(Long id);
}
