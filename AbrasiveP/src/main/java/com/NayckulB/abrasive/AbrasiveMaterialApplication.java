package com.NayckulB.abrasive;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.NayckulB.abrasive.identification.AbrasiveMaterial;
import com.NayckulB.abrasive.identification.ClientApplication;
import com.NayckulB.abrasive.repository.AbrasiveMaterialRepository;
import com.NayckulB.abrasive.service.AbrasiveMaterialService;

import org.springframework.stereotype.Repository;

@SpringBootApplication
public class AbrasiveMaterialApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AbrasiveMaterialApplication.class, args);
  
        AbrasiveMaterial abrasiveMaterial = context.getBean(AbrasiveMaterial.class);
        ClientApplication clientApplication = context.getBean(ClientApplication.class);
        AbrasiveMaterialService abrasiveMaterialService = context.getBean(AbrasiveMaterialService.class);
        AbrasiveMaterialRepository abrasiveMaterialRepository = context.getBean(AbrasiveMaterialRepository.class);
     
        System.out.println(abrasiveMaterial);
        System.out.println(clientApplication);
        System.out.println(abrasiveMaterialService);
        System.out.println(abrasiveMaterialRepository);
    }
}
