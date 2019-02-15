/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.controller;

import com.millennium.document.dto.ProfileDTO;
import com.millennium.document.service.ProfileService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ARAFAT
 */
@RestController
@RequestMapping(value = "api/document/")
public class ProfileController {

    public static final Logger LOGGER = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private ProfileService profileService;

    @PostMapping("/profiles")
    public ResponseEntity<Boolean> createNewProfile(@RequestBody ProfileDTO profileDTO) throws Exception {
        return new ResponseEntity<>(profileService.saveOrUpdateProfile(profileDTO), HttpStatus.CREATED);
    }

    @GetMapping("/profiles")
    public ResponseEntity<List<ProfileDTO>> getAllProfiles() throws Exception {
        return new ResponseEntity<>(profileService.getListOfProfiles(), HttpStatus.OK);
    }
}
