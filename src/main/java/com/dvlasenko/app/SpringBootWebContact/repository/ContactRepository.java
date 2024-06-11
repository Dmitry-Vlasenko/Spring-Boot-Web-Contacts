package com.dvlasenko.app.SpringBootWebContact.repository;

import com.dvlasenko.app.SpringBootWebContact.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
