/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.repository;

import com.millennium.document.entity.DocumentFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ARAFAT
 */
@Repository
public interface DocumentFileRepository extends JpaRepository<DocumentFile, Long>{
    
}
