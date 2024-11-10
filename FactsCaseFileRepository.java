package com.app.raghu.repository.caserepository.factscasefiles;

import com.app.raghu.entity.casecirculation.factscasefiles.FactsCaseFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FactsCaseFileRepository extends JpaRepository<FactsCaseFile, Long>  {
    List<FactsCaseFile> findByCaseId(Long caseId);

    List<FactsCaseFile> findByFileId(Long fileId);

    Optional<FactsCaseFile> findByCaseIdAndFileId(Long caseId, Long fileId);
}
