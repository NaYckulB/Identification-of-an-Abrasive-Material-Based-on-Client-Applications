// AbrasiveMaterialApplication.java
package com.NayckulB.abrasive;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;
import com.NayckulB.abrasive.identification.ClientApplication;
import com.NayckulB.abrasive.service.AbrasiveMaterialService;
import com.NayckulB.abrasive.repository.AbrasiveMaterialRepository;

public class AbrasiveMaterialApplication {
    public static void main(String[] args) {
        // Crearea unui material abraziv
        AbrasiveMaterial abrasiveMaterial = new AbrasiveMaterial("Material 1", "Aplicatie 1");
        System.out.println(abrasiveMaterial);

        // Crearea unei aplicatii client
        ClientApplication clientApplication = new ClientApplication("Aplicatie Client 1");
        System.out.println(clientApplication);

        // Crearea unui serviciu pentru materialul abraziv
        AbrasiveMaterialService abrasiveMaterialService = new AbrasiveMaterialService(abrasiveMaterial);
        System.out.println(abrasiveMaterialService);

        // Crearea unui depozit pentru materialul abraziv
        AbrasiveMaterialRepository abrasiveMaterialRepository = new AbrasiveMaterialRepository(abrasiveMaterial);
        System.out.println(abrasiveMaterialRepository);
    }
}