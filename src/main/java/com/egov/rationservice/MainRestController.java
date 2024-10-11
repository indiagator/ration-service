package com.egov.rationservice;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Social Service", description = "Social Service APIs")
@RestController
@RequestMapping("/api/v1")
public class MainRestController
{

    @Value("${server.port}")
    String serverport;

    private static final Logger log = LoggerFactory.getLogger(MainRestController.class);


    @GetMapping("get/ration/details")
    public ResponseEntity<String> getRationDetails()
    {
        log.info("Request Received from the SOCIAL-SERVICE");
        // MAKE THE LOGIC MORE RELEVANT
        log.info("Response sent back to SOCIAL_SERVICE from the RATION-SERVICE");
        return ResponseEntity.ok("Ration Details for Citizen with CitizenID: HGDF6734");
    }

    @GetMapping("getServerPort")
    public ResponseEntity<String> getServicePort()
    {
        return ResponseEntity.ok(serverport);
    }


}
