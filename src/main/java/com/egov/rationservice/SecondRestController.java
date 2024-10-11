package com.egov.rationservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class SecondRestController {

    @GetMapping("get/ration/details/{citizenid}")
    public ResponseEntity<Integer> getRationDetails(@PathVariable("citizenid") String citizenid)
    {
        return ResponseEntity.ok(78);
    }

}
