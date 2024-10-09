package org.cash.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.cash.interfaces.IFaculty;
import org.cash.models.Faculty;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FacultyDAO implements IFaculty {

    private static final Logger logger = Logger.getLogger(FacultyDAO.class.getName());

    @Override
    public void saveFaculty(Faculty faculty) {
        EntityManager entityManager = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            entityManager.persist(faculty);
            entityManager.getTransaction().commit();
            logger.info("Faculty Saved | Id: " + faculty.getName() + " | Name: " + faculty.getName());
        } catch (Exception e){
            if(entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();}
            logger.severe(e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    @Override
    public Faculty search(String name) {
        EntityManager entityManager = null;
        Faculty faculty = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<Faculty> query = entityManager.createQuery("SELECT f FROM Faculty f WHERE f.name = :name ", Faculty.class);
            query.setParameter("name", name);
            faculty = query.getSingleResult();
        } catch (Exception e){
            logger.severe("Error searching faculty with Name " + name + "\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return faculty;
    }

    @Override
    public Faculty search(Long id) {
        EntityManager entityManager = null;
        Faculty faculty = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<Faculty> query = entityManager.createQuery("SELECT f FROM Faculty f WHERE f.id = :id ", Faculty.class);
            query.setParameter("id", id);
            faculty = query.getSingleResult();
        } catch (Exception e){
            logger.severe("Error searching faculty with Id " + id + "\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return faculty;
    }

    @Override
    public void updateFaculty(Faculty faculty) {
        EntityManager entityManager = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            entityManager.merge(faculty);
            entityManager.getTransaction().commit();
            logger.info("Faculty Updated");
        } catch (Exception e) {
            if(entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();}
            logger.severe("Error updating faculty with Id " + faculty.getId() + "\nError: " + e.getMessage());
        }
    }

    @Override
    public void deleteFaculty(Long id) {
        EntityManager entityManager = null;
        try {
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            Faculty faculty = entityManager.find(Faculty.class, id);
            entityManager.remove(faculty);
            entityManager.getTransaction().commit();
            logger.info("Faculty with Id" + id + " has been deleted.");
        } catch (Exception e) {
            if(entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            logger.severe("Error deleting faculty with Id " + id + "\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }

    }

    @Override
    public List<Faculty> getAllFaculties() {
        EntityManager entityManager = null;
        List<Faculty> faculties = new ArrayList<>();
        try {
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<Faculty> query = entityManager.createQuery("SELECT f FROM Faculty f", Faculty.class);
            faculties = query.getResultList();
        } catch (Exception e){
            logger.severe("Error searching faculty with Id " + "\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        if(faculties.isEmpty()){logger.severe("No Faculty Found");}
        return faculties;
    }
}
