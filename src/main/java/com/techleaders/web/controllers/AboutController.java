package com.techleaders.web.controllers;

import com.techleaders.services.AboutService;
import com.techleaders.web.dtos.AboutDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/about")
public class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public AboutDto getInfoAboutApp() {
        return aboutService.getInfoAboutApp();
    }
}
