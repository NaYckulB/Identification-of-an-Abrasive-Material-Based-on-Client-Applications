package com.NayckulB.abrasive.identification;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    // Adaugă această adnotare pentru a indica că acesta este bean-ul principal
    @Bean
    @Primary
    AbrasiveMaterial abrasiveMaterialBean() {
        return new AbrasiveMaterial("NumeMaterial", "NumeAplicatie");
    }

    @Bean
    ClientApplication clientApplication(@Qualifier("abrasiveMaterialBean") AbrasiveMaterial abrasiveMaterial) {
        return new ClientApplication("NumeClient", abrasiveMaterial);
    }
}