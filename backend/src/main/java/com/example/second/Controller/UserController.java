package com.example.second.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @GetMapping("data")
    public String returndata()
    {
        return "asdkfj;lsd";
    }

}
