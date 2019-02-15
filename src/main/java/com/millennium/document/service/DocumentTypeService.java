/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.service;

import com.millennium.document.dto.DocumentTypeDTO;
import com.millennium.document.entity.DocumentType;
import com.millennium.document.repository.DocumentTypeRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASIF
 */
@Service
public class DocumentTypeService {

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    public boolean saveOrUpdateDocumentType(DocumentTypeDTO documentTypeDTO) throws DataIntegrityViolationException, Exception {
        DocumentType documentType = new DocumentType();
        BeanUtils.copyProperties(documentTypeDTO, documentType);
        documentTypeRepository.save(documentType);
        return true;
    }

    public List<DocumentTypeDTO> getListOfDocumentTypes() throws Exception {
        List<DocumentTypeDTO> documentTypeDTOs = new ArrayList();
        List<DocumentType> documentTypes = documentTypeRepository.findAll();
        documentTypes.stream().forEach((n) -> {
            DocumentTypeDTO documentTypeDTO = new DocumentTypeDTO();
            BeanUtils.copyProperties(n, documentTypeDTO);
            documentTypeDTOs.add(documentTypeDTO);
        });
        return documentTypeDTOs;
    }
}
