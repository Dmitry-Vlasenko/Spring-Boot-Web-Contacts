package com.dvlasenko.app.SpringBootWebContact.service;

import com.dvlasenko.app.SpringBootWebContact.entity.Contact;
import com.dvlasenko.app.SpringBootWebContact.repository.ContactRepository;
import com.dvlasenko.app.SpringBootWebContact.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public List<Contact> getContact() {
        Iterable<Contact> iterable = repository.findAll();
        List<Contact> list =
                StreamSupport.stream(iterable.spliterator(), false)
                        .map(contact -> new Contact(contact.getId(),
                                Constants.URL_IMAGES + contact.getImg(),
                                contact.getName(),
                                contact.getAddress(),
                                contact.getPhoneNumber()))
                        .toList();
        return new ArrayList<>(list);
    }
}
