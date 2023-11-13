package com.NayckulB.abrasive;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class AbrasiveMaterialApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AbrasiveMaterialApplication.class, args);

        // Obțineți instanțele componentelor din context
        AbrasiveMaterial abrasiveMaterial = context.getBean(AbrasiveMaterial.class);
        ClientApplication clientApplication = context.getBean(ClientApplication.class);
        AbrasiveMaterialService abrasiveMaterialService = context.getBean(AbrasiveMaterialService.class);
        AbrasiveMaterialRepository abrasiveMaterialRepository = context.getBean(AbrasiveMaterialRepository.class);

        // Afișați informații despre obiecte
        System.out.println(abrasiveMaterial);
        System.out.println(clientApplication);
        System.out.println(abrasiveMaterialService);
        System.out.println(abrasiveMaterialRepository);
    }
}

class AbrasiveMaterial {
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
  
class ClientApplication {
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
  
class AbrasiveMaterialService {
    private AbrasiveMaterial abrasiveMaterial;

    public AbrasiveMaterialService(AbrasiveMaterial abrasiveMaterial) {
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
        return "AbrasiveMaterialService{" +
                "abrasiveMaterial=" + abrasiveMaterial +
                '}';
    }
}

	 class AbrasiveMaterialRepository {
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
