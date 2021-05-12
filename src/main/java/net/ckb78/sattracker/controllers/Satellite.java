package net.ckb78.sattracker.controllers;

/**
* The Satellite class allows to add as many satelites as wanted.
* Add new satelite as a valued enum below ISS. 
* Then create a DTO that corresponds to the JSON from the API. 
*/

public enum Satellite {
    ISS("http://api.open-notify.org/iss-now.json");

    public final String endpoint;

    private Satellite(String endpoint) {
        this.endpoint = endpoint;
    }
}
