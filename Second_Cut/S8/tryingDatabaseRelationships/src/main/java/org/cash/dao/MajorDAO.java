package org.cash.dao;

import jakarta.persistence.EntityManager;
import org.cash.interfaces.IMajor;
import org.cash.models.Faculty;
import org.cash.models.Major;

import java.util.List;
import java.util.logging.Logger;

public class MajorDAO implements IMajor {

    private static final Logger logger = Logger.getLogger(MajorDAO.class.getName());

    @Override
    public void saveMajor(Major major) {
        EntityManager entityManager = null;
        try {
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            entityManager.persist(major);
            entityManager.getTransaction().commit();
            logger.info("Student with Id: " + major.getId() + " saved successfully");
        } catch (Exception e) {
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            logger.info("Error saving Major with Id: " + major.getId() + "\nError: " + e.getMessage());
        }
    }

    @Override
    public Faculty search(Long id) {
        return null;
    }

    @Override
    public Faculty search(String name) {
        return null;
    }

    @Override
    public void updateMajor(Major major) {

    }

    @Override
    public void deleteMajor(Long id) {

    }

    @Override
    public List<Faculty> getAllMajors() {
        return List.of();
    }
}
