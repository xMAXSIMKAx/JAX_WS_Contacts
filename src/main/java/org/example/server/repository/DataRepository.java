package org.example.server.repository;

import org.example.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact(1, "Tom", 111111111));
        list.add(new Contact(2, "Alice", 676344343));
        list.add(new Contact(3, "Bob", 344354354));
        return list;
    }
}
