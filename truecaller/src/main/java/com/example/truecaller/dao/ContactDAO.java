package com.example.truecaller.dao;

import com.example.truecaller.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ContactDAO {
    private final Map<Long, Contact> contactDatabase = new HashMap<>();

    private Long idCounter = 1L;

    private Contact save(Contact contact) {
        contact.setId(idCounter++);
        contactDatabase.put(contact.getId(), contact);
        return contact;
    }

    public Contact findByPhoneNumber(String phoneNumber) {
        for (Contact contact : contactDatabase.values()) {
            if(contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }
}
