package com.lacouf.exception;


import jakarta.persistence.RollbackException;

public class DuplicateEntityException extends Exception {
    public DuplicateEntityException(RollbackException e) {
    }
}
