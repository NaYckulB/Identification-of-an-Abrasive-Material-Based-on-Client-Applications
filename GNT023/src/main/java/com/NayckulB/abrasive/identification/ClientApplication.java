package com.NayckulB.abrasive.identification;

import org.springframework.stereotype.Component;

@Component
public class ClientApplication {
    private String name;

    public ClientApplication() {
    }

    public ClientApplication(String name) {
        this.name = name;
    }

    public ClientApplication(String string, AbrasiveMaterial abrasiveMaterial) {
		
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClientApplication{" +
                "name='" + name + '\'' +
                '}';
    }
}