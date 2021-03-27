package net.ckb78.sattracker.controllers;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserInput {
    private Satellite satellite; // So that user can choose which satellite to track.
    private String endpoint;  // Maybe not here?
    private String color; // So that user can choose color of marker
}
