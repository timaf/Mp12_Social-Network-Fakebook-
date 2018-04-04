package at.refugeescode.Mp12_SocialNetworkFakebook.persistance.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private  String name;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Person> friends = new HashSet <>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set <Person> getFriends() {
        return friends;
    }

    public void setFriends(Set <Person> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", friends=" + friends +
                '}';
    }
}
