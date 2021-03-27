package net.ckb78.sattracker.controllers;

public enum Satellite {
    ISS("http://api.open-notify.org/iss-now.json");

    public final String endpoint;

    private Satellite(String endpoint) {
        this.endpoint = endpoint;
    }
}
