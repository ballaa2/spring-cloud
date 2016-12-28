package com.example;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@SpringBootApplication
public class SpringDataRestApplication {

	
	@Bean
    CommandLineRunner runner(PersonRepository rr) {
        return args ->
                Arrays.asList("Aruna,Arghya,Tulasi,Sugata,Viswas".split(","))
                        .forEach(x -> rr.save(new Person(x)));

    }

  	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
}


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository extends PagingAndSortingRepository<Person,Long>
{
	@RestResource(path="by-first-name")
	Collection<Person> findByFirstName(@Param("fn") String rn);
	
}
@Entity
class Person{
	
	public Person()
	{
		
	}
	public  Person(String firstName)
	{
		 this.firstName = firstName;
	}
	@Id @GeneratedValue
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}