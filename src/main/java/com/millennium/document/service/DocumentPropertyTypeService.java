/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.service;

import com.millennium.document.dto.DocumentPropertyTypeDTO;
import com.millennium.document.entity.DocumentPropertyType;
import com.millennium.document.repository.DocumentPropertyTypeRepository;
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
public class DocumentPropertyTypeService {
        @Autowired
    private DocumentPropertyTypeRepository documentPropertyTypeRepository;

    public boolean saveOrUpdateDocumentPropertyType(DocumentPropertyTypeDTO documentPropertyTypeDTO) throws DataIntegrityViolationException, Exception {
        DocumentPropertyType documentPropertyType = new DocumentPropertyType();
        BeanUtils.copyProperties(documentPropertyTypeDTO, documentPropertyType);
        documentPropertyTypeRepository.save(documentPropertyType);
        return true;
    }

    public List<DocumentPropertyTypeDTO> getListOfDocumentPropertyTypes() throws Exception {
        List<DocumentPropertyTypeDTO> documentPropertyTypeDTOs = new ArrayList<>();
        List<DocumentPropertyType> documentPropertyTypes = documentPropertyTypeRepository.findAll();
        documentPropertyTypes.stream().forEach((n) -> {
            DocumentPropertyTypeDTO documentPropertyTypeDTO = new DocumentPropertyTypeDTO();
            BeanUtils.copyProperties(n, documentPropertyTypeDTO);
            documentPropertyTypeDTOs.add(documentPropertyTypeDTO);
        });
        return documentPropertyTypeDTOs;
    }
}
