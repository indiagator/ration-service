package com.egov.rationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class RationServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication application = new SpringApplication(RationServiceApplication.class);
        // Set the active profile programmatically
        application.setAdditionalProfiles("dev");
        application.run(args);
    }

}
