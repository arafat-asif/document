/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.controller;

import com.millennium.document.dto.DocumentTypeDTO;
import com.millennium.document.dto.ProfileDTO;
import com.millennium.document.service.DocumentTypeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASIF
 */
@RestController
@RequestMapping(value = "api/document/")
public class DocumentTypeController {

    public static final Logger LOGGER = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private DocumentTypeService documentTypeService;

    @PostMapping("/document-types")
    public ResponseEntity<Boolean> createNewDocumentTypes(@RequestBody DocumentTypeDTO documentTypeDTO) throws Exception {
        return new ResponseEntity<>(documentTypeService.saveOrUpdateDocumentType(documentTypeDTO), HttpStatus.CREATED);
    }

    @GetMapping("/document-types")
    public ResponseEntity<List<DocumentTypeDTO>> getAllDocumentTypes() throws Exception {
        return new ResponseEntity<>(documentTypeService.getListOfDocumentTypes(), HttpStatus.OK);
    }
}
