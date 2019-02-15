/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.millennium.document.servicetest;

import com.millennium.document.dto.ProfileDTO;
import com.millennium.document.service.ProfileService;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author ARAFAT
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProfileServiceTest {
    
    @Autowired
    private ProfileService profileService;
    
    public ProfileServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void saveOrUpdateProfileTest() throws Exception{
        ProfileDTO profileDTO = new ProfileDTO();
        profileDTO.setName("Arafat");
        profileDTO.setCode("Individual");
        boolean check = profileService.saveOrUpdateProfile(profileDTO);
        assertEquals(true, check);
    }    
    
    @Test
    public void getListOfProfilesTest() throws Exception{
        List<ProfileDTO> profileDTOs = profileService.getListOfProfiles();
        assertNotEquals(0, profileDTOs.size());
    }
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
