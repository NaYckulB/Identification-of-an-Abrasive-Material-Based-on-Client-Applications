// ClientApplication.java
package com.NayckulB.abrasive.identification;

public class ClientApplication {
    private String name;

    public ClientApplication(String name) {
        this.name = name;
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