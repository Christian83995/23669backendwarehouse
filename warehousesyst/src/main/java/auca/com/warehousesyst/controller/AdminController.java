package auca.com.warehousesyst.controller;

import auca.com.warehousesyst.model.Admin;
import auca.com.warehousesyst.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/admin")

public class AdminController {
    @Autowired
    private AdminRepository adminRepository;
    @GetMapping
    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }



}
