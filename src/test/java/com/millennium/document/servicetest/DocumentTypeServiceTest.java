/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.servicetest;

import com.millennium.document.dto.DocumentTypeDTO;
import com.millennium.document.service.DocumentTypeService;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author ASIF
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DocumentTypeServiceTest {

    @Autowired
    private DocumentTypeService documentTypeService;

    public DocumentTypeServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void saveOrUpdateDocumentTypeTest() throws Exception {
        DocumentTypeDTO documentTypeDTO = new DocumentTypeDTO();
        documentTypeDTO.setDocumentType("NID");
        documentTypeDTO.setDescription("National Identification");
        documentTypeDTO.setStorageAddress("C:/hello/id");
        documentTypeDTO.setAllowedMultipleCapture(true);
        documentTypeDTO.setPropertyBased(true);
        boolean check = documentTypeService.saveOrUpdateDocumentType(documentTypeDTO);
        assertEquals(true, check);
    }

    @Test
    public void getListOfDocumentTypesTest() throws Exception{
        List<DocumentTypeDTO> documentTypeDTOs= documentTypeService.getListOfDocumentTypes();
        assertNotEquals(0, documentTypeDTOs.size());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
