package com.NayckulB.abrasive.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;
import org.junit.jupiter.api.Test;

public class AbrasiveMaterialServiceTest {

    @Test
    void testSetAndGetAbrasiveMaterial() {
        AbrasiveMaterialService abrasiveMaterialService = new AbrasiveMaterialService(null);
        AbrasiveMaterial material = new AbrasiveMaterial();
        abrasiveMaterialService.setAbrasiveMaterial(material);
        AbrasiveMaterial retrievedMaterial = abrasiveMaterialService.getAbrasiveMaterial();
        
        assertNotNull(retrievedMaterial, "The retrieved material should not be null.");
        assertEquals(material, retrievedMaterial, "The set and retrieved materials should be the same.");
    }
}