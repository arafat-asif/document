/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Proxy;

/**
 *
 * @author ASIF
 */
@Entity
public class DocumentType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String documentType;

    @Column(name = "description")
    private String description;

    @Column(name = "storage_address")
    private String storageAddress;

    @Column(name = "property_based")
    private boolean propertyBased;

    @Column(name = "allowed_multiple_capture")
    private boolean allowedMultipleCapture;

    @OneToMany(mappedBy = "documentType", cascade = CascadeType.ALL)
    private List<ProfileDocumentMapping> profileMapping;

    @OneToOne(mappedBy = "documentType", cascade = CascadeType.ALL)
    private DocumentPropertyType documentPropertyType; 

    @OneToOne(mappedBy = "documentType", cascade = CascadeType.ALL)
    private Document document; 
    
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

    public List<ProfileDocumentMapping> getProfileMapping() {
        return profileMapping;
    }

    public void setProfileMapping(List<ProfileDocumentMapping> profileMapping) {
        this.profileMapping = profileMapping;
    }

    public DocumentPropertyType getDocumentPropertyType() {
        return documentPropertyType;
    }

    public void setDocumentPropertyType(DocumentPropertyType documentPropertyType) {
        this.documentPropertyType = documentPropertyType;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
