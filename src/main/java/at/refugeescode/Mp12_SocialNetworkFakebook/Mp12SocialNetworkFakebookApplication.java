package at.refugeescode.Mp12_SocialNetworkFakebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mp12SocialNetworkFakebookApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mp12SocialNetworkFakebookApplication.class, args);
	}
}

/*Mp12 - Social Network (Fakebook) (Person and Friends) [oneToMany]
		The app will have an entity called Person that can be managed through the /persons endpoint.
		 Post will add a person, get will show all of them.
		 In order to friend one person with another, the endpoint /persons/{id1}/friend/{id2} will be used.
		  In order to unfriend we will use the endpoint /persons/{id1}/unfriend/{id2}.*/
