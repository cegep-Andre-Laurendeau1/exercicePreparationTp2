package com.lacouf.service;

import com.lacouf.exception.DuplicateEntityException;
import com.lacouf.modele.Client;
import com.lacouf.repository.ClientRepositoryJPA;

import java.math.BigDecimal;

public class ClientService {
    private final ClientRepositoryJPA clientRepository;

    public ClientService(ClientRepositoryJPA clientRepository) {
        this.clientRepository = clientRepository;
    }


    public void createClient(String firstName, String lastName) {
        try {
            clientRepository.save(new Client(firstName, lastName));
        } catch (DuplicateEntityException e) {
            System.out.println("Customer already exists");
        }
    }

    public ClientDTO findClient(long id) {
        Client client = clientRepository.find(id);
        return ClientDTO.toDto(client);
    }

    public void ajouteProduit(String description, BigDecimal prix) {

    }
}
