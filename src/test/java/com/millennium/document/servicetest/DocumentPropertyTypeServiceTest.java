/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.servicetest;

import com.millennium.document.dto.DocumentPropertyTypeDTO;
import com.millennium.document.dto.DocumentTypeDTO;
import com.millennium.document.service.DocumentPropertyTypeService;
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
public class DocumentPropertyTypeServiceTest {

    @Autowired
    private DocumentPropertyTypeService documentPropertyTypeService;

    public DocumentPropertyTypeServiceTest() {
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
    public void saveOrUpdateDocumentPropertyTypeTest() throws Exception {
        DocumentPropertyTypeDTO documentPropertyTypeDTO = new DocumentPropertyTypeDTO();
        DocumentTypeDTO documentTypeDTO = new DocumentTypeDTO();

        documentPropertyTypeDTO.setPropertyName("NID Serial");
        documentPropertyTypeDTO.setPropertyLabel("SL No.");
        documentPropertyTypeDTO.setMandatory(true);
        documentTypeDTO.setId(Long.valueOf(1));
        documentPropertyTypeDTO.setDocumentTypeDTO(documentTypeDTO);

        boolean check = documentPropertyTypeService.saveOrUpdateDocumentPropertyType(documentPropertyTypeDTO);
        assertEquals(true, check);
    }

    @Test
    public void getListOfDocumentPropertyTypesTest() throws Exception {
        List<DocumentPropertyTypeDTO> documentPropertyTypeDTOs = documentPropertyTypeService.getListOfDocumentPropertyTypes();
        assertNotEquals(0, documentPropertyTypeDTOs.size());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
