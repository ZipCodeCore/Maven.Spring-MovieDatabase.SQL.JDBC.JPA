package io.zipcoder.persistenceapp.service;

import io.zipcoder.persistenceapp.domain.Person;
import org.h2.engine.Database;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public interface PersonService {
    List<Person> getCarByMake(String make);

    void deleteCar(int id);

    void deleteCars(List<Person> cars);

    Iterable<Person> getSalesPackages();

    Iterable<Person> getSalesPackagesForYear(String year);

    void addCar(Person person);

//    POST /people -- create a person
//    PUT /people/{id} -- update person with id. 404 error if that person doesn't exist yet
//    GET /people/{id} -- get the person with the specified ID
//    DELETE /people/{id} -- Delete the person with the specified ID
//    GET /people -- get all people in the database
//    GET /people/reverselookup/{mobileNumber} -- find all people with the specified mobile number
//    GET /people/surname/{lastName} -- Find all people with a particular last name
//    GET /people/surname -- Get the result of the surname report above
//    GET /people/firstname/stats -- Get the report of first name frequencies

}
