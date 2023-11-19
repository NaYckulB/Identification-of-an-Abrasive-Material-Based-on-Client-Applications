package com.NayckulB.abrasive.identification;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AbrasiveMaterial abrasiveMaterialBean() {
        return new AbrasiveMaterial("NumeMaterial", "NumeAplicatie");
    }

    @Bean
    public ClientApplication clientApplication(@Qualifier("abrasiveMaterialBean") AbrasiveMaterial abrasiveMaterial) {
        return new ClientApplication("NumeClient", abrasiveMaterial);
    }
}