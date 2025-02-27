package com.lacouf.service;

import com.lacouf.modele.Client;

public record ClientDTO(long id, String firstName, String lastName) {
    public static ClientDTO toDto(Client client) {
        return new ClientDTO(client.getId(), client.getFirstName(), client.getLastName());
    }
}
