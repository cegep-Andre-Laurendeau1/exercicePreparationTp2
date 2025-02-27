package com.lacouf;

import com.lacouf.repository.ClientRepositoryJPA;
import com.lacouf.service.ClientService;

public class Main {
    public static void main(String[] args) {
        ClientService cs = new ClientService(new ClientRepositoryJPA());

        cs.createClient("Zac", "Bouchard");

        System.out.println(cs.findClient(1));
    }
}