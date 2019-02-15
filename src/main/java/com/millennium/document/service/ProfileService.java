/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.service;

import com.millennium.document.dto.ProfileDTO;
import com.millennium.document.entity.Profile;
import com.millennium.document.repository.ProfileRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASIF
 */
@Service
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public boolean saveOrUpdateProfile(ProfileDTO profileDTO) throws DataIntegrityViolationException, Exception {
        Profile profile = new Profile();
        BeanUtils.copyProperties(profileDTO, profile);
        profileRepository.save(profile);
        return true;
    }

    public List<ProfileDTO> getListOfProfiles() throws Exception {
        List<ProfileDTO> profileDTOs = new ArrayList();
        List<Profile> profiles = profileRepository.findAll();
        profiles.stream().forEach((n) -> {
            ProfileDTO profileDTO = new ProfileDTO();
            BeanUtils.copyProperties(n, profileDTO);
            profileDTOs.add(profileDTO);
        });
        return profileDTOs;
    }
}
