package at.refugeescode.Mp12_SocialNetworkFakebook.endpoint;

import at.refugeescode.Mp12_SocialNetworkFakebook.persistance.model.Person;
import at.refugeescode.Mp12_SocialNetworkFakebook.persistance.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonEndpoint {

    private PersonRepository personRepository;


    public PersonEndpoint(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    List<Person> getAll(){
        return   personRepository.findAll();

    }


    @PostMapping
    Person createPerson(@RequestBody Person person){
        return personRepository.save(person);
    }

    @PutMapping(value = "/{id1}/friend/{id2}")
    Person friendPerson(@PathVariable Long id1,@PathVariable Long id2 ) {
        Optional <Person> thePerson = personRepository.findById(id1);
        Optional <Person> theFriend = personRepository.findById(id2);
        if (!thePerson.isPresent() || !theFriend.isPresent()) {
            return null;
        }
        thePerson.get().getFriends().add(theFriend.get());
        personRepository.save(thePerson.get());
        return thePerson.get();
    }

    @PutMapping(value = "/{id1}/unfriend/{id2}")
    Person unfriendPerson(@PathVariable Long id1,@PathVariable Long id2){
        Optional <Person> thePerson = personRepository.findById(id1);
        Optional <Person> theFriend = personRepository.findById(id2);
        if (!thePerson.isPresent() || !theFriend.isPresent()) {
            return null;
        }
        thePerson.get().getFriends().remove(theFriend.get());
        personRepository.save(thePerson.get());
        return thePerson.get();
    }
}
