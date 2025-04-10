package com.example.demo.controller;

import com.example.demo.dto.RequestDTO;
import com.example.demo.dto.ResponseDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @PostMapping("/request")
    public ResponseDTO handleRequest(@Valid @RequestBody RequestDTO request) {
        return new ResponseDTO("Request received", 200);
    }

    @GetMapping("/response")
    public ResponseDTO getResponse() {
        return new ResponseDTO("Success", 200);
    }
}
