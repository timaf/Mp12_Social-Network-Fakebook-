package at.refugeescode.Mp12_SocialNetworkFakebook.persistance.repository;

import at.refugeescode.Mp12_SocialNetworkFakebook.persistance.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
