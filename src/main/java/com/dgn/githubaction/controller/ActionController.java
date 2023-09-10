package com.dgn.githubaction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/action")
public class ActionController {
    @GetMapping
    public ResponseEntity<String> getAction() {
        return new ResponseEntity<>("GitHub Action Version:0.1.0", HttpStatus.OK);
    }
}
