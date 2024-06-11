package com.dvlasenko.app.SpringBootWebTours.repository;

import com.dvlasenko.app.SpringBootWebTours.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
