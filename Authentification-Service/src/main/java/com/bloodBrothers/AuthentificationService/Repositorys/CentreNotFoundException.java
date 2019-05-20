package com.bloodBrothers.AuthentificationService.Repositorys;

public class CentreNotFoundException extends Exception {

    public CentreNotFoundException(long id) {
        super(String.format("Centre is not found with id : '%s'", id));
    }

    public CentreNotFoundException(String name) {
        super(String.format("Centre is not found with name :"+ name));
    }
}
