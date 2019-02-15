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
public class DocumentPropertyTypeDTO {

    private Long id;
    private String propertyName;
    private String propertyLabel;
    private DocumentTypeDTO documentTypeDTO;
    private boolean mandatory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyLabel() {
        return propertyLabel;
    }

    public void setPropertyLabel(String propertyLabel) {
        this.propertyLabel = propertyLabel;
    }

    public DocumentTypeDTO getDocumentTypeDTO() {
        return documentTypeDTO;
    }

    public void setDocumentTypeDTO(DocumentTypeDTO documentTypeDTO) {
        this.documentTypeDTO = documentTypeDTO;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
