package com.example.demo.controller;

import com.example.demo.Dto.ApiResponse;
import com.example.demo.Dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ResponseController {

    @GetMapping("/api/users/{id}")
    public ApiResponse<ResponseDTO> getUser(@PathVariable int id) {
        Map<String, String> userData = new HashMap<>();
        userData.put("name", "Suhrobbek Erkinov");
        userData.put("email", "s.erkinov@newuu.uz");

        ResponseDTO responseDTO = new ResponseDTO(
                "User retrieved successfully",
                200,
                userData
        );

        return new ApiResponse<>(responseDTO);
    }
}
