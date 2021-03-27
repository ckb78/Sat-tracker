package net.ckb78.sattracker.controllers;

import lombok.extern.slf4j.Slf4j;
import net.ckb78.sattracker.services.StService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/position")
public class StPosController {

    @Autowired
    private StService positionService;

    @CrossOrigin
    @GetMapping("/iss") // ISS Location. Add more locations later!
    public SatelliteDto getIssLocation() {
        log.info("StPosController - GET /position/iss");
        return positionService.getSatelliteLocation(Satellite.ISS);
    }
}
