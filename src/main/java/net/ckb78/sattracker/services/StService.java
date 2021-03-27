package net.ckb78.sattracker.services;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import net.ckb78.sattracker.controllers.IssDto;
import net.ckb78.sattracker.controllers.Satellite;
import net.ckb78.sattracker.controllers.SatelliteDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StService {

    private static final String ERROR = "Error connecting to external API for " ;

    private final RestTemplate rt = new RestTemplate();

    @HystrixCommand(fallbackMethod = "connectionError")
    public SatelliteDto getSatelliteLocation(Satellite satellite) {
        return rt.getForObject(getEndpoint(satellite), IssDto.class);
    }

    public String getEndpoint(Satellite satellite) {
        return satellite.endpoint;
    }

    public SatelliteDto connectionError(Satellite satellite) {
        SatelliteDto satelliteDto = new SatelliteDto();
        satelliteDto.setMessage(getErrorMessage(satellite));
        return satelliteDto;
    }

    public String getErrorMessage(Satellite satellite) {
        return ERROR + satellite + ": " + getEndpoint(satellite);
    }
}