// AbrasiveMaterialRepository.java
package com.NayckulB.abrasive.repository;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;

public class AbrasiveMaterialRepository {
    private AbrasiveMaterial abrasiveMaterial;

    public AbrasiveMaterialRepository(AbrasiveMaterial abrasiveMaterial) {
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
        return "AbrasiveMaterialRepository{" +
                "abrasiveMaterial=" + abrasiveMaterial +
                '}';
    }
    // Methods for access to abrasive data
}