package com.app.raghu.controller.casecirculation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.raghu.entity.casecirculation.factscasefiles.FactsCaseFile;
import com.app.raghu.service.caserepository.FactsCaseFileService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/facts_case_files")
public class FactsCaseFileController {
    @Autowired
    private FactsCaseFileService factsCaseFileService;

    @GetMapping
    public List<FactsCaseFile> findAll() {
        return factsCaseFileService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FactsCaseFile> findById(@PathVariable Long id) {
        Optional<FactsCaseFile> factsCaseFile = factsCaseFileService.findById(id);
        if (factsCaseFile.isPresent()) {
            return ResponseEntity.ok(factsCaseFile.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/case_id/{caseId}")
    public List<FactsCaseFile> findByCaseId(@PathVariable Long caseId) {
        return factsCaseFileService.findByCaseId(caseId);
    }

    @GetMapping("/file_id/{fileId}")
    public List<FactsCaseFile> findByFileId(@PathVariable Long fileId) {
        return factsCaseFileService.findByFileId(fileId);
    }

    @PostMapping
    public FactsCaseFile create(@RequestBody FactsCaseFile factsCaseFile) {
        return factsCaseFileService.create(factsCaseFile);
    }

    @PutMapping("/{id}")
    public FactsCaseFile update(@PathVariable Long id, @RequestBody FactsCaseFile factsCaseFile) {
        factsCaseFile.setId(id);
        return factsCaseFileService.update(factsCaseFile);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        factsCaseFileService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
