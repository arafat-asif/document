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
public class DocumentTypeDTO {

    private Long id;
    private String documentType;
    private String description;
    private String storageAddress;
    private boolean propertyBased;
    private boolean allowedMultipleCapture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }

    public boolean isPropertyBased() {
        return propertyBased;
    }

    public void setPropertyBased(boolean propertyBased) {
        this.propertyBased = propertyBased;
    }

    public boolean isAllowedMultipleCapture() {
        return allowedMultipleCapture;
    }

    public void setAllowedMultipleCapture(boolean allowedMultipleCapture) {
        this.allowedMultipleCapture = allowedMultipleCapture;
    }
}
