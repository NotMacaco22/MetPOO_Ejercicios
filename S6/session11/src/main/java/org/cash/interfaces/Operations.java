package org.cash.interfaces;

import java.util.ArrayList;

public interface Operations {

    // Implementing a CRUD
    public void create(Object object);
    public ArrayList<Object> read();
    public void update(Object object);
    public void delete(String cif);

    // Overloading Methods - It's ok in OOP
    public Object search(String value);


}
