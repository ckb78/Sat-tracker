package net.ckb78.sattracker.controllers;

import lombok.Data;

@Data
public class IssDto extends SatelliteDto{
    private IssPosition iss_position;
    private long timestamp;
}
