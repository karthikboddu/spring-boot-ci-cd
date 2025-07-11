package com.springboot_aws.springboot_aws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @GetMapping("/blogs")
    public ResponseEntity<List<Long>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            List<Long> tutorials = new ArrayList<>();

            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
