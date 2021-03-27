package net.ckb78.sattracker.controllers;

import lombok.extern.slf4j.Slf4j;
import net.ckb78.sattracker.services.StService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Slf4j
@Controller
public class StWebController {

    @Autowired
    private StService stService;

    @GetMapping("/")
    public String GetInput(Model model, @ModelAttribute("input") UserInput input) {
        log.info("StWebController - GET: \"/\"");
        input.setSatellite(Satellite.ISS); // Set Default Satellite
        model.addAttribute("url", stService.getEndpoint(input.getSatellite()));
        model.addAttribute("errorMessage","<p>" + stService.getErrorMessage(input.getSatellite()) + "</p>");
        model.addAttribute("satellite", "The International Space Station (ISS)");
        return "tracker";
    }
}
