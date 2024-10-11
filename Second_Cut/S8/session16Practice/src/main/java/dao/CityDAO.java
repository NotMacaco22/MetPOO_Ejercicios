package dao;

import interfaces.ICity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import models.City;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CityDAO implements ICity {
    private static final Logger LOGGER = Logger.getLogger(CityDAO.class.getName());

    @Override
    public void saveCity(City city) {
        EntityManager entityManager = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            entityManager.persist(city);
            entityManager.getTransaction().commit();
            LOGGER.info("City successfully saved");
        } catch (Exception e){
            if(entityManager != null && entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
            LOGGER.severe("There was an error trying to save the city on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    @Override
    public City searchById(String id) {
        EntityManager entityManager = null;
        City city = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<City> query = entityManager.createQuery("SELECT c FROM City c WHERE c.id = :id", City.class);
            query.setParameter("id", id);
            city = query.getSingleResult();
        } catch (Exception e){
            LOGGER.severe("There was an error trying to get the city on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return city;
    }

    @Override
    public City searchByName(String name) {
        EntityManager entityManager = null;
        City city = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<City> query = entityManager.createQuery("SELECT c FROM City c WHERE c.nameCity = :name", City.class);
            query.setParameter("name", name);
            city = query.getSingleResult();
        } catch (Exception e){
            LOGGER.severe("There was an error trying to get the city on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return city;
    }

    @Override
    public City searchByStatus(boolean status) {
        EntityManager entityManager = null;
        City city = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            TypedQuery<City> query = entityManager.createQuery("SELECT c FROM City c WHERE c.status = :status", City.class);
            query.setParameter("status", status);
            city = query.getSingleResult();
        } catch (Exception e){
            LOGGER.severe("There was an error trying to get the city on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return city;
    }

    @Override
    public void updateCity(City city) {
        EntityManager entityManager = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            entityManager.merge(city);
            entityManager.getTransaction().commit();
            LOGGER.info("City successfully updated");
        } catch (Exception e){
            if(entityManager != null && entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
            LOGGER.severe("There was an error trying to update the city with id " + city.getId() + " on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }

        }
    }

    @Override
    public void deleteCity(String id) {
        EntityManager entityManager = null;
        try{
            entityManager = EntityManagerAdmin.getInstance();
            entityManager.getTransaction().begin();
            City city = entityManager.find(City.class, id);
            entityManager.remove(city);
            entityManager.getTransaction().commit();
            LOGGER.info("City with Id" + id + " successfully deleted");
        } catch (Exception e){
            if(entityManager != null && entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
            }
            LOGGER.severe("There was an error trying to delete the city with id " + id + " on the database\nError: " + e.getMessage());
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
    }

    @Override
    public List<City> getCities() {
        EntityManager entityManager = null;
        List<City> cities = new ArrayList<>();
        try{
            entityManager = EntityManagerAdmin.getInstance();
//            TypedQuery<City> query = entityManager.createQuery("SELECT c.status FROM City c", City.class);
            TypedQuery<City> query = entityManager.createNamedQuery("City.findAll", City.class);
            cities = query.getResultList();
        } catch (Exception e){
            LOGGER.severe("There was an error trying to get the cities");
        } finally {
            if(entityManager != null){
                entityManager.close();
            }
        }
        return cities;
    }
}
