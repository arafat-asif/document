/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.dto;

/**
 *
 * @author ARAFAT
 */
public class DocumentPropertyDTO {

    private Long id;
    private String clientId;
    private DocumentDTO documentDTO;
    private DocumentPropertyTypeDTO documentPropertyTypeDTO;
    private String propertyValue;
    private String propertyName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public DocumentDTO getDocumentDTO() {
        return documentDTO;
    }

    public void setDocumentDTO(DocumentDTO documentDTO) {
        this.documentDTO = documentDTO;
    }

    public DocumentPropertyTypeDTO getDocumentPropertyTypeDTO() {
        return documentPropertyTypeDTO;
    }

    public void setDocumentPropertyTypeDTO(DocumentPropertyTypeDTO documentPropertyTypeDTO) {
        this.documentPropertyTypeDTO = documentPropertyTypeDTO;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
