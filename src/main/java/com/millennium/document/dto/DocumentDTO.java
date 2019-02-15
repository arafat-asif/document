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
public class DocumentDTO {

    private Long id;
    private String clientId;
    private DocumentTypeDTO documentTypeDTO;
    private ProfileDTO profileDTO;
    private boolean verified;
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

    public DocumentTypeDTO getDocumentType() {
        return documentTypeDTO;
    }

    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentTypeDTO = documentType;
    }

    public ProfileDTO getProfile() {
        return profileDTO;
    }

    public void setProfile(ProfileDTO profile) {
        this.profileDTO = profile;
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
