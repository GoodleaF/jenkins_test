package com.example.k8sex01;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class UserController {

    @GetMapping("/signup")
    public String signup() {
        System.out.println("test3");
        return "test4";
    }
}