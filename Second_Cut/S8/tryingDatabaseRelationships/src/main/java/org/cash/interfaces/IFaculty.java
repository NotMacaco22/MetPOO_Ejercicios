package org.cash.interfaces;

import org.cash.models.Faculty;
import java.util.List;

public interface IFaculty {

    // CRUD
    public void saveFaculty(Faculty faculty);   // Create (On Database)
    public Faculty search(Long id);      // Read
    public Faculty search(String name);      // Read
    public void updateFaculty(Faculty faculty); // Update
    public void deleteFaculty(Long id); // Delete

    public List<Faculty> getAllFaculties();

}
