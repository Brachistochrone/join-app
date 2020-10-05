package com.techleaders.services;

import com.techleaders.web.dtos.AboutDto;
import org.springframework.stereotype.Component;

@Component
public class AboutService {

    public AboutDto getInfoAboutApp() {
        return new AboutDto("Join", "1.0-SNAPSHOT", "Tech Leaders V");
    }
}
