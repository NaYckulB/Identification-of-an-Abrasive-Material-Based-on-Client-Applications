// AbrasiveMaterialService.java
package com.NayckulB.abrasive.service;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;

public class AbrasiveMaterialService {
    private AbrasiveMaterial abrasiveMaterial;

    public AbrasiveMaterialService(AbrasiveMaterial abrasiveMaterial) {
        this.abrasiveMaterial = abrasiveMaterial;
    }

    public AbrasiveMaterial getAbrasiveMaterial() {
        return abrasiveMaterial;
    }

    public void setAbrasiveMaterial(AbrasiveMaterial abrasiveMaterial) {
        this.abrasiveMaterial = abrasiveMaterial;
    }

    @Override
    public String toString() {
        return "AbrasiveMaterialService{" +
                "abrasiveMaterial=" + abrasiveMaterial +
                '}';
    }
    // Methods for handling abrasive materials
}