package com.NayckulB.abrasive.repository;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;
import org.springframework.stereotype.Repository;

@Repository
public class AbrasiveMaterialRepository {
    private AbrasiveMaterial abrasiveMaterial;

    public AbrasiveMaterialRepository() {
    }

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
}