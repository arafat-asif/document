
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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author ARAFAT
 */
@Entity
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id")
    private String clientId;

    @OneToOne
    @JoinColumn(name = "document_type")
    private DocumentType documentType;

    @OneToOne
    @JoinColumn(name = "profile")
    private Profile profile;
    
    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentProperty> properties;
    
    @OneToMany(mappedBy = "document", cascade = CascadeType.ALL)
    private List<DocumentFile> files;
    
    @Column(name = "verified")
    private boolean verified;
    
    @Column(name = "verification_details")
    private String verificationDetails;

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

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<DocumentProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<DocumentProperty> properties) {
        this.properties = properties;
    }

    public List<DocumentFile> getFiles() {
        return files;
    }

    public void setFiles(List<DocumentFile> files) {
        this.files = files;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getVerificationDetails() {
        return verificationDetails;
    }

    public void setVerificationDetails(String verificationDetails) {
        this.verificationDetails = verificationDetails;
    }
    
    
}
