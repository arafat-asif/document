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
public class DocumentFileDTO {

    private Long id;
    private String uuid;
    private DocumentDTO documentDTO;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public DocumentDTO getDocument() {
        return documentDTO;
    }

    public void setDocument(DocumentDTO document) {
        this.documentDTO = document;
    }
}
