package org.cash.interfaces;

import org.cash.models.Faculty;
import org.cash.models.Major;

import java.util.List;

public interface IMajor {

    // CRUD
    public void saveMajor(Major major);   // Create (On Database)
    public Faculty search(Long id);      // Read
    public Faculty search(String name);      // Read
    public void updateMajor(Major major); // Update
    public void deleteMajor(Long id); // Delete

    public List<Faculty> getAllMajors();

}
