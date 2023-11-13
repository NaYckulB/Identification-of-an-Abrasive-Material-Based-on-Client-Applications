package com.NayckulB.abrasive.identification;

import org.springframework.stereotype.Component;

@Component
public class AbrasiveMaterial {
    private String name;
    private String application;

    public AbrasiveMaterial() {
    }

    public AbrasiveMaterial(String name, String application) {
        this.name = name;
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "AbrasiveMaterial{" +
                "name='" + name + '\'' +
                ", application='" + application + '\'' +
                '}';
    }
}