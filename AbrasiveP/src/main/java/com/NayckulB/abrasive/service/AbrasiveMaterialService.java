package com.NayckulB.abrasive.service;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;
import com.NayckulB.abrasive.repository.AbrasiveMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AbrasiveMaterialService {
    private final AbrasiveMaterialRepository abrasiveMaterialRepository;
    private AbrasiveMaterial abrasiveMaterial;

    @Autowired
    public AbrasiveMaterialService(AbrasiveMaterialRepository abrasiveMaterialRepository) {
        this.abrasiveMaterialRepository = abrasiveMaterialRepository;
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
}