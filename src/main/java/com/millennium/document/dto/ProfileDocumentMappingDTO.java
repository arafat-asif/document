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
public class ProfileDocumentMappingDTO {

    private Long id;
    private ProfileDTO profileDTO;
    private DocumentTypeDTO documentTypeDTO;
    private boolean mandatory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfileDTO getProfileDTO() {
        return profileDTO;
    }

    public void setProfileDTO(ProfileDTO profileDTO) {
        this.profileDTO = profileDTO;
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
