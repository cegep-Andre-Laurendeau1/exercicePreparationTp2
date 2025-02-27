package com.lacouf.repository;

import com.lacouf.exception.DuplicateEntityException;
import com.lacouf.modele.Client;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.RollbackException;

public class ClientRepositoryJPA implements ClientRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("orders.pu");

    @Override
    public void save(Client client) throws DuplicateEntityException {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(client);
            em.getTransaction().commit();
        } catch(RollbackException e) {
            throw new DuplicateEntityException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client find(long id) {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            Client client = em.find(Client.class, id);
            em.getTransaction().commit();
            return client;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
