package com.BloodDonation.Centre.repository;

public class CentreNotFoundException extends Exception {

    public CentreNotFoundException(long id) {
        super(String.format("Centre is not found with id : '%s'", id));
    }
}
