package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {

    private static final String PERSISTENCE = "session16Practice";

    private static EntityManager instance;

    public EntityManagerAdmin() {
    }

    public static EntityManager getInstance() {
        if (instance == null || !instance.isOpen()) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE);
            instance = entityManagerFactory.createEntityManager();
        }
        return instance;
    }

}